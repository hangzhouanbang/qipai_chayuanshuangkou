package com.anbang.qipai.chayuanshuangkou.plan.dao;

import com.anbang.qipai.chayuanshuangkou.plan.bean.MemberGoldBalance;

public interface MemberGoldBalanceDao {

	void save(MemberGoldBalance memberGoldBalance);

	MemberGoldBalance findByMemberId(String memberId);
}
