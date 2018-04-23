package com.zhao.studyThread.lock.reentrantLock;

public class ThreadA extends Thread {
	
	private Entity entity;
	public ThreadA(Entity entity) {
		// TODO Auto-generated constructor stub
		this.entity = entity;
	}

	@Override
	public void run() {
		entity.testMethod();
		
	}
	
}
