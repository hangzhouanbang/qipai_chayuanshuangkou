package com.anbang.qipai.chayuanshuangkou.cqrs.q.dao;

import com.anbang.qipai.chayuanshuangkou.cqrs.q.dbo.GameLatestPanActionFrameDbo;
import com.dml.shuangkou.pan.PanActionFrame;

public interface GameLatestPanActionFrameDboDao {

	GameLatestPanActionFrameDbo findById(String id);

	void save(String id, PanActionFrame panActionFrame);

}
