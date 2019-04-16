package com.anbang.qipai.chayuanshuangkou.cqrs.q.dbo;

import com.anbang.qipai.chayuanshuangkou.cqrs.c.domain.result.ChayuanShuangkouPanPlayerResult;
import com.dml.shuangkou.player.ShuangkouPlayerValueObject;

public class WenzhouShuangkouPanPlayerResultDbo {

	private String playerId;
	private ChayuanShuangkouPanPlayerResult playerResult;
	private ShuangkouPlayerValueObject player;

	public String getPlayerId() {
		return playerId;
	}

	public void setPlayerId(String playerId) {
		this.playerId = playerId;
	}

	public ChayuanShuangkouPanPlayerResult getPlayerResult() {
		return playerResult;
	}

	public void setPlayerResult(ChayuanShuangkouPanPlayerResult playerResult) {
		this.playerResult = playerResult;
	}

	public ShuangkouPlayerValueObject getPlayer() {
		return player;
	}

	public void setPlayer(ShuangkouPlayerValueObject player) {
		this.player = player;
	}

}
