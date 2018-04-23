package com.zhao.studyThread.dirtyRead;

public class ThreadA extends Thread{
	
	private Entity entity;
	public ThreadA(Entity entity){
		this.entity = entity;
	}
	
	@Override
	public void run() {
		super.run();
		entity.setValue("zhao", "huan");
	}
}
