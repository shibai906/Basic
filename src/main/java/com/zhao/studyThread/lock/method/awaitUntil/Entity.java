package com.zhao.studyThread.lock.method.awaitUntil;

import java.util.Calendar;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class Entity {

	private ReentrantLock lock = new ReentrantLock();
	private Condition con = lock.newCondition();

	public void method() {
		try {
			/*
			 * 这里定义时间的
			 */
			Calendar cal = Calendar.getInstance();
			cal.add(Calendar.SECOND, 10);
			lock.lock();
			System.out.println("wait begin timer=" + System.currentTimeMillis());
			/*
			 * 这里是等待多久，并释放线程，可用signal打破的
			 */
			con.awaitUntil(cal.getTime());
			System.out.println("wait   end eimer=" + System.currentTimeMillis());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void notifyMethod(){
		
		try{
			Calendar cal = Calendar.getInstance();
			cal.add(Calendar.SECOND, 10);
			lock.lock();
			System.out.println("notify begin timer=" + System.currentTimeMillis());
			con.signalAll();
			System.out.println("notify   end timer=" + System.currentTimeMillis());
			
		}finally {
			lock.unlock();
		}
		
	}

}
