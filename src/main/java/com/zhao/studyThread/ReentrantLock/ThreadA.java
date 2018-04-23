package com.zhao.studyThread.ReentrantLock;

public class ThreadA extends Thread {
	
	@Override
	public void run() {
		super.run();
		Entity ent = new Entity();
		ent.method1();
	
	}
	
	
}
