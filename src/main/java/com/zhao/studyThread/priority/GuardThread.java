package com.zhao.studyThread.priority;

public class GuardThread extends Thread {
	
	@Override
	public void run() {
		super.run();
		
		try {
			Thread.sleep(100);
			System.out.println("这里会不会执行？");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		};
	
	}
	
}
