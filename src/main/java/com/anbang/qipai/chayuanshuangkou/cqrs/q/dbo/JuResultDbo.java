package com.anbang.qipai.chayuanshuangkou.cqrs.q.dbo;

import com.anbang.qipai.chayuanshuangkou.cqrs.c.domain.result.ChayuanShuangkouJuResult;

public class JuResultDbo {

	private String id;
	private String gameId;
	private PanResultDbo lastPanResult;
	private ChayuanShuangkouJuResult juResult;
	private long finishTime;

	public JuResultDbo() {
	}

	public JuResultDbo(String gameId, PanResultDbo lastPanResult, ChayuanShuangkouJuResult juResult) {
		this.gameId = gameId;
		this.lastPanResult = lastPanResult;
		this.juResult = juResult;
		finishTime = System.currentTimeMillis();
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getGameId() {
		return gameId;
	}

	public void setGameId(String gameId) {
		this.gameId = gameId;
	}

	public PanResultDbo getLastPanResult() {
		return lastPanResult;
	}

	public void setLastPanResult(PanResultDbo lastPanResult) {
		this.lastPanResult = lastPanResult;
	}

	public ChayuanShuangkouJuResult getJuResult() {
		return juResult;
	}

	public void setJuResult(ChayuanShuangkouJuResult juResult) {
		this.juResult = juResult;
	}

	public long getFinishTime() {
		return finishTime;
	}

	public void setFinishTime(long finishTime) {
		this.finishTime = finishTime;
	}

}
