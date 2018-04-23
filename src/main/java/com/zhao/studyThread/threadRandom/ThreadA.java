package com.zhao.studyThread.threadRandom;

public class ThreadA extends Thread{
	
	Entity entity = new Entity();
	
	public ThreadA(Entity entity){
		this.entity = entity;
	}
	@Override
	public void run() {
		super.run();
		for(int i = 0 ; i < 100 ; i++){
			entity.aad("huan" + i);
		}
		
	}
	
	
}
