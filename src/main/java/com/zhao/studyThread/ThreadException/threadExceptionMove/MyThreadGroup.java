package com.zhao.studyThread.ThreadException.threadExceptionMove;

public class MyThreadGroup extends ThreadGroup {

	public MyThreadGroup(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	// 在这里实现了interrupt给每个线程
	@Override
	public void uncaughtException(Thread t, Throwable e) {
		System.out.println("线程组的异常处理");
		super.uncaughtException(t, e);
		e.printStackTrace();
		
	}

}
