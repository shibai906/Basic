package com.zhao.studyThread.lock.productionConsumption.oneToOne;

public class ThreadB extends Thread {
	
	private MyService service ;
	private Entity entity ;
	
	public ThreadB(MyService service , Entity entity){
		
		this.service = service;
		this.entity = entity;
		
	}
	
	@Override
	public void run() {
		while(true)
		service.get(entity);
		
	}
	
	
	
}
