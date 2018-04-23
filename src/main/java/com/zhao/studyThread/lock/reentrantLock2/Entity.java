package com.zhao.studyThread.lock.reentrantLock2;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Entity {

	private Lock lock = new ReentrantLock();

	public void methodA() {

		try {

			lock.lock();
			System.out.println("MethodA begin ThreadName=" + Thread.currentThread().getName() + " time="
					+ System.currentTimeMillis());
			Thread.sleep(5000);
			System.out.println("MethodA end ThreadName=" + Thread.currentThread().getName() + " time="
					+ System.currentTimeMillis());
			lock.unlock();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void methodB() {
		try {
			lock.lock();
			System.out.println("MethodB begin ThreadName=" + Thread.currentThread().getName() + " time="
					+ System.currentTimeMillis());
			Thread.sleep(5000);
			System.out.println("MethodB end ThreadName=" + Thread.currentThread().getName() + " time="
					+ System.currentTimeMillis());
			lock.unlock();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

}
