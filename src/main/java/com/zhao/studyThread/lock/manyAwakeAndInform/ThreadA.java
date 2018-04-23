package com.zhao.studyThread.lock.manyAwakeAndInform;

public class ThreadA extends Thread {
	private Entity entity;
	public ThreadA(Entity entity){
		this.entity = entity;
	}
	@Override
	public void run() {
		entity.awaitA();
	}
	
	
}
