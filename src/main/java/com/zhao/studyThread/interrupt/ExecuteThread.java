package com.zhao.studyThread.interrupt;

public class ExecuteThread implements Runnable{

	@Override
	public void run() {
		for(int i = 0 ; i < 5000; i ++){
			
			System.out.println(i+1);
			System.out.println(Thread.interrupted());
			
		}
	}

}
