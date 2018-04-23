package com.zhao.studyThread.ExcetionThread;

/*
 * 出现异常，锁会自动释放，简单解释这个线程发生的错误，然后释放锁
 * 别的线程然后执行完，在抛出异常。
 * 错误类似于主线程
 * 
 */

public class TestExcetionThread {
	
	public static void main(String[] args) {
		
		ExcetionFunction ef = new ExcetionFunction();
		ThreadTest tt = new ThreadTest(1, ef);
		ThreadTest ttt = new ThreadTest(2, ef);
		tt.start();
		ttt.start();
		
	}
	
}
