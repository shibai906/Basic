package com.zhao.studyThread.ThreadException.group;

public class MyThreadGroup extends ThreadGroup {

	public MyThreadGroup(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	// 在这里实现了interrupt给每个线程
	@Override
	public void uncaughtException(Thread t, Throwable e) {
		super.uncaughtException(t, e);
		this.interrupt();
	}

}
