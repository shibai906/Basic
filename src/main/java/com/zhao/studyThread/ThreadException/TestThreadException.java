package com.zhao.studyThread.ThreadException;

import java.lang.Thread.UncaughtExceptionHandler;

public class TestThreadException {
	
	public static void main(String[] args) {
		threadManyException();
	}
	
	public static void threadManyException(){
		ThreadA ta = new ThreadA();
		ta.setName("线程ta");
		// 把异常交给这两个方法处理了
		// 给指定线程对象设置的异常处理器，Thread.setDefaultUncaughtExceptionHandler(eh);给所有线程对象设置异常
		Thread.setDefaultUncaughtExceptionHandler(new UncaughtExceptionHandler() {
			public void uncaughtException(Thread t, Throwable e) {
				System.out.println("线程：" + t.getName() + "出了异常");
				e.printStackTrace();
			}
		});
		ta.start();
		ThreadA tb = new ThreadA();
		tb.setName("线程tb");
		tb.start();
	}
	
	public static void threadOneException(){
		ThreadA ta = new ThreadA();
		ta.setName("线程ta");
		
		// 给指定线程对象设置的异常处理器，ta.setDefaultUncaughtExceptionHandler(eh);给所有线程对象设置异常
		ta.setUncaughtExceptionHandler(new UncaughtExceptionHandler(){
			@Override
			public void uncaughtException(Thread t, Throwable e) {
				System.out.println("线程：" + t.getName() + "出现了异常");
			}
		});
		ta.start();
		ThreadA tb = new ThreadA();
		tb.setName("线程tb");
		tb.start();
	}
	
}
