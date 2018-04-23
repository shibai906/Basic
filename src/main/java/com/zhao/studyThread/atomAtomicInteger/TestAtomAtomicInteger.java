package com.zhao.studyThread.atomAtomicInteger;

public class TestAtomAtomicInteger {
	
	public static void main(String[] args) {
		
		AddCountThread count = new AddCountThread();
		count.start();
		Thread t1 = new Thread(count);
		t1.start();
		Thread t2 = new Thread(count);
		t2.start();
		Thread t3 = new Thread(count);
		t3.start();
		Thread t4 = new Thread(count);
		t4.start();
		
	}
	
}
