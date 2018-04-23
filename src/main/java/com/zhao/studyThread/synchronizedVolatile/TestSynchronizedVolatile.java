package com.zhao.studyThread.synchronizedVolatile;

public class TestSynchronizedVolatile {
	
	/*
	 * synchronized 使多个线程访问同一个资源具有同步性
	 * 	而且它还具有将线程工作内存种的私有变量与公共内存种的变量同步的功能
	 * 	
	 * 	关键字可以保证在同一时刻，只有一个线程可以执行某一个方法或某一代码块，它具有互斥性和可见性
	 * 	同步synchronized不可可以解决一个线程看到对象处于不一致的状态，还可以保证进入同步方法
	 * 	或者同步代码块的每个线程，都看到由同一个锁保护之前所有的修改效果。
	 * 		多线程，要着重“外练互斥，内修可见”
	 * 
	 */
	
	public static void main(String[] args) throws InterruptedException {
		
		Entity entity = new Entity();
		ThreadA ta = new ThreadA(entity);
		ThreadB tb = new ThreadB(entity);
		ta.start();
		Thread.sleep(1000);
		tb.start();
		System.out.println("已经发起停止的命令了");
		
	}
	
}
