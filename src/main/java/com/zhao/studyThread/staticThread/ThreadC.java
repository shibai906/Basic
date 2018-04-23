package com.zhao.studyThread.staticThread;

public class ThreadC extends Thread {
	
	private Entity entity;
	public ThreadC(Entity entity){
		this.entity = entity;
		
	}
	
	@Override
	public void run() {
		super.run();
		entity.printC();
	}
	
	
}
