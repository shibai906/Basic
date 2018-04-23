package com.zhao.studyThread.ThreadException.group;

public class ThreadA extends Thread {
	
	private String num;
	public ThreadA(ThreadGroup group , String name , String num){
		super(group,name);
		this.num = num;
	}
	@Override
	public void run() {
		int numInt = Integer.parseInt(num);
		while(this.isInterrupted() == false){
			System.out.println("死循环中：" + Thread.currentThread().getName());
		}
	}
	
}
