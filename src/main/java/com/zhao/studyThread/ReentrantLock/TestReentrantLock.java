package com.zhao.studyThread.ReentrantLock;

public class TestReentrantLock {
	
	/*
	 * 可重入锁的概念是： 自己可以再次获取自己的内部锁。比如：如果一条线程获得了某个对象的锁还没释放
	 * 此时同一锁再次想要获取这个对象的锁时，是可以获取的。
	 * 
	 * 当存在子父类关系时，子类可以通过“可重入锁”调用父类的同步方法
	 * 
	 */
	
	public static void main(String[] args) {
		
	/*	ThreadA ta = new ThreadA();
		ta.start();*/
		ThreadExtend te = new ThreadExtend();
		te.start();
	}

	public void test(){
		
		
		
	}
	
	
}
