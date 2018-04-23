package com.zhao.studyThread.communication.productionConsumption;

public class ThreadConsumption extends Thread {
	
	private Consumption consumption;
	
	public ThreadConsumption(Consumption consumption){
		this.consumption = consumption;
	}
	
	@Override
	public void run() {
		while(true)
			consumption.getValue();
	}
	
	
}
