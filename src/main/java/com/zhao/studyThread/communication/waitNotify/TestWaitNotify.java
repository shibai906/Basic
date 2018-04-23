package com.zhao.studyThread.communication.waitNotify;

public class TestWaitNotify {

	public static void main(String[] args) throws InterruptedException {
		Object obj = new Object();
		ThreadA ta = new ThreadA(obj);
		ThreadB tb = new ThreadB(obj);
		ta.start();
		Thread.sleep(1000);
		tb.start();
	}

}
