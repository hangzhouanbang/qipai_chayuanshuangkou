package com.anbang.qipai.chayuanshuangkou.msg.msjobj;

import java.util.ArrayList;
import java.util.List;

import com.anbang.qipai.chayuanshuangkou.cqrs.q.dbo.PanResultDbo;
import com.anbang.qipai.chayuanshuangkou.cqrs.q.dbo.PukeGameDbo;
import com.anbang.qipai.chayuanshuangkou.cqrs.q.dbo.WenzhouShuangkouPanPlayerResultDbo;

public class PukeHistoricalPanResult {

	private String gameId;

	private int no;// 盘数

	private long finishTime;

	private List<ChayuanShuangkouPanPlayerResultMO> playerResultList;

	public PukeHistoricalPanResult() {

	}

	public PukeHistoricalPanResult(PanResultDbo panResultDbo, PukeGameDbo pukeGameDbo) {
		List<WenzhouShuangkouPanPlayerResultDbo> list = panResultDbo.getPlayerResultList();
		if (list != null) {
			playerResultList = new ArrayList<>(list.size());
			list.forEach((panPlayerResult) -> playerResultList.add(new ChayuanShuangkouPanPlayerResultMO(
					pukeGameDbo.findPlayer(panPlayerResult.getPlayerId()), panPlayerResult)));
		}
		gameId = pukeGameDbo.getId();
		no = panResultDbo.getPanNo();
		finishTime = panResultDbo.getFinishTime();
	}

	public String getGameId() {
		return gameId;
	}

	public void setGameId(String gameId) {
		this.gameId = gameId;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public long getFinishTime() {
		return finishTime;
	}

	public void setFinishTime(long finishTime) {
		this.finishTime = finishTime;
	}

	public List<ChayuanShuangkouPanPlayerResultMO> getPlayerResultList() {
		return playerResultList;
	}

	public void setPlayerResultList(List<ChayuanShuangkouPanPlayerResultMO> playerResultList) {
		this.playerResultList = playerResultList;
	}
}
