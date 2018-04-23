package com.zhao.studyThread.communication.WaitInterrupt;

public class Entity {
	public void method(Object lock){
		try {
			System.out.println("wait start");
			
			lock.wait();
			System.out.println("wait end");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
}
