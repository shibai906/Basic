package com.zhao.studyThread.ThreadException.threadExceptionMove;

public class TestThreadExceptionMove {
	
	public static void main(String[] args) {
		manyThread();
	}
	
	public static void manyThread(){
		MyThreadGroup mg = new MyThreadGroup("我的线程组");
		ThreadA ta = new ThreadA(mg,"我的线程");
		// 线程组的异常和这个异常都执行，线程组保证每个线程执行异常，而这里保证所有线程都要异常
		// ThreadA.setDefaultUncaughtExceptionHandler(new StateUncaughtExceptionHandler());
		// 线程组有这个单个线程处理方法，别的异常方法都不执行
		// ta.setUncaughtExceptionHandler(new ObjectUncaughtExceptionHandler());
		// 只有线程组的异常
		ta.start();
	}
	
	public static void oneThread(){
		/*
		 * 这里说明单个异常处理效果要比全部的强，如果都定义了，按单个的来
		 */
		ThreadA ta = new ThreadA();
		ThreadA.setDefaultUncaughtExceptionHandler(new StateUncaughtExceptionHandler());
		ta.setUncaughtExceptionHandler(new ObjectUncaughtExceptionHandler());
		ta.start();
	}
	
}
