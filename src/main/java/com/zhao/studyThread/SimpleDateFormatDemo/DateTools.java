package com.zhao.studyThread.SimpleDateFormatDemo;

import java.text.SimpleDateFormat;

public class DateTools {
	
	private static ThreadLocal<SimpleDateFormat> tl = new ThreadLocal<>();
	
	public static SimpleDateFormat getSimpleDateFormat(String str){
		SimpleDateFormat sdf = null;
		sdf = tl.get();
		if(sdf == null){
			sdf = new SimpleDateFormat(str);
			tl.set(sdf);
		}
		return sdf;
		
	}
	
}
