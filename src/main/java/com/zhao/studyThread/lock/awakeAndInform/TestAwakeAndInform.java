package com.zhao.studyThread.lock.awakeAndInform;

public class TestAwakeAndInform {
	
	public static void main(String[] args) throws InterruptedException {
		
		Entity entity = new Entity();
		ThreadA ta = new ThreadA(entity);
		ta.start();
		
		Thread.sleep(5000);
		entity.signal();
	}
	
}
