package com.zhao.studyThread.ThreadStopGroup;

public class ThreadA extends Thread {
	
	public ThreadA(ThreadGroup group,String name){
		super(group,name);
	}
	
	@Override
	public void run() {
		System.out.println("ThreadName = " + Thread.currentThread().getName()+"准备开始死循环了");
		
		while(!this.isInterrupted()){
			
		}
		
		System.out.println("ThreadName = " + Thread.currentThread().getName()+"结束了：");
		
	
	}
	
}
