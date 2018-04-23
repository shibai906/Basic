package com.zhao.studyThread.communication.join;

public class ThreadA extends Thread {
	
	@Override
	public void run() {
		
		for(int i = 0; i < Integer.MAX_VALUE ; i++){
			String newString = new String();
			Math.random();
		}
	}
	
}
