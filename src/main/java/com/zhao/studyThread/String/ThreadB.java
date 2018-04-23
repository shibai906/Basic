package com.zhao.studyThread.String;

public class ThreadB extends Thread {
public Entity entity;

	
	public ThreadB(Entity entity){
		this.entity = entity;
	}
	
	@Override
	public void run() {
		super.run();
		entity.method("huan");
	}
	
	
	
}
