package com.anbang.qipai.chayuanshuangkou.msg.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.messaging.support.MessageBuilder;

import com.anbang.qipai.chayuanshuangkou.msg.channel.ChayuanShuangkouResultSource;
import com.anbang.qipai.chayuanshuangkou.msg.msjobj.CommonMO;
import com.anbang.qipai.chayuanshuangkou.msg.msjobj.PukeHistoricalJuResult;
import com.anbang.qipai.chayuanshuangkou.msg.msjobj.PukeHistoricalPanResult;

@EnableBinding(ChayuanShuangkouResultSource.class)
public class ChayuanShuangkouResultMsgService {

	@Autowired
	private ChayuanShuangkouResultSource chayuanShuangkouResultSource;

	public void recordJuResult(PukeHistoricalJuResult juResult) {
		CommonMO mo = new CommonMO();
		mo.setMsg("chayuanshuangkou ju result");
		mo.setData(juResult);
		chayuanShuangkouResultSource.chayuanShuangkouResult().send(MessageBuilder.withPayload(mo).build());
	}

	public void recordPanResult(PukeHistoricalPanResult panResult) {
		CommonMO mo = new CommonMO();
		mo.setMsg("chayuanshuangkou pan result");
		mo.setData(panResult);
		chayuanShuangkouResultSource.chayuanShuangkouResult().send(MessageBuilder.withPayload(mo).build());
	}
}
