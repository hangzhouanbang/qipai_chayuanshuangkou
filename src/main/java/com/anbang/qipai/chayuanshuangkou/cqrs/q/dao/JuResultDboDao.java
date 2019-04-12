package com.anbang.qipai.chayuanshuangkou.cqrs.q.dao;

import com.anbang.qipai.chayuanshuangkou.cqrs.q.dbo.JuResultDbo;

public interface JuResultDboDao {

	void save(JuResultDbo juResultDbo);

	JuResultDbo findByGameId(String gameId);

}
