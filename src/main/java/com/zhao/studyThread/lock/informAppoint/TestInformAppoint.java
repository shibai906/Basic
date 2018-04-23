package com.zhao.studyThread.lock.informAppoint;

public class TestInformAppoint {
	
	public static void main(String[] args) throws InterruptedException {
		
		Entity entity = new Entity();
		ThreadA ta = new ThreadA(entity);
		ThreadB tb = new ThreadB(entity);
		ta.setName("1");
		tb.setName("2");
		ta.start();
		tb.start();
		Thread.sleep(2000);
		entity.signalAll_1();
		
		
		
	}
	
}
