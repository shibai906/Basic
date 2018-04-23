package com.zhao.studyThread.lock.method;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class HasMethod {
	
	public ReentrantLock lock = new ReentrantLock();
	public Condition con = lock.newCondition();
	
	public void hasQueuedThread(){
		
		try {
			lock.lock();
			Thread.sleep(Integer.MAX_VALUE);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			lock.unlock();
		}
		
	}
	
	public void waitMethod(){
		
		try{
			lock.lock();
			con.await();
		} catch(InterruptedException e){
			e.printStackTrace();
		} finally{
			lock.unlock();
		}
	}
	
	public void notityMethod(){
		try{
			lock.lock();
			System.out.println("有没有线程正在等待con:" + lock.hasWaiters(con) + ",线程数"
					+ lock.getWaitQueueLength(con));
		}finally{
			lock.unlock();
		}
		
	}
	
}
