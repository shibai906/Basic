package com.zhao.studyThread.communication.waitNotify;

public class ThreadA extends Thread {

	private Object lock;

	public ThreadA(Object lock) {
		this.lock = lock;
	}

	public void run() {
		try {
			synchronized (lock) {
				System.out.println(System.currentTimeMillis());
				lock.wait(5000);
				System.out.println(System.currentTimeMillis());
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
