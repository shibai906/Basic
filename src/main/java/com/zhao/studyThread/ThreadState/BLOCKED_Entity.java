package com.zhao.studyThread.ThreadState;

public class BLOCKED_Entity {
	
	synchronized public static void serviceMethod(){
		try {
			System.out.println(Thread.currentThread().getName() + "进入了业务方法");
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}
