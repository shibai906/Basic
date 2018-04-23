package com.zhao.studyThread;

public class ThreadSeq extends Thread {
	
	int i ;
	
	public ThreadSeq(int i){
		this.i = i;
	}
	
	@Override
	public synchronized void run() {
		System.out.println(i);
	}
	
	
}
