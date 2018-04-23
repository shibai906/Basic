package com.zhao.studyThread.volatilestudy.test;

public class PrintString implements Runnable{
	
	volatile boolean inContinuPrint = true ;

	public boolean isInContinuPrint() {
		return inContinuPrint;
	}

	public void setInContinuPrint(boolean inContinuPrint) {
		this.inContinuPrint = inContinuPrint;
	}
	
	public void printStringMethod(){
		try {
			while(inContinuPrint){
				System.out.println("run printStringMethod threadName="
						+ Thread.currentThread().getName());
				Thread.sleep(2000);
			}
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public void run() {
		
		System.out.println("线程开始了");
		while(inContinuPrint){
		}
		System.out.println("线程结束了");
		
	}
	
}
