package com.zhao.studyThread.StopThread;

public class TestStopThread {
	
	public static void main(String[] args) throws InterruptedException {
		
		ExceptionStop es = new ExceptionStop();
		es.start();
		Thread.sleep(10);
		System.out.println("你好");
		System.out.println("你好");
		System.out.println("你好");
		es.interrupt();
		
	}
	
}
