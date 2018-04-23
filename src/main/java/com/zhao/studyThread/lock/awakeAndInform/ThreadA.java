package com.zhao.studyThread.lock.awakeAndInform;

public class ThreadA extends Thread {
	private Entity entity;
	public ThreadA(Entity entity){
		this.entity = entity;
	}
	@Override
	public void run() {
		entity.waitMethod();
	}
	
	
}
