package com.zhao.studyThread.communication.changeWait;

public class ThreadSubstract extends Thread {
	
	private Subtract sub;
	public ThreadSubstract(Subtract sub){
		this.sub = sub;
	}
	
	@Override
	public void run() {
		sub.subtract();
	}
	
}
