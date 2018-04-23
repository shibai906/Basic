package com.zhao.studyThread.ThreadState;

public class ThreadA extends Thread {
	
	public ThreadA(){
		System.out.println("构造方法中的状态："+Thread.currentThread().getState());
	}
	
	@Override
	public void run() {
		System.out.println("run方法中的状态" + Thread.currentThread().getState());
	}
	
}
