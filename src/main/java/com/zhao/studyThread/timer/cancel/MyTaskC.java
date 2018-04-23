package com.zhao.studyThread.timer.cancel;

import java.util.Date;
import java.util.TimerTask;

public class MyTaskC extends TimerTask {

	@Override
	public void run() {
		
		System.out.println("C run timer=" + new Date());
		
	}

}
