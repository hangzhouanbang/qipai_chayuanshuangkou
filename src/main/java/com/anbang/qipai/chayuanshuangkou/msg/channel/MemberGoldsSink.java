package com.anbang.qipai.chayuanshuangkou.msg.channel;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;

public interface MemberGoldsSink {
	String MEMBERGOLDS = "memberGolds";

	@Input
	SubscribableChannel memberGolds();
}
