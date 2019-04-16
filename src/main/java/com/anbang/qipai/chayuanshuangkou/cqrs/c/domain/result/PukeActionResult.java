package com.anbang.qipai.chayuanshuangkou.cqrs.c.domain.result;

import com.anbang.qipai.chayuanshuangkou.cqrs.c.domain.PukeGameValueObject;
import com.dml.shuangkou.pan.PanActionFrame;

public class PukeActionResult {
	private PukeGameValueObject pukeGame;
	private PanActionFrame panActionFrame;
	private ChayuanShuangkouPanResult panResult;
	private ChayuanShuangkouJuResult juResult;

	public PukeGameValueObject getPukeGame() {
		return pukeGame;
	}

	public void setPukeGame(PukeGameValueObject pukeGame) {
		this.pukeGame = pukeGame;
	}

	public PanActionFrame getPanActionFrame() {
		return panActionFrame;
	}

	public void setPanActionFrame(PanActionFrame panActionFrame) {
		this.panActionFrame = panActionFrame;
	}

	public ChayuanShuangkouPanResult getPanResult() {
		return panResult;
	}

	public void setPanResult(ChayuanShuangkouPanResult panResult) {
		this.panResult = panResult;
	}

	public ChayuanShuangkouJuResult getJuResult() {
		return juResult;
	}

	public void setJuResult(ChayuanShuangkouJuResult juResult) {
		this.juResult = juResult;
	}

}
