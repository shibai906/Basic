package com.zhao.studyThread.atomAtomicInteger.NoSafe;

public class TestNoSafe {
	
	public static void main(String[] args) {
		
		Entity entity = new Entity();
		ThreadA ta1 = new ThreadA(entity);
		ta1.start();
		
		ThreadA ta2 = new ThreadA(entity);
		ta2.start();
		
		ThreadA ta3 = new ThreadA(entity);
		ta3.start();
		
		ThreadA ta4 = new ThreadA(entity);
		ta4.start();
		
	}
	
}
