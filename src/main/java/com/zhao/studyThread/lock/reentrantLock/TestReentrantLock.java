package com.zhao.studyThread.lock.reentrantLock;

public class TestReentrantLock {
	
	public static void main(String[] args) {
		Entity entity = new Entity();
		ThreadA ta1 = new ThreadA(entity);
		ThreadA ta2 = new ThreadA(entity);
		ThreadA ta3 = new ThreadA(entity);
		ThreadA ta4 = new ThreadA(entity);
		
		ta1.start();
		ta2.start();
		ta3.start();
		ta4.start();
		
	
		
	}
	
}
