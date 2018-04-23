package com.zhao.studyThread.lock.reentrantLock2;

public class ThreadBA extends Thread {
	
	private Entity entity = new Entity();
	public ThreadBA(Entity entity){
		this.entity = entity;
	}
	
	@Override
	public void run() {
		entity.methodA();
		
	}
	
}
