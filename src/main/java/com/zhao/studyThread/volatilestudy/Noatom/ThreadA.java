package com.zhao.studyThread.volatilestudy.Noatom;

public class ThreadA extends Thread {
	
	 public static int count;
	private static void addCount(){
		for(int i = 0 ; i < 100 ; i++){
			count++;
		}
		System.out.println(Thread.currentThread().getName() + " count = " + count);
	}
	@Override
	public void run() {
		super.run();
		addCount();
	}
	
}
