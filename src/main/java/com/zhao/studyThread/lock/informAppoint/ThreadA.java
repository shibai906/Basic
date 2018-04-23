package com.zhao.studyThread.lock.informAppoint;

public class ThreadA extends Thread {
	private Entity entity;
	public ThreadA(Entity entity){
		this.entity = entity;
	}
	@Override
	public void run() {
		entity.await1();
	}
	
	
}
