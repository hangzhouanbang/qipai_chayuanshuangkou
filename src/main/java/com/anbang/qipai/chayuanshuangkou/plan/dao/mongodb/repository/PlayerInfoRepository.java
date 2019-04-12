package com.anbang.qipai.chayuanshuangkou.plan.dao.mongodb.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.anbang.qipai.chayuanshuangkou.plan.bean.PlayerInfo;

public interface PlayerInfoRepository extends MongoRepository<PlayerInfo, String> {

}
