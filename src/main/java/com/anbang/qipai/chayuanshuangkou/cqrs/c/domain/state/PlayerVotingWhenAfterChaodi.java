package com.anbang.qipai.chayuanshuangkou.cqrs.c.domain.state;

import com.dml.mpgame.game.player.GamePlayerState;

public class PlayerVotingWhenAfterChaodi implements GamePlayerState {

	public static final String name = "PlayerVotingWhenAfterChaodi";

	@Override
	public String name() {
		return name;
	}

}
