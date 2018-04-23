package com.zhao.studyThread.synchronizationCodeBlock;

/*
 * 从运行结果可以看出，这里在一个对象中，在Entity方法中，两个线程加的是同一把this锁
 * 	一半是异步，一半是同步
 * 
 */

public class TestSynchnizationCodeBlock {
	
	public static void main(String[] args) {
		
		Entity entity = new Entity();
		
		ThreadA ta = new ThreadA(entity);
		ThreadB tb = new ThreadB(entity);
		ta.start();
		tb.start();
	}
	
}
