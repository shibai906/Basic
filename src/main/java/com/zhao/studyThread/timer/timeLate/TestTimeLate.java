package com.zhao.studyThread.timer.timeLate;

import java.util.Calendar;
import java.util.Date;
import java.util.Timer;

public class TestTimeLate {
	public static void main(String[] args) {
		/*
		 * 如果那边有暂停，只会造成阻塞，还是会按时执行的，只是每次执行的时候，时间会被推迟，压在一起执行
		 * 
		 */
		System.out.println("当前时间为：" + new Date());
		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.SECOND, 10);
		Date run = cal.getTime();
		System.out.println("计划时间为" + run);
		MyTaskA ta = new MyTaskA();
		Timer timer = new Timer();
		timer.schedule(ta, run,3000);
	}
}
