package com.zhao.studyThread.communication.notify;

/*
 * 这个程序告诉我们
 * 	Notify方法要等这个锁释放后才能执行另一个
 */

public class TestNotify {
	
	public static void main(String[] args) {
		Entity entity = new Entity();
		Entity entity1 = new Entity();
		Object obj = new Object();
		ThreadA ta = new ThreadA(entity,obj);
		ThreadB tb = new ThreadB(entity1,obj);
		ta.start();
		tb.start();
		
		
	}
	
}
