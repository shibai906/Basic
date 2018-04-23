package com.zhao.studyThread.communication.joinLang;

/*
 * 当使用join(时间)这个时候，要特别注意，如果那个线程加锁，join如果时间小于那个时间，一定要那个执行完，才能执行这个锁
 */

public class TestJoinLang {
	
	public static void main(String[] args) throws InterruptedException {
		
		ThreadB tb = new ThreadB();
		ThreadA ta = new ThreadA(tb);
		
		ta.start();
		tb.start();
		tb.join(1000);
		
		System.out.println("  main end="  + System.currentTimeMillis());
		
		
	}
	
}
