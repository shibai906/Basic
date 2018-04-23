package com.zhao.cn.date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Demo {
	public static void main(String[] args) {
		Date d = new Date();
		SimpleDateFormat spf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String dd = spf.format(d);
		System.out.println(dd);
		
	}
}
