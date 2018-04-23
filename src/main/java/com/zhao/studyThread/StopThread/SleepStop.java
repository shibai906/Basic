package com.zhao.studyThread.StopThread;

public class SleepStop extends Thread {
	
	@Override
	public void run() {
		super.run();
		try {
			System.out.println("run begin");
			
			Thread.sleep(100);
			System.out.println("end");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}
	
}
