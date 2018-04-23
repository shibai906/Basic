package com.zhao.studyThread.staticThread;

public class ThreadD extends Thread {
	public Entity entity;

	
	public ThreadD(Entity entity){
		this.entity = entity;
	}
	
	@Override
	public void run() {
		super.run();
		entity.printD();
		
		
	}
	
	
}
