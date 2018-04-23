package com.zhao.studyThread.priority;

public class HighThread extends Thread{

	@Override
	public void run() {
		super.run();
//		this.setPriority(NORM_PRIORITY);
//		for(int i = 0 ; i< 100 ; i++)
//			System.out.println("HighThread" + i);
		System.out.println("HighThread end");
	}
	
}
