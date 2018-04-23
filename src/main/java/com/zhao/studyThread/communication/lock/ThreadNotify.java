package com.zhao.studyThread.communication.lock;

public class ThreadNotify extends Thread {

	private Object lock;

	public ThreadNotify(Object lock) {
		this.lock = lock;
	}

	@Override
	public void run() {
		synchronized (lock) {
			System.out.println("ThreadNotify 开头" + System.currentTimeMillis());

			lock.notify();
			System.out.println("ThreadNotify 结尾" + System.currentTimeMillis());
		}

	}

}
