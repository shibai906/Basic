package com.zhao.studyThread.lock.method.awaitUninterruptibly;

public class TestAwaitUninterruptibly {
	
	public static void main(String[] args) throws InterruptedException {
		
		Entity entity = new Entity();
		ThreadA ta = new ThreadA(entity);
		ta.start();
		Thread.sleep(1000);
		ta.interrupt();
		ThreadB tb = new ThreadB(entity);
		tb.start();
		
	}
	
}	
