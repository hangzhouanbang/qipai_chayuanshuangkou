package com.anbang.qipai.chayuanshuangkou.init;

import java.util.HashMap;
import java.util.Map;

public class XianshuCalculatorHelper {

	private static Map<String, Integer> xianshuCountMap;
	private static Map<String, Integer> gongxianFenCountMap;

	public static void calculateXianshu() {
		long startTime = System.currentTimeMillis();
		System.out.println("开始计算线数倍数：");
		xianshuCountMap = new HashMap<>();
		gongxianFenCountMap = new HashMap<>();
		calculateSiXian();
		calculateWuXian();
		calculateLiuXian();
		calculateQiXian();
		calculateBaXian();
		calculateJiuXian();
		calculateShiXian();
		calculateShiyiXian();
		calculateShierXian();
		long endTime = System.currentTimeMillis();
		System.out.println("线数倍数计算结束:" + (endTime - startTime) + "毫秒");
	}

	public static Map<String, Integer> getXianshuCountMap() {
		return xianshuCountMap;
	}

	public static void setXianshuCountMap(Map<String, Integer> xianshuCountMap) {
		XianshuCalculatorHelper.xianshuCountMap = xianshuCountMap;
	}

	public static Map<String, Integer> getGongxianFenCountMap() {
		return gongxianFenCountMap;
	}

	public static void setGongxianFenCountMap(Map<String, Integer> gongxianFenCountMap) {
		XianshuCalculatorHelper.gongxianFenCountMap = gongxianFenCountMap;
	}

	/**
	 * 计算四线倍数及贡献分
	 */
	private static void calculateSiXian() {
		String s = "102000100";
		// 2
		xianshuCountMap.put("100000000", 1);
		gongxianFenCountMap.put("100000000", 0);

		xianshuCountMap.put("200000000", 1);
		gongxianFenCountMap.put("200000000", 0);
	}

	/**
	 * 计算五线倍数及贡献分
	 */
	private static void calculateWuXian() {
		// 4
		xianshuCountMap.put("300000000", 2);
		gongxianFenCountMap.put("300000000", 0);

		xianshuCountMap.put("210000000", 2);
		gongxianFenCountMap.put("210000000", 0);

		xianshuCountMap.put("110000000", 2);
		gongxianFenCountMap.put("110000000", 0);

		xianshuCountMap.put("010000000", 2);
		gongxianFenCountMap.put("010000000", 0);
	}

	/**
	 * 计算六线倍数及贡献分
	 */
	private static void calculateLiuXian() {
		// 12
		xianshuCountMap.put("400000000", 4);
		gongxianFenCountMap.put("400000000", 2);

		xianshuCountMap.put("310000000", 4);
		gongxianFenCountMap.put("310000000", 2);

		xianshuCountMap.put("301000000", 4);
		gongxianFenCountMap.put("301000000", 2);

		xianshuCountMap.put("220000000", 4);
		gongxianFenCountMap.put("220000000", 2);

		xianshuCountMap.put("211000000", 4);
		gongxianFenCountMap.put("211000000", 2);

		xianshuCountMap.put("201000000", 4);
		gongxianFenCountMap.put("201000000", 2);

		xianshuCountMap.put("120000000", 4);
		gongxianFenCountMap.put("120000000", 2);

		xianshuCountMap.put("111000000", 4);
		gongxianFenCountMap.put("111000000", 2);

		xianshuCountMap.put("101000000", 4);
		gongxianFenCountMap.put("101000000", 2);

		xianshuCountMap.put("020000000", 4);
		gongxianFenCountMap.put("020000000", 2);

		xianshuCountMap.put("011000000", 4);
		gongxianFenCountMap.put("011000000", 2);

		xianshuCountMap.put("001000000", 4);
		gongxianFenCountMap.put("001000000", 2);
	}

	/**
	 * 计算七线倍数及贡献分
	 */
	private static void calculateQiXian() {
		// 39
		xianshuCountMap.put("500000000", 8);
		gongxianFenCountMap.put("500000000", 6);

		xianshuCountMap.put("410000000", 8);
		gongxianFenCountMap.put("410000000", 6);

		xianshuCountMap.put("401000000", 8);
		gongxianFenCountMap.put("401000000", 6);

		xianshuCountMap.put("320000000", 8);
		gongxianFenCountMap.put("320000000", 6);

		xianshuCountMap.put("311000000", 8);
		gongxianFenCountMap.put("311000000", 6);

		xianshuCountMap.put("302000000", 8);
		gongxianFenCountMap.put("302000000", 6);

		xianshuCountMap.put("300100000", 8);
		gongxianFenCountMap.put("300100000", 6);

		xianshuCountMap.put("230000000", 8);
		gongxianFenCountMap.put("230000000", 6);

		xianshuCountMap.put("221000000", 8);
		gongxianFenCountMap.put("221000000", 6);

		xianshuCountMap.put("212000000", 8);
		gongxianFenCountMap.put("212000000", 6);

		xianshuCountMap.put("210100000", 8);
		gongxianFenCountMap.put("210100000", 6);

		xianshuCountMap.put("202000000", 8);
		gongxianFenCountMap.put("202000000", 6);

		xianshuCountMap.put("200100000", 8);
		gongxianFenCountMap.put("200100000", 6);

		xianshuCountMap.put("130000000", 8);
		gongxianFenCountMap.put("130000000", 6);

		xianshuCountMap.put("121000000", 8);
		gongxianFenCountMap.put("121000000", 6);

		xianshuCountMap.put("112000000", 8);
		gongxianFenCountMap.put("112000000", 6);

		xianshuCountMap.put("110100000", 8);
		gongxianFenCountMap.put("110100000", 6);

		xianshuCountMap.put("102000000", 8);
		gongxianFenCountMap.put("102000000", 6);

		xianshuCountMap.put("100100000", 8);
		gongxianFenCountMap.put("100100000", 6);

		xianshuCountMap.put("030000000", 8);
		gongxianFenCountMap.put("030000000", 6);

		xianshuCountMap.put("021000000", 8);
		gongxianFenCountMap.put("021000000", 6);

		xianshuCountMap.put("012000000", 8);
		gongxianFenCountMap.put("012000000", 6);

		xianshuCountMap.put("010100000", 8);
		gongxianFenCountMap.put("010100000", 6);

		xianshuCountMap.put("002000000", 8);
		gongxianFenCountMap.put("002000000", 6);

		xianshuCountMap.put("000100000", 8);
		gongxianFenCountMap.put("000100000", 6);

		xianshuCountMap.put("120100000", 8);
		gongxianFenCountMap.put("120100000", 8);

		xianshuCountMap.put("111100000", 8);
		gongxianFenCountMap.put("111100000", 8);

		xianshuCountMap.put("101100000", 8);
		gongxianFenCountMap.put("101100000", 8);

		xianshuCountMap.put("020100000", 8);
		gongxianFenCountMap.put("020100000", 8);

		xianshuCountMap.put("011100000", 8);
		gongxianFenCountMap.put("011100000", 8);

		xianshuCountMap.put("001100000", 8);
		gongxianFenCountMap.put("001100000", 8);

		xianshuCountMap.put("400100000", 8);
		gongxianFenCountMap.put("400100000", 8);

		xianshuCountMap.put("310100000", 8);
		gongxianFenCountMap.put("310100000", 8);

		xianshuCountMap.put("301100000", 8);
		gongxianFenCountMap.put("301100000", 8);

		xianshuCountMap.put("220100000", 8);
		gongxianFenCountMap.put("220100000", 8);

		xianshuCountMap.put("211100000", 8);
		gongxianFenCountMap.put("211100000", 8);

		xianshuCountMap.put("201100000", 8);
		gongxianFenCountMap.put("201100000", 8);

		xianshuCountMap.put("121100000", 8);
		gongxianFenCountMap.put("121100000", 10);
	}

	/**
	 * 计算八线倍数及贡献分
	 */
	private static void calculateBaXian() {
		// 103
		xianshuCountMap.put("500100000", 16);
		gongxianFenCountMap.put("500100000", 10);

		xianshuCountMap.put("000010000", 16);
		gongxianFenCountMap.put("000010000", 10);

		xianshuCountMap.put("501000000", 16);
		gongxianFenCountMap.put("501000000", 10);

		xianshuCountMap.put("210010000", 16);
		gongxianFenCountMap.put("210010000", 10);

		xianshuCountMap.put("110010000", 16);
		gongxianFenCountMap.put("110010000", 10);

		xianshuCountMap.put("010010000", 16);
		gongxianFenCountMap.put("010010000", 10);

		xianshuCountMap.put("300010000", 16);
		gongxianFenCountMap.put("300010000", 10);

		xianshuCountMap.put("200010000", 16);
		gongxianFenCountMap.put("200010000", 10);

		xianshuCountMap.put("100010000", 16);
		gongxianFenCountMap.put("100010000", 10);

		xianshuCountMap.put("000200000", 16);
		gongxianFenCountMap.put("000200000", 10);

		xianshuCountMap.put("210200000", 16);
		gongxianFenCountMap.put("210200000", 10);

		xianshuCountMap.put("110200000", 16);
		gongxianFenCountMap.put("110200000", 10);

		xianshuCountMap.put("010200000", 16);
		gongxianFenCountMap.put("010200000", 10);

		xianshuCountMap.put("300200000", 16);
		gongxianFenCountMap.put("300200000", 10);

		xianshuCountMap.put("200200000", 16);
		gongxianFenCountMap.put("200200000", 10);

		xianshuCountMap.put("100200000", 16);
		gongxianFenCountMap.put("100200000", 10);

		xianshuCountMap.put("003000000", 16);
		gongxianFenCountMap.put("003000000", 10);

		xianshuCountMap.put("113000000", 16);
		gongxianFenCountMap.put("113000000", 10);

		xianshuCountMap.put("013000000", 16);
		gongxianFenCountMap.put("013000000", 10);

		xianshuCountMap.put("303000000", 16);
		gongxianFenCountMap.put("303000000", 10);

		xianshuCountMap.put("203000000", 16);
		gongxianFenCountMap.put("203000000", 10);

		xianshuCountMap.put("103000000", 16);
		gongxianFenCountMap.put("103000000", 10);

		xianshuCountMap.put("040000000", 16);
		gongxianFenCountMap.put("040000000", 10);

		xianshuCountMap.put("140000000", 16);
		gongxianFenCountMap.put("140000000", 10);

		xianshuCountMap.put("030100000", 16);
		gongxianFenCountMap.put("030100000", 10);

		xianshuCountMap.put("031000000", 16);
		gongxianFenCountMap.put("031000000", 10);

		xianshuCountMap.put("131000000", 16);
		gongxianFenCountMap.put("131000000", 10);

		xianshuCountMap.put("330000000", 16);
		gongxianFenCountMap.put("330000000", 10);

		xianshuCountMap.put("420000000", 16);
		gongxianFenCountMap.put("420000000", 10);

		xianshuCountMap.put("510000000", 16);
		gongxianFenCountMap.put("510000000", 10);

		xianshuCountMap.put("600000000", 16);
		gongxianFenCountMap.put("600000000", 10);

		xianshuCountMap.put("500100000", 16);
		gongxianFenCountMap.put("500100000", 10);

		xianshuCountMap.put("002100000", 16);
		gongxianFenCountMap.put("002100000", 10);

		xianshuCountMap.put("212100000", 16);
		gongxianFenCountMap.put("212100000", 10);

		xianshuCountMap.put("112100000", 16);
		gongxianFenCountMap.put("112100000", 10);

		xianshuCountMap.put("012100000", 16);
		gongxianFenCountMap.put("012100000", 10);

		xianshuCountMap.put("302100000", 16);
		gongxianFenCountMap.put("302100000", 10);

		xianshuCountMap.put("202100000", 16);
		gongxianFenCountMap.put("202100000", 10);

		xianshuCountMap.put("102100000", 16);
		gongxianFenCountMap.put("102100000", 10);

		xianshuCountMap.put("401100000", 16);
		gongxianFenCountMap.put("401100000", 10);

		xianshuCountMap.put("411000000", 16);
		gongxianFenCountMap.put("411000000", 10);

		xianshuCountMap.put("021100000", 16);
		gongxianFenCountMap.put("021100000", 10);

		xianshuCountMap.put("311100000", 16);
		gongxianFenCountMap.put("311100000", 10);

		xianshuCountMap.put("221100000", 16);
		gongxianFenCountMap.put("221100000", 10);

		xianshuCountMap.put("121100000", 16);
		gongxianFenCountMap.put("121100000", 10);

		xianshuCountMap.put("030100000", 16);
		gongxianFenCountMap.put("030100000", 10);

		xianshuCountMap.put("130100000", 16);
		gongxianFenCountMap.put("130100000", 10);

		xianshuCountMap.put("230100000", 16);
		gongxianFenCountMap.put("230100000", 10);

		xianshuCountMap.put("320100000", 16);
		gongxianFenCountMap.put("320100000", 10);

		xianshuCountMap.put("410100000", 16);
		gongxianFenCountMap.put("410100000", 10);

		xianshuCountMap.put("312000000", 16);
		gongxianFenCountMap.put("312000000", 10);

		xianshuCountMap.put("222000000", 16);
		gongxianFenCountMap.put("222000000", 10);

		xianshuCountMap.put("122000000", 16);
		gongxianFenCountMap.put("122000000", 10);

		xianshuCountMap.put("201010000", 16);
		gongxianFenCountMap.put("201010000", 10);

		xianshuCountMap.put("101010000", 16);
		gongxianFenCountMap.put("101010000", 10);

		xianshuCountMap.put("402000000", 16);
		gongxianFenCountMap.put("402000000", 10);

		xianshuCountMap.put("400200000", 16);
		gongxianFenCountMap.put("400200000", 12);

		xianshuCountMap.put("022000000", 16);
		gongxianFenCountMap.put("022000000", 12);

		xianshuCountMap.put("001200000", 16);
		gongxianFenCountMap.put("001200000", 12);

		xianshuCountMap.put("020200000", 16);
		gongxianFenCountMap.put("020200000", 12);

		xianshuCountMap.put("001010000", 16);
		gongxianFenCountMap.put("001010000", 12);

		xianshuCountMap.put("001200000", 16);
		gongxianFenCountMap.put("001200000", 12);

		xianshuCountMap.put("211010000", 16);
		gongxianFenCountMap.put("211010000", 12);

		xianshuCountMap.put("201200000", 16);
		gongxianFenCountMap.put("201200000", 12);

		xianshuCountMap.put("120200000", 16);
		gongxianFenCountMap.put("120200000", 12);

		xianshuCountMap.put("111010000", 16);
		gongxianFenCountMap.put("111010000", 12);

		xianshuCountMap.put("111200000", 16);
		gongxianFenCountMap.put("111200000", 12);

		xianshuCountMap.put("101200000", 16);
		gongxianFenCountMap.put("101200000", 12);

		xianshuCountMap.put("011200000", 16);
		gongxianFenCountMap.put("011200000", 12);

		xianshuCountMap.put("011010000", 16);
		gongxianFenCountMap.put("011010000", 12);

		xianshuCountMap.put("301010000", 16);
		gongxianFenCountMap.put("301010000", 12);

		xianshuCountMap.put("120010000", 16);
		gongxianFenCountMap.put("120010000", 12);

		xianshuCountMap.put("400010000", 16);
		gongxianFenCountMap.put("400010000", 12);

		xianshuCountMap.put("020010000", 16);
		gongxianFenCountMap.put("020010000", 12);

		xianshuCountMap.put("310010000", 16);
		gongxianFenCountMap.put("310010000", 12);

		xianshuCountMap.put("220010000", 16);
		gongxianFenCountMap.put("220010000", 12);

		xianshuCountMap.put("000110000", 16);
		gongxianFenCountMap.put("000110000", 16);

		xianshuCountMap.put("210110000", 16);
		gongxianFenCountMap.put("210110000", 16);

		xianshuCountMap.put("110110000", 16);
		gongxianFenCountMap.put("110110000", 16);

		xianshuCountMap.put("010110000", 16);
		gongxianFenCountMap.put("010110000", 16);

		xianshuCountMap.put("300110000", 16);
		gongxianFenCountMap.put("300110000", 16);

		xianshuCountMap.put("200110000", 16);
		gongxianFenCountMap.put("200110000", 16);

		xianshuCountMap.put("100110000", 16);
		gongxianFenCountMap.put("100110000", 16);

		xianshuCountMap.put("002010000", 16);
		gongxianFenCountMap.put("002010000", 16);

		xianshuCountMap.put("212010000", 16);
		gongxianFenCountMap.put("212010000", 16);

		xianshuCountMap.put("112010000", 16);
		gongxianFenCountMap.put("112010000", 16);

		xianshuCountMap.put("012010000", 16);
		gongxianFenCountMap.put("012010000", 16);

		xianshuCountMap.put("202010000", 16);
		gongxianFenCountMap.put("202010000", 16);

		xianshuCountMap.put("102010000", 16);
		gongxianFenCountMap.put("102010000", 16);

		xianshuCountMap.put("401010000", 16);
		gongxianFenCountMap.put("401010000", 16);

		xianshuCountMap.put("021010000", 16);
		gongxianFenCountMap.put("021010000", 16);

		xianshuCountMap.put("121010000", 16);
		gongxianFenCountMap.put("121010000", 16);

		xianshuCountMap.put("030010000", 16);
		gongxianFenCountMap.put("030010000", 16);

		xianshuCountMap.put("130010000", 16);
		gongxianFenCountMap.put("130010000", 16);

		xianshuCountMap.put("501010000", 16);
		gongxianFenCountMap.put("501010000", 16);

		xianshuCountMap.put("100110000", 16);
		gongxianFenCountMap.put("100110000", 16);

		xianshuCountMap.put("211110000", 16);
		gongxianFenCountMap.put("211110000", 18);

		xianshuCountMap.put("111110000", 16);
		gongxianFenCountMap.put("111110000", 18);

		xianshuCountMap.put("011110000", 16);
		gongxianFenCountMap.put("011110000", 18);

		xianshuCountMap.put("101110000", 16);
		gongxianFenCountMap.put("101110000", 18);

		xianshuCountMap.put("301110000", 16);
		gongxianFenCountMap.put("301110000", 18);

		xianshuCountMap.put("201110000", 16);
		gongxianFenCountMap.put("201110000", 18);

		xianshuCountMap.put("400110000", 16);
		gongxianFenCountMap.put("400110000", 18);

		xianshuCountMap.put("020110000", 16);
		gongxianFenCountMap.put("020110000", 18);

		xianshuCountMap.put("120110000", 16);
		gongxianFenCountMap.put("120110000", 18);

		xianshuCountMap.put("001110000", 16);
		gongxianFenCountMap.put("001110000", 18);
	}

	/**
	 * 计算九线倍数及贡献分
	 */
	private static void calculateJiuXian() {
		// 117
		xianshuCountMap.put("601000000", 20);
		gongxianFenCountMap.put("601000000", 15);

		xianshuCountMap.put("400001000", 20);
		gongxianFenCountMap.put("400001000", 15);

		xianshuCountMap.put("310001000", 20);
		gongxianFenCountMap.put("310001000", 15);

		xianshuCountMap.put("300001000", 20);
		gongxianFenCountMap.put("300001000", 15);

		xianshuCountMap.put("210001000", 20);
		gongxianFenCountMap.put("210001000", 15);

		xianshuCountMap.put("200020000", 20);
		gongxianFenCountMap.put("200020000", 15);

		xianshuCountMap.put("200001000", 20);
		gongxianFenCountMap.put("200001000", 15);

		xianshuCountMap.put("100020000", 20);
		gongxianFenCountMap.put("100020000", 15);

		xianshuCountMap.put("100001000", 20);
		gongxianFenCountMap.put("100001000", 15);

		xianshuCountMap.put("110020000", 20);
		gongxianFenCountMap.put("110020000", 15);

		xianshuCountMap.put("110001000", 20);
		gongxianFenCountMap.put("110001000", 15);

		xianshuCountMap.put("100300000", 20);
		gongxianFenCountMap.put("100300000", 15);

		xianshuCountMap.put("100210000", 20);
		gongxianFenCountMap.put("100210000", 15);

		xianshuCountMap.put("050000000", 20);
		gongxianFenCountMap.put("050000000", 15);

		xianshuCountMap.put("104000000", 20);
		gongxianFenCountMap.put("104000000", 15);

		xianshuCountMap.put("014000000", 20);
		gongxianFenCountMap.put("014000000", 15);

		xianshuCountMap.put("041000000", 20);
		gongxianFenCountMap.put("041000000", 15);

		xianshuCountMap.put("103010000", 20);
		gongxianFenCountMap.put("103010000", 15);

		xianshuCountMap.put("040100000", 20);
		gongxianFenCountMap.put("040100000", 15);

		xianshuCountMap.put("110300000", 20);
		gongxianFenCountMap.put("110300000", 15);

		xianshuCountMap.put("102200000", 20);
		gongxianFenCountMap.put("102200000", 15);

		xianshuCountMap.put("022100000", 20);
		gongxianFenCountMap.put("022100000", 15);

		xianshuCountMap.put("031010000", 20);
		gongxianFenCountMap.put("031010000", 15);

		xianshuCountMap.put("032000000", 20);
		gongxianFenCountMap.put("032000000", 15);

		xianshuCountMap.put("010300000", 20);
		gongxianFenCountMap.put("010300000", 15);

		xianshuCountMap.put("010020000", 20);
		gongxianFenCountMap.put("010020000", 15);

		xianshuCountMap.put("010300000", 20);
		gongxianFenCountMap.put("010300000", 15);

		xianshuCountMap.put("010001000", 20);
		gongxianFenCountMap.put("010001000", 15);

		xianshuCountMap.put("030200000", 20);
		gongxianFenCountMap.put("030200000", 15);

		xianshuCountMap.put("031010000", 20);
		gongxianFenCountMap.put("031010000", 15);

		xianshuCountMap.put("030200000", 20);
		gongxianFenCountMap.put("030200000", 15);

		xianshuCountMap.put("030110000", 20);
		gongxianFenCountMap.put("030110000", 15);

		xianshuCountMap.put("021110000", 20);
		gongxianFenCountMap.put("021110000", 15);

		xianshuCountMap.put("023000000", 20);
		gongxianFenCountMap.put("023000000", 15);

		xianshuCountMap.put("022010000", 20);
		gongxianFenCountMap.put("022010000", 15);

		xianshuCountMap.put("021200000", 20);
		gongxianFenCountMap.put("021200000", 15);

		xianshuCountMap.put("010001000", 20);
		gongxianFenCountMap.put("010001000", 15);

		xianshuCountMap.put("004000000", 20);
		gongxianFenCountMap.put("004000000", 15);

		xianshuCountMap.put("003100000", 20);
		gongxianFenCountMap.put("003100000", 15);

		xianshuCountMap.put("003010000", 20);
		gongxianFenCountMap.put("003010000", 15);

		xianshuCountMap.put("014000000", 20);
		gongxianFenCountMap.put("014000000", 15);

		xianshuCountMap.put("012200000", 20);
		gongxianFenCountMap.put("012200000", 15);

		xianshuCountMap.put("002200000", 20);
		gongxianFenCountMap.put("002200000", 15);

		xianshuCountMap.put("002110000", 20);
		gongxianFenCountMap.put("002110000", 15);

		xianshuCountMap.put("000300000", 20);
		gongxianFenCountMap.put("000300000", 15);

		xianshuCountMap.put("000210000", 20);
		gongxianFenCountMap.put("000210000", 15);

		xianshuCountMap.put("001210000", 20);
		gongxianFenCountMap.put("001210000", 15);

		xianshuCountMap.put("000020000", 20);
		gongxianFenCountMap.put("000020000", 15);

		xianshuCountMap.put("000001000", 20);
		gongxianFenCountMap.put("000001000", 15);

		xianshuCountMap.put("010300000", 20);
		gongxianFenCountMap.put("010300000", 15);

		xianshuCountMap.put("010210000", 20);
		gongxianFenCountMap.put("010210000", 15);

		xianshuCountMap.put("400001000", 20);
		gongxianFenCountMap.put("400001000", 17);

		xianshuCountMap.put("310001000", 20);
		gongxianFenCountMap.put("310001000", 17);

		xianshuCountMap.put("301001000", 20);
		gongxianFenCountMap.put("301001000", 17);

		xianshuCountMap.put("220001000", 20);
		gongxianFenCountMap.put("220001000", 17);

		xianshuCountMap.put("101020000", 20);
		gongxianFenCountMap.put("101020000", 17);

		xianshuCountMap.put("211001000", 20);
		gongxianFenCountMap.put("211001000", 17);

		xianshuCountMap.put("201020000", 20);
		gongxianFenCountMap.put("201020000", 17);

		xianshuCountMap.put("201001000", 20);
		gongxianFenCountMap.put("201001000", 17);

		xianshuCountMap.put("120001000", 20);
		gongxianFenCountMap.put("120001000", 17);

		xianshuCountMap.put("111001000", 20);
		gongxianFenCountMap.put("111001000", 17);

		xianshuCountMap.put("101001000", 20);
		gongxianFenCountMap.put("101001000", 17);

		xianshuCountMap.put("020020000", 20);
		gongxianFenCountMap.put("020020000", 17);

		xianshuCountMap.put("020001000", 20);
		gongxianFenCountMap.put("020001000", 17);

		xianshuCountMap.put("001001000", 20);
		gongxianFenCountMap.put("001001000", 17);

		xianshuCountMap.put("020020000", 20);
		gongxianFenCountMap.put("020020000", 17);

		xianshuCountMap.put("020001000", 20);
		gongxianFenCountMap.put("020001000", 17);

		xianshuCountMap.put("011020000", 20);
		gongxianFenCountMap.put("011020000", 17);

		xianshuCountMap.put("011001000", 20);
		gongxianFenCountMap.put("011001000", 17);

		xianshuCountMap.put("001300000", 20);
		gongxianFenCountMap.put("001300000", 17);

		xianshuCountMap.put("001300000", 20);
		gongxianFenCountMap.put("001300000", 17);

		xianshuCountMap.put("001020000", 20);
		gongxianFenCountMap.put("001020000", 17);

		xianshuCountMap.put("001001000", 20);
		gongxianFenCountMap.put("001001000", 17);

		xianshuCountMap.put("001020000", 20);
		gongxianFenCountMap.put("001020000", 17);

		xianshuCountMap.put("202001000", 20);
		gongxianFenCountMap.put("202001000", 21);

		xianshuCountMap.put("200101000", 20);
		gongxianFenCountMap.put("200101000", 21);

		xianshuCountMap.put("100120000", 20);
		gongxianFenCountMap.put("100120000", 21);

		xianshuCountMap.put("100101000", 20);
		gongxianFenCountMap.put("100101000", 21);

		xianshuCountMap.put("121001000", 20);
		gongxianFenCountMap.put("121001000", 21);

		xianshuCountMap.put("112001000", 20);
		gongxianFenCountMap.put("112001000", 21);

		xianshuCountMap.put("110101000", 20);
		gongxianFenCountMap.put("110101000", 21);

		xianshuCountMap.put("102001000", 20);
		gongxianFenCountMap.put("102001000", 21);

		xianshuCountMap.put("130001000", 20);
		gongxianFenCountMap.put("130001000", 21);

		xianshuCountMap.put("030001000", 20);
		gongxianFenCountMap.put("030001000", 21);

		xianshuCountMap.put("021001000", 20);
		gongxianFenCountMap.put("021001000", 21);

		xianshuCountMap.put("010120000", 20);
		gongxianFenCountMap.put("010120000", 21);

		xianshuCountMap.put("010101000", 20);
		gongxianFenCountMap.put("010101000", 21);

		xianshuCountMap.put("030001000", 20);
		gongxianFenCountMap.put("030001000", 21);

		xianshuCountMap.put("021001000", 20);
		gongxianFenCountMap.put("021001000", 21);

		xianshuCountMap.put("012001000", 20);
		gongxianFenCountMap.put("012001000", 21);

		xianshuCountMap.put("002001000", 20);
		gongxianFenCountMap.put("002001000", 21);

		xianshuCountMap.put("000120000", 20);
		gongxianFenCountMap.put("000120000", 21);

		xianshuCountMap.put("000120000", 20);
		gongxianFenCountMap.put("000120000", 21);

		xianshuCountMap.put("000101000", 20);
		gongxianFenCountMap.put("000101000", 21);

		xianshuCountMap.put("100101000", 20);
		gongxianFenCountMap.put("100101000", 21);

		xianshuCountMap.put("002020000", 20);
		gongxianFenCountMap.put("002020000", 21);

		xianshuCountMap.put("201101000", 20);
		gongxianFenCountMap.put("201101000", 23);

		xianshuCountMap.put("101101000", 20);
		gongxianFenCountMap.put("101101000", 23);

		xianshuCountMap.put("031001000", 20);
		gongxianFenCountMap.put("031001000", 23);

		xianshuCountMap.put("020101000", 20);
		gongxianFenCountMap.put("020101000", 23);

		xianshuCountMap.put("011101000", 20);
		gongxianFenCountMap.put("011101000", 23);

		xianshuCountMap.put("001120000", 20);
		gongxianFenCountMap.put("001120000", 23);

		xianshuCountMap.put("001101000", 20);
		gongxianFenCountMap.put("001101000", 23);

		xianshuCountMap.put("100011000", 20);
		gongxianFenCountMap.put("100011000", 25);

		xianshuCountMap.put("110011000", 20);
		gongxianFenCountMap.put("110011000", 25);

		xianshuCountMap.put("010011000", 20);
		gongxianFenCountMap.put("010011000", 25);

		xianshuCountMap.put("200011000", 20);
		gongxianFenCountMap.put("200011000", 25);

		xianshuCountMap.put("003001000", 20);
		gongxianFenCountMap.put("003001000", 25);

		xianshuCountMap.put("021101000", 20);
		gongxianFenCountMap.put("021101000", 25);

		xianshuCountMap.put("010011000", 20);
		gongxianFenCountMap.put("010011000", 25);

		xianshuCountMap.put("000201000", 20);
		gongxianFenCountMap.put("000201000", 25);

		xianshuCountMap.put("000011000", 20);
		gongxianFenCountMap.put("000011000", 25);

		xianshuCountMap.put("010201000", 20);
		gongxianFenCountMap.put("010201000", 25);

		xianshuCountMap.put("101011000", 20);
		gongxianFenCountMap.put("101011000", 27);

		xianshuCountMap.put("020011000", 20);
		gongxianFenCountMap.put("020011000", 27);

		xianshuCountMap.put("011011000", 20);
		gongxianFenCountMap.put("011011000", 27);

		xianshuCountMap.put("001011000", 20);
		gongxianFenCountMap.put("001011000", 27);

		xianshuCountMap.put("000111000", 20);
		gongxianFenCountMap.put("000111000", 31);

	}

	/**
	 * 计算十线倍数及贡献分
	 */
	private static void calculateShiXian() {
		// 74
		xianshuCountMap.put("300000100", 24);
		gongxianFenCountMap.put("300000100", 20);

		xianshuCountMap.put("210000100", 24);
		gongxianFenCountMap.put("210000100", 20);

		xianshuCountMap.put("200002000", 24);
		gongxianFenCountMap.put("200002000", 20);

		xianshuCountMap.put("200000100", 24);
		gongxianFenCountMap.put("200000100", 20);

		xianshuCountMap.put("110002000", 24);
		gongxianFenCountMap.put("110002000", 20);

		xianshuCountMap.put("110000100", 24);
		gongxianFenCountMap.put("110000100", 20);

		xianshuCountMap.put("010000100", 24);
		gongxianFenCountMap.put("010000100", 20);

		xianshuCountMap.put("010002000", 24);
		gongxianFenCountMap.put("010002000", 20);

		xianshuCountMap.put("000400000", 24);
		gongxianFenCountMap.put("000400000", 20);

		xianshuCountMap.put("000310000", 24);
		gongxianFenCountMap.put("000310000", 20);

		xianshuCountMap.put("000220000", 24);
		gongxianFenCountMap.put("000220000", 20);

		xianshuCountMap.put("000030000", 24);
		gongxianFenCountMap.put("000030000", 20);

		xianshuCountMap.put("000021000", 24);
		gongxianFenCountMap.put("000021000", 20);

		xianshuCountMap.put("000002000", 24);
		gongxianFenCountMap.put("000002000", 20);

		xianshuCountMap.put("000000100", 24);
		gongxianFenCountMap.put("000000100", 20);

		xianshuCountMap.put("005000000", 24);
		gongxianFenCountMap.put("005000000", 20);

		xianshuCountMap.put("100000100", 24);
		gongxianFenCountMap.put("100000100", 20);

		xianshuCountMap.put("100002000", 24);
		gongxianFenCountMap.put("100002000", 20);

		xianshuCountMap.put("120000100", 24);
		gongxianFenCountMap.put("120000100", 20);

		xianshuCountMap.put("011000100", 24);
		gongxianFenCountMap.put("011000100", 22);

		xianshuCountMap.put("001030000", 24);
		gongxianFenCountMap.put("001030000", 22);

		xianshuCountMap.put("001002000", 24);
		gongxianFenCountMap.put("001002000", 22);

		xianshuCountMap.put("400000100", 24);
		gongxianFenCountMap.put("400000100", 22);

		xianshuCountMap.put("310000100", 24);
		gongxianFenCountMap.put("310000100", 22);

		xianshuCountMap.put("201000100", 24);
		gongxianFenCountMap.put("201000100", 22);

		xianshuCountMap.put("120000100", 24);
		gongxianFenCountMap.put("120000100", 22);

		xianshuCountMap.put("101000100", 24);
		gongxianFenCountMap.put("101000100", 22);

		xianshuCountMap.put("020000100", 24);
		gongxianFenCountMap.put("020000100", 22);

		xianshuCountMap.put("001030000", 24);
		gongxianFenCountMap.put("001030000", 22);

		xianshuCountMap.put("001002000", 24);
		gongxianFenCountMap.put("001002000", 22);

		xianshuCountMap.put("001000100", 24);
		gongxianFenCountMap.put("001000100", 22);

		xianshuCountMap.put("011000100", 24);
		gongxianFenCountMap.put("011000100", 22);

		xianshuCountMap.put("111000100", 24);
		gongxianFenCountMap.put("111000100", 22);

		xianshuCountMap.put("101000100", 24);
		gongxianFenCountMap.put("101000100", 22);

		xianshuCountMap.put("200100100", 24);
		gongxianFenCountMap.put("200100100", 26);

		xianshuCountMap.put("110100100", 24);
		gongxianFenCountMap.put("110100100", 26);

		xianshuCountMap.put("100100100", 24);
		gongxianFenCountMap.put("100100100", 26);

		xianshuCountMap.put("010100100", 24);
		gongxianFenCountMap.put("010100100", 26);

		xianshuCountMap.put("000130000", 24);
		gongxianFenCountMap.put("000130000", 26);

		xianshuCountMap.put("000102000", 24);
		gongxianFenCountMap.put("000102000", 26);

		xianshuCountMap.put("000100100", 24);
		gongxianFenCountMap.put("000100100", 26);

		xianshuCountMap.put("002002000", 24);
		gongxianFenCountMap.put("002002000", 26);

		xianshuCountMap.put("200100100", 24);
		gongxianFenCountMap.put("200100100", 26);

		xianshuCountMap.put("110100100", 24);
		gongxianFenCountMap.put("110100100", 26);

		xianshuCountMap.put("102000100", 24);
		gongxianFenCountMap.put("102000100", 26);

		xianshuCountMap.put("030000100", 24);
		gongxianFenCountMap.put("030000100", 26);

		xianshuCountMap.put("021000100", 24);
		gongxianFenCountMap.put("021000100", 26);

		xianshuCountMap.put("012000100", 24);
		gongxianFenCountMap.put("012000100", 26);

		xianshuCountMap.put("002002000", 24);
		gongxianFenCountMap.put("002002000", 26);

		xianshuCountMap.put("002000100", 24);
		gongxianFenCountMap.put("002000100", 26);

		xianshuCountMap.put("101100100", 24);
		gongxianFenCountMap.put("101100100", 28);

		xianshuCountMap.put("020100100", 24);
		gongxianFenCountMap.put("020100100", 28);

		xianshuCountMap.put("001100100", 24);
		gongxianFenCountMap.put("001100100", 28);

		xianshuCountMap.put("020100100", 24);
		gongxianFenCountMap.put("020100100", 28);

		xianshuCountMap.put("110010100", 24);
		gongxianFenCountMap.put("110010100", 30);

		xianshuCountMap.put("100010100", 24);
		gongxianFenCountMap.put("100010100", 30);

		xianshuCountMap.put("010200100", 24);
		gongxianFenCountMap.put("010200100", 30);

		xianshuCountMap.put("010010100", 24);
		gongxianFenCountMap.put("010010100", 30);

		xianshuCountMap.put("003000100", 24);
		gongxianFenCountMap.put("003000100", 30);

		xianshuCountMap.put("002100100", 24);
		gongxianFenCountMap.put("002100100", 30);

		xianshuCountMap.put("000200100", 24);
		gongxianFenCountMap.put("000200100", 30);

		xianshuCountMap.put("000010100", 24);
		gongxianFenCountMap.put("000010100", 30);

		xianshuCountMap.put("200010100", 24);
		gongxianFenCountMap.put("200010100", 30);

		xianshuCountMap.put("001200100", 24);
		gongxianFenCountMap.put("001200100", 32);

		xianshuCountMap.put("001010100", 24);
		gongxianFenCountMap.put("001010100", 32);

		xianshuCountMap.put("002010100", 24);
		gongxianFenCountMap.put("002010100", 36);

		xianshuCountMap.put("000110100", 24);
		gongxianFenCountMap.put("000110100", 36);

		xianshuCountMap.put("200001100", 24);
		gongxianFenCountMap.put("200001100", 35);

		xianshuCountMap.put("100001100", 24);
		gongxianFenCountMap.put("100001100", 35);

		xianshuCountMap.put("000020100", 24);
		gongxianFenCountMap.put("000020100", 35);

		xianshuCountMap.put("000001100", 24);
		gongxianFenCountMap.put("000001100", 35);

		xianshuCountMap.put("001001100", 24);
		gongxianFenCountMap.put("001001100", 37);

		xianshuCountMap.put("000101100", 24);
		gongxianFenCountMap.put("000101100", 41);

		xianshuCountMap.put("000011100", 24);
		gongxianFenCountMap.put("000011100", 45);
	}

	/**
	 * 计算十一线倍数及贡献分
	 */
	private static void calculateShiyiXian() {
		// 43
		xianshuCountMap.put("000003000", 28);
		gongxianFenCountMap.put("000003000", 25);

		xianshuCountMap.put("100000200", 28);
		gongxianFenCountMap.put("100000200", 25);

		xianshuCountMap.put("010000200", 28);
		gongxianFenCountMap.put("010000200", 25);

		xianshuCountMap.put("010000010", 28);
		gongxianFenCountMap.put("010000010", 25);

		xianshuCountMap.put("200000010", 28);
		gongxianFenCountMap.put("200000010", 25);

		xianshuCountMap.put("110000010", 28);
		gongxianFenCountMap.put("110000010", 25);

		xianshuCountMap.put("000000010", 28);
		gongxianFenCountMap.put("000000010", 25);

		xianshuCountMap.put("000000200", 28);
		gongxianFenCountMap.put("000000200", 25);

		xianshuCountMap.put("300000010", 28);
		gongxianFenCountMap.put("300000010", 25);

		xianshuCountMap.put("210000010", 28);
		gongxianFenCountMap.put("210000010", 25);

		xianshuCountMap.put("100000010", 28);
		gongxianFenCountMap.put("100000010", 25);

		xianshuCountMap.put("001000200", 28);
		gongxianFenCountMap.put("001000200", 27);

		xianshuCountMap.put("001000010", 28);
		gongxianFenCountMap.put("001000010", 27);

		xianshuCountMap.put("120000010", 28);
		gongxianFenCountMap.put("120000010", 27);

		xianshuCountMap.put("400000010", 28);
		gongxianFenCountMap.put("400000010", 27);

		xianshuCountMap.put("101000010", 28);
		gongxianFenCountMap.put("101000010", 27);

		xianshuCountMap.put("201000010", 28);
		gongxianFenCountMap.put("201000010", 27);

		xianshuCountMap.put("020000010", 28);
		gongxianFenCountMap.put("020000010", 27);

		xianshuCountMap.put("011000010", 28);
		gongxianFenCountMap.put("011000010", 27);

		xianshuCountMap.put("111000010", 28);
		gongxianFenCountMap.put("111000010", 27);

		xianshuCountMap.put("000100200", 28);
		gongxianFenCountMap.put("000100200", 31);

		xianshuCountMap.put("010100010", 28);
		gongxianFenCountMap.put("010100010", 31);

		xianshuCountMap.put("200100010", 28);
		gongxianFenCountMap.put("200100010", 31);

		xianshuCountMap.put("110100010", 28);
		gongxianFenCountMap.put("110100010", 31);

		xianshuCountMap.put("000100010", 28);
		gongxianFenCountMap.put("000100010", 31);

		xianshuCountMap.put("102000010", 28);
		gongxianFenCountMap.put("102000010", 31);

		xianshuCountMap.put("100100010", 28);
		gongxianFenCountMap.put("100100010", 31);

		xianshuCountMap.put("030000010", 28);
		gongxianFenCountMap.put("030000010", 31);

		xianshuCountMap.put("021000010", 28);
		gongxianFenCountMap.put("021000010", 31);

		xianshuCountMap.put("002000010", 28);
		gongxianFenCountMap.put("002000010", 31);

		xianshuCountMap.put("001100010", 28);
		gongxianFenCountMap.put("001100010", 33);

		xianshuCountMap.put("200010010", 28);
		gongxianFenCountMap.put("200010010", 35);

		xianshuCountMap.put("100010010", 28);
		gongxianFenCountMap.put("100010010", 35);

		xianshuCountMap.put("010200010", 28);
		gongxianFenCountMap.put("010200010", 35);

		xianshuCountMap.put("010010010", 28);
		gongxianFenCountMap.put("010010010", 35);

		xianshuCountMap.put("002100010", 28);
		gongxianFenCountMap.put("002100010", 35);

		xianshuCountMap.put("000010010", 28);
		gongxianFenCountMap.put("000010010", 35);

		xianshuCountMap.put("001010010", 28);
		gongxianFenCountMap.put("001010010", 37);

		xianshuCountMap.put("000110010", 28);
		gongxianFenCountMap.put("000110010", 41);

		xianshuCountMap.put("100001010", 28);
		gongxianFenCountMap.put("100001010", 40);

		xianshuCountMap.put("010001010", 28);
		gongxianFenCountMap.put("010001010", 40);

		xianshuCountMap.put("000020010", 28);
		gongxianFenCountMap.put("000020010", 40);

		xianshuCountMap.put("000001010", 28);
		gongxianFenCountMap.put("000001010", 40);

		xianshuCountMap.put("001001010", 28);
		gongxianFenCountMap.put("001001010", 42);

		xianshuCountMap.put("000101010", 28);
		gongxianFenCountMap.put("000101010", 46);
	}

	/**
	 * 计算十二线倍数及贡献分
	 */
	private static void calculateShierXian() {
		// 28
		xianshuCountMap.put("000000001", 32);
		gongxianFenCountMap.put("000000001", 30);

		xianshuCountMap.put("300000001", 32);
		gongxianFenCountMap.put("300000001", 30);

		xianshuCountMap.put("210000001", 32);
		gongxianFenCountMap.put("210000001", 30);

		xianshuCountMap.put("200000001", 32);
		gongxianFenCountMap.put("200000001", 30);

		xianshuCountMap.put("110000001", 32);
		gongxianFenCountMap.put("110000001", 30);

		xianshuCountMap.put("100000001", 32);
		gongxianFenCountMap.put("100000001", 30);

		xianshuCountMap.put("010000001", 32);
		gongxianFenCountMap.put("010000001", 30);

		xianshuCountMap.put("201000001", 32);
		gongxianFenCountMap.put("201000001", 32);

		xianshuCountMap.put("120000001", 32);
		gongxianFenCountMap.put("120000001", 32);

		xianshuCountMap.put("111000001", 32);
		gongxianFenCountMap.put("111000001", 32);

		xianshuCountMap.put("101000001", 32);
		gongxianFenCountMap.put("101000001", 32);

		xianshuCountMap.put("020000001", 32);
		gongxianFenCountMap.put("020000001", 32);

		xianshuCountMap.put("011000001", 32);
		gongxianFenCountMap.put("011000001", 32);

		xianshuCountMap.put("001000001", 32);
		gongxianFenCountMap.put("001000001", 32);

		xianshuCountMap.put("100100001", 32);
		gongxianFenCountMap.put("100100001", 36);

		xianshuCountMap.put("010100001", 32);
		gongxianFenCountMap.put("010100001", 36);

		xianshuCountMap.put("200100001", 32);
		gongxianFenCountMap.put("200100001", 36);

		xianshuCountMap.put("030000001", 32);
		gongxianFenCountMap.put("030000001", 36);

		xianshuCountMap.put("010100001", 32);
		gongxianFenCountMap.put("010100001", 36);

		xianshuCountMap.put("000100001", 32);
		gongxianFenCountMap.put("000100001", 36);

		xianshuCountMap.put("002000001", 32);
		gongxianFenCountMap.put("002000001", 36);

		xianshuCountMap.put("001100001", 32);
		gongxianFenCountMap.put("001100001", 38);

		xianshuCountMap.put("100010001", 32);
		gongxianFenCountMap.put("100010001", 40);

		xianshuCountMap.put("010010001", 32);
		gongxianFenCountMap.put("010010001", 40);

		xianshuCountMap.put("000200001", 32);
		gongxianFenCountMap.put("000200001", 40);

		xianshuCountMap.put("000010001", 32);
		gongxianFenCountMap.put("000010001", 40);

		xianshuCountMap.put("001010001", 32);
		gongxianFenCountMap.put("001010001", 42);

		xianshuCountMap.put("000110001", 32);
		gongxianFenCountMap.put("000110001", 46);
	}
}
