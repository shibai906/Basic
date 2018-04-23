package com.zhao.studyThread.atomAtomicInteger;

import java.util.concurrent.atomic.AtomicInteger;

public class AddCountThread extends Thread {
	
	/*
	 * 原子类，它的操作是不能分割的整体，没有其他线程能够中断或者检查正在原子操作种的变量
	 * 	如果想保证执行安全，那就必须加锁
	 * 
	 */
	
	private static AtomicInteger count = new AtomicInteger();
	
	@Override
	public void run() {
		super.run();
		for(int i = 0 ; i < 10; i ++){
			System.out.println(count.incrementAndGet());
		}
	}
	
}
