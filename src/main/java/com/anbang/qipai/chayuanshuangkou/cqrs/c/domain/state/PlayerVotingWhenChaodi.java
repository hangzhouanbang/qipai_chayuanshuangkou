package com.anbang.qipai.chayuanshuangkou.cqrs.c.domain.state;

import com.dml.mpgame.game.player.GamePlayerState;

public class PlayerVotingWhenChaodi implements GamePlayerState {

	public static final String name = "PlayerVotingWhenChaodi";

	@Override
	public String name() {
		return name;
	}

}
