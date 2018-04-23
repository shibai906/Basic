package com.zhao.studyThread.lock.method.awaitUninterruptibly;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Entity {

	private Lock lock = new ReentrantLock();
	private Condition con = lock.newCondition();
	
	public void method(){
		try{
			lock.lock();
			System.out.println("wait begin");
			/*
			 * 它就类似与wait的作用，不过不一样的是它不抛出异常
			 */
			con.awaitUninterruptibly();
			System.out.println("wait end");
		}finally{
			lock.unlock();
		}
	}
	
	public void methodNo(){
		lock.lock();
		con.signal();
		lock.unlock();
	}
	
}
