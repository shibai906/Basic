package com.zhao.studyThread.staticThread;

public class ThreadA extends Thread {
	public Entity entity;

	
	public ThreadA(Entity entity){
		this.entity = entity;
	}
	
	@Override
	public void run() {
		super.run();
		Entity.printA();
		
		
	}
	
	
}
