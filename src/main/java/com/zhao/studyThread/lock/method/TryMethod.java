package com.zhao.studyThread.lock.method;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

public class TryMethod {

	private ReentrantLock lock = new ReentrantLock();

	public void lockInterruptibly() {

		try {
			lock.lockInterruptibly();

			System.out.println("lock begin " + Thread.currentThread().getName());
			for (int i = 0; i < Integer.MAX_VALUE / 10; i++) {
				String str = new String();
				Math.random();
			}
			System.out.println("  lock end" + Thread.currentThread().getName());

		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (lock.isHeldByCurrentThread()) {
				lock.unlock();
			}
		}
	}
	
	/*
	 *  仅在调用时锁定未被另一个线程保持的情况下，才获取该锁定。
	 */
	public void tryLock(){
		
		if(lock.tryLock()){
			System.out.println(Thread.currentThread().getName() + "获得锁");
			lock.unlock();
		}else{
			System.out.println(Thread.currentThread().getName() + "没有获得锁");
		}
	}
	// 其实TimeUnit.SECONDS  1 就是要一秒钟以后，效果和上面一样
	public void tryLockPara(){
		try {
			if(lock.tryLock(1, TimeUnit.SECONDS)){
				System.out.println("   " + Thread.currentThread().getName()
						+"获得锁的时间：" + System.currentTimeMillis());
				Thread.sleep(1000);
			}else{
				System.out.println("  " + Thread.currentThread().getName() + "  没有获得锁");
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (lock.isHeldByCurrentThread()) {
				lock.unlock();
			}
		}
	}
	
	
}
