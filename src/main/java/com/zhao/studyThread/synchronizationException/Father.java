package com.zhao.studyThread.synchronizationException;

public class Father {
	
	public synchronized void method(){
		try {
			
			System.out.println("这是父亲的的第一步方法");
			Thread.sleep(200);
			System.out.println("这是父亲的第二部方法");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}
