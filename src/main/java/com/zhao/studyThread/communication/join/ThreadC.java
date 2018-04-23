package com.zhao.studyThread.communication.join;

public class ThreadC extends Thread {
	
	private ThreadB tb ;
	public ThreadC(ThreadB tb){
		this.tb = tb;
	}
	@Override
	public void run() {
		tb.interrupt();
	}
}
