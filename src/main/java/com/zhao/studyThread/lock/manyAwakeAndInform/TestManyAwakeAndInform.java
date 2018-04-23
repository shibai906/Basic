package com.zhao.studyThread.lock.manyAwakeAndInform;

public class TestManyAwakeAndInform {
	
	public static void main(String[] args) throws InterruptedException {
		
		Entity entity = new Entity();
		ThreadA ta = new ThreadA(entity);
		ThreadB tb = new ThreadB(entity);
		
		ta.setName("A");
		tb.setName("B");
		ta.start();
		tb.start();
		Thread.sleep(1000);
		entity.signalAll();
		
	}
	
}
