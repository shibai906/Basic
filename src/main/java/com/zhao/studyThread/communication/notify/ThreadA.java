package com.zhao.studyThread.communication.notify;

public class ThreadA extends Thread {
	
	private Entity entity;
	private Object obj ;
	public ThreadA(Entity entity,Object obj){
		this.entity = entity;
		this.obj = obj;
	}
	
	@Override
	public void run() {
		
		entity.method(obj);
		
	}
	
	
}
