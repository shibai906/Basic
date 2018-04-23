package com.zhao.studyThread.communication.waitNotify;

public class Entity {
	
	public void method1(Object lock){
		try {
			synchronized(lock){
				System.out.println("The start sleep time is" + System.currentTimeMillis());
				Thread.sleep(5000);
				System.out.println("The end sleep time is" + System.currentTimeMillis());
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void method2(Object lock){
		synchronized(lock){
			lock.notify();
		}
	}
	
}
