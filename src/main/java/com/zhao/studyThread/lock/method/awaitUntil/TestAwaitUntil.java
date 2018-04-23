package com.zhao.studyThread.lock.method.awaitUntil;

public class TestAwaitUntil {
	
	public static void main(String[] args) throws InterruptedException {
		Entity entity = new Entity();
		ThreadA ta = new ThreadA(entity);
		ta.start();
		ThreadB tb= new ThreadB(entity);
		Thread.sleep(2000);
		tb.start();
		
	}
	
}
