package com.zhao.studyThread.timer.schedule;

import java.util.Date;
import java.util.TimerTask;

public class MyTaskB extends TimerTask{

	@Override
	public void run() {
		
		System.out.println("begin timer=" + new Date());
		System.out.println("  end timer=" + new Date());
		
	}

}
