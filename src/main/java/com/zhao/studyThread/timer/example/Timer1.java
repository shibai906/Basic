package com.zhao.studyThread.timer.example;

import java.util.Date;
import java.util.TimerTask;


public class Timer1 extends TimerTask {

	@Override
	public void run() {
		System.out.println("任务执行了，时间为：" + new Date());
	}
	
}
