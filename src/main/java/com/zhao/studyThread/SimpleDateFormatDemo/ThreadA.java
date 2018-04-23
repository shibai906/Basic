package com.zhao.studyThread.SimpleDateFormatDemo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ThreadA extends Thread {
	
	private String dateString;
	
	public ThreadA(String dateString){
		this.dateString = dateString;
	}
	@Override
	public void run() {
		
		try{
			Date dateRef = DateTools.getSimpleDateFormat("yyyy-MM-dd").parse(dateString);
			String newDateString = DateTools.getSimpleDateFormat("yyyy-MM-dd").format(dateRef).toString();
			System.out.println(dateRef + " " + newDateString + " " +Thread.currentThread().getName()+" " );
			if(!newDateString.equals(dateString)){
				System.out.println("ThreadName" + this.getName() + "报错了 日期字符串：" 
						+ dateString + "转换成的日期为" + newDateString);
			}
		}catch(ParseException e){
			e.printStackTrace();
		}
	
	}
	
	
}
