package com.zhao.studyThread;

public class TestThreadExtends implements Runnable{
	
	private int i = 5;
	
	@Override
	public synchronized void run() {
			System.out.println("i = " + (i --) + "---- ThreadName:" + Thread.currentThread().getName());
		
	}

}
