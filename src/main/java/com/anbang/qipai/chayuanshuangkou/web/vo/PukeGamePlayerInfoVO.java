package com.anbang.qipai.chayuanshuangkou.web.vo;

import com.anbang.qipai.chayuanshuangkou.cqrs.q.dbo.PukeGamePlayerInfoDbo;

public class PukeGamePlayerInfoVO {
	private String playerId;
	private int gongxianfen;
	private int detal;
	private int maxXianshu;
	private int otherMaxXianshu;
	private boolean nopai;
	private int mingci;

	public PukeGamePlayerInfoVO() {

	}

	public PukeGamePlayerInfoVO(PukeGamePlayerInfoDbo dbo) {
		playerId = dbo.getPlayerId();
		gongxianfen = dbo.getGongxianfen();
		detal = dbo.getDetal();
		maxXianshu = dbo.getMaxXianshu();
		otherMaxXianshu = dbo.getOtherMaxXianshu();
		nopai = dbo.isNopai();
		mingci = dbo.getMingci();
	}

	public String getPlayerId() {
		return playerId;
	}

	public void setPlayerId(String playerId) {
		this.playerId = playerId;
	}

	public int getGongxianfen() {
		return gongxianfen;
	}

	public void setGongxianfen(int gongxianfen) {
		this.gongxianfen = gongxianfen;
	}

	public int getMaxXianshu() {
		return maxXianshu;
	}

	public void setMaxXianshu(int maxXianshu) {
		this.maxXianshu = maxXianshu;
	}

	public int getOtherMaxXianshu() {
		return otherMaxXianshu;
	}

	public void setOtherMaxXianshu(int otherMaxXianshu) {
		this.otherMaxXianshu = otherMaxXianshu;
	}

	public boolean isNopai() {
		return nopai;
	}

	public void setNopai(boolean nopai) {
		this.nopai = nopai;
	}

	public int getMingci() {
		return mingci;
	}

	public void setMingci(int mingci) {
		this.mingci = mingci;
	}

	public int getDetal() {
		return detal;
	}

	public void setDetal(int detal) {
		this.detal = detal;
	}

}
