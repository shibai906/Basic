package com.zhao.studyThread.noThisSynch;

public class ThreadB extends Thread{
	
	private Entity entity;
	
	public ThreadB(Entity entity){
		this.entity = entity;
	}
	
	@Override
	public void run() {
		super.run();
		entity.set("jiao", "jiao");
	}
}
