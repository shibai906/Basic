package com.zhao.newFeature.jdk7numshang;

import java.util.SimpleTimeZone;

public class Demo {
	static public  void main(String[] args) {
		// jdk1.7出现的新特性，实用数的时候可以用_隔开，方便阅读
		// _不能出现在数的开头，数的结尾，进制后面，以及.后面
		// 在字符串中定义不能转换
		String str = "10000";
		int i = Integer.parseInt(str);
		
		int in = Integer.valueOf(str).intValue();
		System.out.println(in);
		
		System.out.println(i);
		int num = 1_1000_1000;

		System.out.println(num);
		
		SimpleTimeZone stz = new SimpleTimeZone(10000, "行神庙");
		System.out.println(stz.getDisplayName());

	}
}
