package com.anbang.qipai.chayuanshuangkou.cqrs.c.service;

import java.util.ArrayList;

import com.anbang.qipai.chayuanshuangkou.cqrs.c.domain.result.ChaodiResult;
import com.anbang.qipai.chayuanshuangkou.cqrs.c.domain.result.PukeActionResult;
import com.anbang.qipai.chayuanshuangkou.cqrs.c.domain.result.ReadyToNextPanResult;

public interface PukePlayCmdService {

	PukeActionResult da(String playerId, ArrayList<Integer> paiIds, String dianshuZuheIdx, Long actionTime)
			throws Exception;

	PukeActionResult guo(String playerId, Long actionTime) throws Exception;

	ReadyToNextPanResult readyToNextPan(String playerId) throws Exception;

	ChaodiResult chaodi(String playerId, Boolean chaodi, Long actionTime) throws Exception;

}
