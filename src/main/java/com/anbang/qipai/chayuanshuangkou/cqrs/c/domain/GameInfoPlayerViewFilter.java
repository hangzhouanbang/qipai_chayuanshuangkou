package com.anbang.qipai.chayuanshuangkou.cqrs.c.domain;

import com.anbang.qipai.chayuanshuangkou.cqrs.q.dbo.GameLatestPukeGameInfoDbo;
import com.anbang.qipai.chayuanshuangkou.cqrs.q.dbo.PukeGameInfoDbo;

public class GameInfoPlayerViewFilter {

	public PukeGameInfoDbo filter(String playerId, GameLatestPukeGameInfoDbo info) {
		PukeGameInfoDbo gameInfo = info.getPukeGameInfoDbo();
		// List<PukeGamePlayerInfoDbo> playerInfos = new ArrayList<>();
		// for (PukeGamePlayerInfoDbo playerInfo : gameInfo.getPlayerInfos()) {
		// if (playerInfo.getPlayerId().equals(playerId)) {
		// playerInfos.add(playerInfo);
		// }
		// }
		// gameInfo.setPlayerInfos(playerInfos);
		return gameInfo;
	}
}
