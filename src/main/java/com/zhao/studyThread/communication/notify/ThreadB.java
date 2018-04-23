package com.zhao.studyThread.communication.notify;

public class ThreadB extends Thread {
	
	private Entity entity;
	private Object obj ;
	public ThreadB(Entity entity,Object obj){
		this.entity = entity;
		this.obj = obj;
	}
	
	@Override
	public void run() {
		
		entity.synNotifyMethod(obj);
		
	}
	
	
}
