package com.zhao.studyThread.communication.waitNotify;

public class ThreadB extends Thread {
	
	private  Object lock;
	public ThreadB(Object lock){
		this.lock = lock;
	}
	
	@Override
	public void run() {
		synchronized (lock) {
			System.out.println("进锁");
			lock.notify();
		}

	}
}
