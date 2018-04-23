package com.zhao.studyThread.ThreadState;

public class WAITINGThreadA extends Thread {

	@Override
	public void run() {
		try{
			synchronized(WAITINGEntity.lock){
				WAITINGEntity.lock.wait();
			}
		}catch(InterruptedException e){
			e.printStackTrace();
		}
	}
	
}
