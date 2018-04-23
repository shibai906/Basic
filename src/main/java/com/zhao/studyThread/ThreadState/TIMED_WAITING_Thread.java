package com.zhao.studyThread.ThreadState;

public class TIMED_WAITING_Thread extends Thread {
	
	@Override
	public void run() {
		try {
			System.out.println("begin sleep");
			Thread.sleep(5000);
			System.out.println("end sleep");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}
