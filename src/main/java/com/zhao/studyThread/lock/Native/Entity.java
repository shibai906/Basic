package com.zhao.studyThread.lock.Native;

import java.util.concurrent.locks.ReentrantLock;

public class Entity {
	
	private ReentrantLock lock;
	
	public Entity(boolean isFair){
		lock = new ReentrantLock(isFair);
	}
	public void serviceMethod(){
		
		lock.lock();
		System.out.println(lock.isFair());
		System.out.println("ThreadName=" + Thread.currentThread().getName()+"获得锁定");
		lock.unlock();
	}
	
	
}
