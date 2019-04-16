package com.anbang.qipai.chayuanshuangkou.cqrs.c.domain;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import com.anbang.qipai.chayuanshuangkou.cqrs.c.domain.result.ChayuanShuangkouJuPlayerResult;
import com.anbang.qipai.chayuanshuangkou.cqrs.c.domain.result.ChayuanShuangkouJuResult;
import com.anbang.qipai.chayuanshuangkou.cqrs.c.domain.result.ChayuanShuangkouPanPlayerResult;
import com.anbang.qipai.chayuanshuangkou.cqrs.c.domain.result.ChayuanShuangkouPanResult;
import com.dml.shuangkou.ju.Ju;
import com.dml.shuangkou.ju.JuResult;
import com.dml.shuangkou.ju.JuResultBuilder;
import com.dml.shuangkou.pan.PanResult;

public class ChayuanShuangkouJuResultBuilder implements JuResultBuilder {

	@Override
	public JuResult buildJuResult(Ju ju) {
		ChayuanShuangkouJuResult wenzhouShuangkouJuResult = new ChayuanShuangkouJuResult();
		wenzhouShuangkouJuResult.setFinishedPanCount(ju.countFinishedPan());
		if (ju.countFinishedPan() > 0) {
			Map<String, ChayuanShuangkouJuPlayerResult> juPlayerResultMap = new HashMap<>();
			for (PanResult panResult : ju.getFinishedPanResultList()) {
				ChayuanShuangkouPanResult wenzhouShuangkouPanResult = (ChayuanShuangkouPanResult) panResult;
				for (ChayuanShuangkouPanPlayerResult panPlayerResult : wenzhouShuangkouPanResult
						.getPanPlayerResultList()) {
					ChayuanShuangkouJuPlayerResult juPlayerResult = juPlayerResultMap
							.get(panPlayerResult.getPlayerId());
					if (juPlayerResult == null) {
						juPlayerResult = new ChayuanShuangkouJuPlayerResult();
						juPlayerResult.setPlayerId(panPlayerResult.getPlayerId());
						juPlayerResultMap.put(panPlayerResult.getPlayerId(), juPlayerResult);
					}
					ChayuanShuangkouMingcifen mingcifen = panPlayerResult.getMingcifen();
					if (mingcifen.isYing() && mingcifen.isShuangkou()) {
						juPlayerResult.increaseShuangkouCount();
					}
					if (mingcifen.isYing() && mingcifen.isDankou()) {
						juPlayerResult.increaseDankouCount();
					}
					if (mingcifen.isYing() && mingcifen.isPingkou()) {
						juPlayerResult.increasePingkouCount();
					}
					juPlayerResult.tryAndUpdateMaxXianshu(panPlayerResult.getXianshubeishu());
					juPlayerResult.increaseTotalScore(panPlayerResult.getScore());
				}
			}

			ChayuanShuangkouJuPlayerResult dayingjia = null;
			ChayuanShuangkouJuPlayerResult datuhao = null;
			for (ChayuanShuangkouJuPlayerResult juPlayerResult : juPlayerResultMap.values()) {
				if (dayingjia == null) {
					dayingjia = juPlayerResult;
				} else {
					if (juPlayerResult.getTotalScore() > dayingjia.getTotalScore()) {
						dayingjia = juPlayerResult;
					}
				}

				if (datuhao == null) {
					datuhao = juPlayerResult;
				} else {
					if (juPlayerResult.getTotalScore() < datuhao.getTotalScore()) {
						datuhao = juPlayerResult;
					}
				}
			}
			wenzhouShuangkouJuResult.setDatuhaoId(datuhao.getPlayerId());
			wenzhouShuangkouJuResult.setDayingjiaId(dayingjia.getPlayerId());
			wenzhouShuangkouJuResult.setPlayerResultList(new ArrayList<>(juPlayerResultMap.values()));
		}
		return wenzhouShuangkouJuResult;
	}

}
