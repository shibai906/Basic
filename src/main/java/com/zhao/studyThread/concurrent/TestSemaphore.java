package com.zhao.studyThread.concurrent;

import java.util.concurrent.Semaphore;

public class TestSemaphore implements Runnable {
	
	final Semaphore semaphore = new Semaphore(5);
	
	@Override
	public void run() {
		
		try {
			semaphore.acquire();
			Thread.sleep(2000);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
