package com.zhao.studyThread.synchronizedVolatile;

public class ThreadA extends Thread {
	
	private Entity entity;
	
	public ThreadA(Entity entity){
		this.entity = entity;
	}
	
	@Override
	public void run() {
		super.run();
		entity.runMethod();
	
	}
	
}
