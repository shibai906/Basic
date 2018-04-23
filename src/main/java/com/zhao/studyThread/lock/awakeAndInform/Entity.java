package com.zhao.studyThread.lock.awakeAndInform;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class Entity {
	
	private ReentrantLock lock = new ReentrantLock();
	private Condition condition = lock.newCondition();
	
	public void waitMethod(){
		
		try{
			lock.lock();
			System.out.println(" await时间为" + System.currentTimeMillis());
			condition.await();
		}catch(InterruptedException e){
			e.printStackTrace();
		} finally {
			lock.unlock();
			
		}
	}
	
	public void signal(){
		
		try{
			lock.lock();
			System.out.println("signal 时间为" + System.currentTimeMillis());
			condition.signal();
		} finally{
			lock.unlock();
		}
	}
	
}
