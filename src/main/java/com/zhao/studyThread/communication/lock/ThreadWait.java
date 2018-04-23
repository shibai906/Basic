package com.zhao.studyThread.communication.lock;

public class ThreadWait extends Thread {

	private Object lock;

	public ThreadWait(Object lock) {
		this.lock = lock;
	}

	@Override
	public void run() {
		try {
			synchronized (lock) {
				System.out.println("ThreadWait 开头" + System.currentTimeMillis());
				lock.wait();
				System.out.println("ThreadWait 结尾" + System.currentTimeMillis());
			}

		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
