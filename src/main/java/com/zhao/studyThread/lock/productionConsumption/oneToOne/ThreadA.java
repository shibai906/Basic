package com.zhao.studyThread.lock.productionConsumption.oneToOne;

public class ThreadA extends Thread {
	
	private MyService service ;
	private Entity entity ;
	
	public ThreadA(MyService service , Entity entity){
		
		this.service = service;
		this.entity = entity;
		
	}
	
	@Override
	public void run() {
		while(true)
		service.set(entity);
		
	}
	
	
	
}
