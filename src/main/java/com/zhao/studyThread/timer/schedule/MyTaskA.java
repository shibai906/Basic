package com.zhao.studyThread.timer.schedule;

import java.util.Date;
import java.util.TimerTask;

public class MyTaskA extends TimerTask{
	@Override
	public void run() {
		
		System.out.println("运行了！ 时间为：" + new Date());
	}

}
