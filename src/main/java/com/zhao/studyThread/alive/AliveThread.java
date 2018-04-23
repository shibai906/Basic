package com.zhao.studyThread.alive;

public class AliveThread extends Thread {
	
	@Override
	public void run() {
		
		System.out.println("run ----- begin");
		System.out.println("Thread.currentThread.getName="+Thread.currentThread().getName());
		System.out.println("Thread.currentTread.isAlive()="+Thread.currentThread().isAlive());
		System.out.println("this.getName="+ this.getName());
		System.out.println("this.isAlive=" + this.isAlive());
		
		super.run();
	}
	
}
