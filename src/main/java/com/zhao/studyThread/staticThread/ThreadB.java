package com.zhao.studyThread.staticThread;

public class ThreadB extends Thread {
public Entity entity;

	
	public ThreadB(Entity entity){
		this.entity = entity;
	}
	
	@Override
	public void run() {
		super.run();
		entity.printB();
	}
	
	
	
}
