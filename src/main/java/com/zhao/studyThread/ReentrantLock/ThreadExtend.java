package com.zhao.studyThread.ReentrantLock;

public class ThreadExtend extends Thread {
	
	@Override
	public void run() {
		super.run();
		ExtendEntity ee = new ExtendEntity();
		ee.method();
	}
	
}
