package com.anbang.qipai.chayuanshuangkou.cqrs.q.dao;

import com.anbang.qipai.chayuanshuangkou.cqrs.q.dbo.PanResultDbo;

public interface PanResultDboDao {

	void save(PanResultDbo panResultDbo);

	PanResultDbo findByGameIdAndPanNo(String gameId, int panNo);

}
