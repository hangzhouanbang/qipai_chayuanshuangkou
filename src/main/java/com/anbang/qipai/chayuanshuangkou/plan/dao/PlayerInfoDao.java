package com.anbang.qipai.chayuanshuangkou.plan.dao;

import com.anbang.qipai.chayuanshuangkou.plan.bean.PlayerInfo;

public interface PlayerInfoDao {

	PlayerInfo findById(String playerId);

	void save(PlayerInfo playerInfo);
}
