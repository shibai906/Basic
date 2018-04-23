package com.zhao.studyThread.lock.method;

public class TestMethod {
	
	public static void main(String[] args) throws InterruptedException {
		
		GetHoldCount ghc = new GetHoldCount();
		Runnable ru = new Runnable(){

			@Override
			public void run() {
				ghc.getQuererLength();
			}
			
		};
		Runnable ruu = new Runnable(){
			@Override
			public void run() {
				ghc.getWait();
			}
			
		};
		
		for(int i = 0 ; i < 10 ; i ++){
			Thread t = new Thread(ru);
			t.start();
		}Thread t = new Thread(ruu);
		t.start();
		Thread.sleep(1000);
		
//		System.out.println(ghc.lock.getQueueLength());
//		System.out.println(ghc.lock.getWaitQueueLength(ghc.con));
		
	}
	
}
