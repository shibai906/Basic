package com.zhao.studyThread.lock.informAppoint;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Entity {

	private Lock lock = new ReentrantLock();
	private Condition con1 = lock.newCondition();
	private Condition con2 = lock.newCondition();

	public void await1() {

		try {
			lock.lock();
			System.out.println(" begin await1()时间为 " + System.currentTimeMillis() + " ThreadName="
					+ Thread.currentThread().getName());
			con1.await();
			System.out.println(" end await1()时间为 " + System.currentTimeMillis() + " ThreadName="
					+ Thread.currentThread().getName());
		} catch (InterruptedException e) {
			e.printStackTrace();
		} finally {
			lock.unlock();

		}

	}

	public void await2() {

		try {
			lock.lock();
			System.out.println(" begin await2()时间为 " + System.currentTimeMillis() + " ThreadName="
					+ Thread.currentThread().getName());
			con2.await();
			System.out.println(" end await2()时间为 " + System.currentTimeMillis() + " ThreadName="
					+ Thread.currentThread().getName());
		} catch (InterruptedException e) {
			e.printStackTrace();
		} finally {
			lock.unlock();

		}

	}

	public void signalAll_1() {

		lock.lock();
		System.out.println(
				" signalAll_1时间为" + System.currentTimeMillis() + "ThreadName=" + Thread.currentThread().getName());
		con1.signal();
		lock.unlock();

	}

	public void signalAll_2() {

		lock.lock();
		System.out.println(
				" signalAll_2时间为" + System.currentTimeMillis() + "ThreadName=" + Thread.currentThread().getName());
		con2.signal();
		lock.unlock();

	}

}
