package com.zhao.studyThread.lock.reentrantLock2;

public class ThreadAA extends Thread {
	
	private Entity entity = new Entity();
	public ThreadAA(Entity entity){
		this.entity = entity;
	}
	
	@Override
	public void run() {
		entity.methodA();
		
	}
	
}
