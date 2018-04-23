package com.zhao.studyThread.ThreadException.threadExceptionMove;

public class ThreadA extends Thread {
	
	private String num = "a";
	public ThreadA(){
		
	}
	public ThreadA(ThreadGroup group,String name){
		super(group,name);
	}
	@Override
	public void run() {
		int numInt = Integer.parseInt(num);
		System.out.println("在线程中打印：" + (numInt + 1));
	}
	
}
