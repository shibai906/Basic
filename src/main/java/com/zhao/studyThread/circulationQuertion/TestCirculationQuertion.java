package com.zhao.studyThread.circulationQuertion;

/*
 * 这个没什么好解决的办法，只能让线程不等待，还有就是别放同一把锁就行
 */

public class TestCirculationQuertion {
	
	public static void main(String[] args) {
		Entity entity = new Entity();
		ThreadA ta = new ThreadA(entity);
		ThreadB tb = new ThreadB(entity);
		ta.start();
		tb.start();
	}
	
}
