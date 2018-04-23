package com.zhao.studyThread.communication.productionConsumption;

public class Consumption {
	
	private Object lock;
	public Consumption(Object lock){
		this.lock = lock;
	}
	public void getValue(){
		try{
			synchronized(lock){
				while("".equals(Entity.value)){
					lock.wait();
				}
				System.out.println("get的值是" + Entity.value);
				Entity.value = "";
				lock.notify();
			}
		}catch(InterruptedException e){
			e.printStackTrace();
		}
	}
	
}
