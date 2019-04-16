package com.anbang.qipai.chayuanshuangkou.cqrs.c.domain.result;

import java.util.List;

import com.dml.shuangkou.pan.PanResult;

public class ChayuanShuangkouPanResult extends PanResult {
	private boolean chaodi;
	private List<ChayuanShuangkouPanPlayerResult> panPlayerResultList;

	public boolean isChaodi() {
		return chaodi;
	}

	public void setChaodi(boolean chaodi) {
		this.chaodi = chaodi;
	}

	public List<ChayuanShuangkouPanPlayerResult> getPanPlayerResultList() {
		return panPlayerResultList;
	}

	public void setPanPlayerResultList(List<ChayuanShuangkouPanPlayerResult> panPlayerResultList) {
		this.panPlayerResultList = panPlayerResultList;
	}

}
