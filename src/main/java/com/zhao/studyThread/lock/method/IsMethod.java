package com.zhao.studyThread.lock.method;

import java.util.concurrent.locks.ReentrantLock;

public class IsMethod {
	
	private ReentrantLock lock = new ReentrantLock();
	
	// 查询当前线程是否保持此锁定
	public void isHeldByCurrentThread(){
		
		try{
			System.out.println(lock.isHeldByCurrentThread());
			lock.lock();
			System.out.println(lock.isHeldByCurrentThread());
		}finally{
			lock.unlock();
		}
	}
	
	public void isLocked(){
		try{
			System.out.println(lock.isLocked());
			lock.lock();
			System.out.println(lock.isLocked());
		}finally{
			lock.unlock();
		}
		
	}
	
}
