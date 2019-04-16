package com.anbang.qipai.chayuanshuangkou.cqrs.q.dbo;

import java.util.ArrayList;
import java.util.List;

import com.anbang.qipai.chayuanshuangkou.cqrs.c.domain.result.ChayuanShuangkouPanPlayerResult;
import com.anbang.qipai.chayuanshuangkou.cqrs.c.domain.result.ChayuanShuangkouPanResult;
import com.dml.shuangkou.pan.PanActionFrame;

public class PanResultDbo {
	private String id;
	private String gameId;
	private int panNo;
	private boolean chaodi;
	private List<WenzhouShuangkouPanPlayerResultDbo> playerResultList;
	private long finishTime;
	private PanActionFrame panActionFrame;
	private PukeGameInfoDbo pukeGameInfoDbo;

	public PanResultDbo() {
	}

	public PanResultDbo(String gameId, ChayuanShuangkouPanResult panResult) {
		this.gameId = gameId;
		panNo = panResult.getPan().getNo();
		this.chaodi = panResult.isChaodi();
		playerResultList = new ArrayList<>();
		for (ChayuanShuangkouPanPlayerResult playerResult : panResult.getPanPlayerResultList()) {
			WenzhouShuangkouPanPlayerResultDbo dbo = new WenzhouShuangkouPanPlayerResultDbo();
			dbo.setPlayerId(playerResult.getPlayerId());
			dbo.setPlayerResult(playerResult);
			dbo.setPlayer(panResult.findPlayer(playerResult.getPlayerId()));
			playerResultList.add(dbo);
		}
		finishTime = panResult.getPanFinishTime();
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

	public int getPanNo() {
		return panNo;
	}

	public void setPanNo(int panNo) {
		this.panNo = panNo;
	}

	public boolean isChaodi() {
		return chaodi;
	}

	public void setChaodi(boolean chaodi) {
		this.chaodi = chaodi;
	}

	public List<WenzhouShuangkouPanPlayerResultDbo> getPlayerResultList() {
		return playerResultList;
	}

	public void setPlayerResultList(List<WenzhouShuangkouPanPlayerResultDbo> playerResultList) {
		this.playerResultList = playerResultList;
	}

	public long getFinishTime() {
		return finishTime;
	}

	public void setFinishTime(long finishTime) {
		this.finishTime = finishTime;
	}

	public PanActionFrame getPanActionFrame() {
		return panActionFrame;
	}

	public void setPanActionFrame(PanActionFrame panActionFrame) {
		this.panActionFrame = panActionFrame;
	}

	public PukeGameInfoDbo getPukeGameInfoDbo() {
		return pukeGameInfoDbo;
	}

	public void setPukeGameInfoDbo(PukeGameInfoDbo pukeGameInfoDbo) {
		this.pukeGameInfoDbo = pukeGameInfoDbo;
	}

}
