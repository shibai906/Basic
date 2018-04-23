package com.zhao.studyThread.communication.productionConsumption;

public class ThreadProduction extends Thread {
	
	private Production production ;
	public ThreadProduction(Production production){
		this.production = production;
	}
	
	@Override
	public void run() {
		while(true)
			production.setValue();
		
	}
	
}
