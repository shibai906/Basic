package com.zhao.studyThread.threadRandom;

public class ThreadB extends Thread{
	
	Entity entity = new Entity();
	
	public ThreadB(Entity entity){
		this.entity = entity;
	}
	@Override
	public void run() {
		super.run();
		for(int i = 0 ; i < 100 ; i++){
			entity.aad("jiao" + i);
		}
		
	}
	
	
}
