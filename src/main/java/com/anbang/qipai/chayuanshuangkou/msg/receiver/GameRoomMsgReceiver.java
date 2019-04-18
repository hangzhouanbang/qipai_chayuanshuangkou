package com.anbang.qipai.chayuanshuangkou.msg.receiver;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;

import com.anbang.qipai.chayuanshuangkou.cqrs.c.domain.PukeGameValueObject;
import com.anbang.qipai.chayuanshuangkou.cqrs.c.service.GameCmdService;
import com.anbang.qipai.chayuanshuangkou.cqrs.q.dbo.JuResultDbo;
import com.anbang.qipai.chayuanshuangkou.cqrs.q.dbo.PukeGameDbo;
import com.anbang.qipai.chayuanshuangkou.cqrs.q.dbo.PukeGamePlayerDbo;
import com.anbang.qipai.chayuanshuangkou.cqrs.q.service.PukeGameQueryService;
import com.anbang.qipai.chayuanshuangkou.cqrs.q.service.PukePlayQueryService;
import com.anbang.qipai.chayuanshuangkou.msg.channel.GameRoomSink;
import com.anbang.qipai.chayuanshuangkou.msg.msjobj.CommonMO;
import com.anbang.qipai.chayuanshuangkou.msg.msjobj.PukeHistoricalJuResult;
import com.anbang.qipai.chayuanshuangkou.msg.service.ChayuanShuangkouGameMsgService;
import com.anbang.qipai.chayuanshuangkou.msg.service.ChayuanShuangkouResultMsgService;
import com.dml.mpgame.game.player.GamePlayerOnlineState;
import com.google.gson.Gson;

@EnableBinding(GameRoomSink.class)
public class GameRoomMsgReceiver {

	@Autowired
	private GameCmdService gameCmdService;

	@Autowired
	private PukeGameQueryService pukeGameQueryService;

	@Autowired
	private PukePlayQueryService pukePlayQueryService;

	@Autowired
	private ChayuanShuangkouResultMsgService chayuanShuangkouResultMsgService;

	@Autowired
	private ChayuanShuangkouGameMsgService chayuanShuangkouGameMsgService;

	private Gson gson = new Gson();

	@StreamListener(GameRoomSink.WENZHOUSHUANGKOUGAMEROOM)
	public void removeGameRoom(CommonMO mo) {
		String msg = mo.getMsg();
		String json = gson.toJson(mo.getData());
		if ("gameIds".equals(msg)) {
			List<String> gameIds = gson.fromJson(json, ArrayList.class);
			for (String gameId : gameIds) {
				try {
					PukeGameDbo pukeGameDbo = pukeGameQueryService.findPukeGameDboById(gameId);
					boolean playerOnline = false;
					for (PukeGamePlayerDbo player : pukeGameDbo.getPlayers()) {
						if (GamePlayerOnlineState.online.equals(player.getOnlineState())) {
							playerOnline = true;
						}
					}
					if (playerOnline) {
						chayuanShuangkouGameMsgService.delay(gameId);
					} else {
						PukeGameValueObject gameValueObject = gameCmdService.finishGameImmediately(gameId);
						pukeGameQueryService.finishGameImmediately(gameValueObject);
						JuResultDbo juResultDbo = pukePlayQueryService.findJuResultDbo(gameId);
						PukeHistoricalJuResult juResult = new PukeHistoricalJuResult(juResultDbo, pukeGameDbo);
						chayuanShuangkouResultMsgService.recordJuResult(juResult);
						chayuanShuangkouGameMsgService.gameFinished(gameId);
					}
				} catch (Throwable e) {
					e.printStackTrace();
				}
			}
		}
	}

}
