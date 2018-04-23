package com.zhao.studyThread.testThread;

public class TestThread extends Thread {
	
	@Override
	synchronized public void run() {
		
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for(int i = 0 ; i < 100 ; i ++){
			System.out.println("TestThread " + i);
		}
	}
	
}
