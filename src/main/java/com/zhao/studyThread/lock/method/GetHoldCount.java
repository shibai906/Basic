package com.zhao.studyThread.lock.method;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class GetHoldCount {
	
	// 方法int getHoldCount()的作用是查询当前线程保持此锁定的个数，也就是调用lock()方法的个数
	public ReentrantLock lock = new ReentrantLock();
	public Condition con = lock.newCondition();

	public void getQuererLength(){
		try {
			lock.lock();
			con.await();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			lock.unlock();
		}
	}
	public void getWait(){
		lock.lock();
		System.out.println("  " + lock.getWaitQueueLength(con));
		con.signalAll();
		lock.unlock();
	}
	
}
