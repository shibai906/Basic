package com.zhao.studyThread.StopThread;

public class TestSleepStop {
	
	public static void main(String[] args) {
		
		try {
			SleepStop ss = new SleepStop();
			ss.start();
			Thread.sleep(200);
			ss.interrupt();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			System.out.println("main catch");
			e.printStackTrace();
		}
		System.out.println("end");
	}
	
}
