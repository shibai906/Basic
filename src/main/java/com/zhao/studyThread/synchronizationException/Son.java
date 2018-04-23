package com.zhao.studyThread.synchronizationException;

public class Son extends Father {
	
	@Override
	public void method() {
		try {
			System.out.println("这是子类的第一步执行方法");
			Thread.sleep(2000);
			System.out.println("这是子类的第二部执行方法");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}
