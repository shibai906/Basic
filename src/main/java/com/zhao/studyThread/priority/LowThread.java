package com.zhao.studyThread.priority;

public class LowThread extends Thread {
	
	@Override
	public void run() {
		super.run();
//		this.setPriority(MIN_PRIORITY);
//		for(int i = 0 ; i< 100 ; i++)
//			System.out.println("LowThread" + i);
		System.out.println("LowThread end");
	}
	
}
