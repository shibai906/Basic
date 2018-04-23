package com.zhao.studyThread.lock.ReentrantReadWriteLock;

/*
 * 	读读共享
 * 	写写互斥
 * 	读写互斥
 * 	写读互斥
 * 
 */

public class TestReentrnatReadWriteLock {
	public static void main(String[] args) {
		
		Entity entity = new Entity();
		ThreadA ta = new ThreadA(entity);
		ThreadB tb = new ThreadB(entity);
		
		tb.start();
		ta.start();
		
	}
	
}
