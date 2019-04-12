package com.anbang.qipai.chayuanshuangkou.cqrs.q.dao;

import java.util.List;

import com.anbang.qipai.chayuanshuangkou.cqrs.q.dbo.PukeGameInfoDbo;

public interface PukeGameInfoDboDao {
	void save(PukeGameInfoDbo dbo);

	List<PukeGameInfoDbo> findByGameIdAndPanNo(String gameId, int panNo);

}
