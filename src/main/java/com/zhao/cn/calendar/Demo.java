package com.zhao.cn.calendar;

import java.util.Calendar;

public class Demo {
	public static void main(String[] args) {
		Calendar ca = Calendar.getInstance();

		// 三年前的明天
		ca.add(Calendar.YEAR, -3);
		ca.add(Calendar.DATE, 1);
		System.out.println(ca.get(Calendar.YEAR) + "年" + (ca.get(Calendar.MONTH) + 1) + "月" + ca.get(Calendar.DATE) + "日");
		
		//可以直接设置年月日
		ca.set(2012, 04, 03);
		System.out.println(ca.get(Calendar.YEAR) + "年" + (ca.get(Calendar.MONTH) + 1) + "月" + ca.get(Calendar.DATE) + "日");

	}
}
