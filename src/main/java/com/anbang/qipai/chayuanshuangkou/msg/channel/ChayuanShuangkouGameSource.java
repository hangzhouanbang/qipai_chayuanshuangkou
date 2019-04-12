package com.anbang.qipai.chayuanshuangkou.msg.channel;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;

public interface ChayuanShuangkouGameSource {
	@Output
	MessageChannel chayuanShuangkouGame();
}
