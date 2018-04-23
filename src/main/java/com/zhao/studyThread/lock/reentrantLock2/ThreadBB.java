package com.zhao.studyThread.lock.reentrantLock2;

public class ThreadBB extends Thread {
	
	private Entity entity = new Entity();
	public ThreadBB(Entity entity){
		this.entity = entity;
	}
	
	@Override
	public void run() {
		entity.methodB();
		
	}
	
}
