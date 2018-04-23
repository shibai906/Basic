package com.zhao.studyThread.lock.reentrantLock2;

public class ThreadAB extends Thread {
	
	private Entity entity = new Entity();
	public ThreadAB(Entity entity){
		this.entity = entity;
	}
	
	@Override
	public void run() {
		entity.methodB();
		
	}
	
}
