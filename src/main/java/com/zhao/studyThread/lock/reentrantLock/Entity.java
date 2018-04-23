package com.zhao.studyThread.lock.reentrantLock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Entity {
	
	// lock这里也需要同一把锁
	
	private Lock lock = new ReentrantLock();
	
	public void testMethod(){
		lock.lock();
		for(int i = 0 ; i < 10 ; i ++){
			System.out.println("ThreadName=" + Thread.currentThread().getName()
					+ (" " + (i + 1)));
		}
		lock.unlock();
	}
	
}
