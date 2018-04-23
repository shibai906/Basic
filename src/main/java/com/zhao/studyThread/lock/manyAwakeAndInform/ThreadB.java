package com.zhao.studyThread.lock.manyAwakeAndInform;

public class ThreadB extends Thread {
	private Entity entity;
	public ThreadB(Entity entity){
		this.entity = entity;
	}
	@Override
	public void run() {
		entity.awaitB();
	}
	
	
}
