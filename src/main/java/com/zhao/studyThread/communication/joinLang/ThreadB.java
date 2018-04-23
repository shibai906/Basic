package com.zhao.studyThread.communication.joinLang;

public class ThreadB extends Thread {
	
	@Override
	synchronized public void run() {
		try {
			System.out.println("B begin" + System.currentTimeMillis());
			Thread.sleep(2000);
			System.out.println("B end" + System.currentTimeMillis());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}
