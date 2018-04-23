package com.zhao.studyThread.timer.schedule;

import java.util.Calendar;
import java.util.Date;
import java.util.Timer;

public class TestSchedule {
	
	public static void main(String[] args) {
		scheduleAtFixedRate();
	}
	
	public static void scheduleAtFixedRate(){
		/*
		 * 这个里面有追加性，先按时间段，把过去时间给补上，然后才按时间去干别的
		 */
		MyTaskB ta = new MyTaskB();
		System.out.println("现在的时间是" + new Date());
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.SECOND, cal.get(Calendar.SECOND) - 20);
		Date run = cal.getTime();
		System.out.println("计划执行时间：" + run);
		Timer timer = new Timer();
		timer.scheduleAtFixedRate(ta, run, 2000);
		
	}
	
	public static void test2(){
		MyTaskA ta = new MyTaskA();
		Timer timer = new Timer();
		System.out.println(" 当前时间：" + new Date());
		timer.schedule(ta, 3000,1000); 
	}
	
	public static void test1(){
		MyTaskA ta = new MyTaskA();
		Timer timer = new Timer();
		System.out.println(" 当前时间：" + new Date());
		timer.schedule(ta, 3000); // 后面直接跟数字，是多少毫秒后执行
	}
	
}
