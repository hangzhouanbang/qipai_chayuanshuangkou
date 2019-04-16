package com.anbang.qipai.chayuanshuangkou.cqrs.c.domain.result;

import com.anbang.qipai.chayuanshuangkou.cqrs.c.domain.ChayuanShuangkouChaixianbufen;
import com.anbang.qipai.chayuanshuangkou.cqrs.c.domain.ChayuanShuangkouGongxianFen;
import com.anbang.qipai.chayuanshuangkou.cqrs.c.domain.ChayuanShuangkouMingcifen;

public class ChayuanShuangkouPanPlayerResult {
	private String playerId;
	private boolean chaodi;
	private ChayuanShuangkouMingcifen mingcifen;
	private int xianshubeishu;
	private ChayuanShuangkouGongxianFen gongxianfen;
	private ChayuanShuangkouChaixianbufen bufen;
	private int score;// 一盘结算分
	private int totalScore;// 总分

	public String getPlayerId() {
		return playerId;
	}

	public void setPlayerId(String playerId) {
		this.playerId = playerId;
	}

	public boolean isChaodi() {
		return chaodi;
	}

	public void setChaodi(boolean chaodi) {
		this.chaodi = chaodi;
	}

	public ChayuanShuangkouMingcifen getMingcifen() {
		return mingcifen;
	}

	public void setMingcifen(ChayuanShuangkouMingcifen mingcifen) {
		this.mingcifen = mingcifen;
	}

	public int getXianshubeishu() {
		return xianshubeishu;
	}

	public void setXianshubeishu(int xianshubeishu) {
		this.xianshubeishu = xianshubeishu;
	}

	public ChayuanShuangkouGongxianFen getGongxianfen() {
		return gongxianfen;
	}

	public void setGongxianfen(ChayuanShuangkouGongxianFen gongxianfen) {
		this.gongxianfen = gongxianfen;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public int getTotalScore() {
		return totalScore;
	}

	public void setTotalScore(int totalScore) {
		this.totalScore = totalScore;
	}

	public ChayuanShuangkouChaixianbufen getBufen() {
		return bufen;
	}

	public void setBufen(ChayuanShuangkouChaixianbufen bufen) {
		this.bufen = bufen;
	}

}
