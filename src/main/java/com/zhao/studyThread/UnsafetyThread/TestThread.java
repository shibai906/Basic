package com.zhao.studyThread.UnsafetyThread;

import com.zhao.studyThread.TestThreadExtends;

public class TestThread {
	
	public static void main(String[] args) {
	/*	MyThreadA t1 = new MyThreadA();
		MyThreadB t2 = new MyThreadB();
		t1.start();
		t2.start();*/
		
		teset();
		
	}

	private static void teset() {
		
		TestThreadExtends tte = new TestThreadExtends();
		Thread t1 = new Thread(tte);
		Thread t2 = new Thread(tte);
		Thread t3 = new Thread(tte);
		Thread t4 = new Thread(tte);
		Thread t5 = new Thread(tte);
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		
	}
	
}
