package com.zhao.studyThread.interrupt;

public class TestExecuteThread {
	
	public static void main(String[] args) throws InterruptedException {
		
		// 这里是测试第一种interrupted，这里两个都是false
	  ExecuteThread et = new ExecuteThread();
		Thread td = new Thread(et);
		td.start();
		
	
		td.interrupt();
		System.out.println("是否停止1" + td.interrupted());
		System.out.println("是否停止2" + td.interrupted());
		
		
		
		/*
		Thread.currentThread().interrupt();
		System.out.println("是否停止1" + Thread.interrupted());
		System.out.println("是否停止2" + Thread.interrupted());
		System.out.println("end");*/
		
		
		
	}
		
}	
