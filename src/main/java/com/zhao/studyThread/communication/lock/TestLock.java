package com.zhao.studyThread.communication.lock;

/*
 * 注意，这里的等待唤醒机制也需要同一把锁
 */

public class TestLock {

	public static void main(String[] args) throws InterruptedException {

		Object lock = new Object();
		ThreadWait tw = new ThreadWait(lock);
		tw.start();
		Thread.sleep(3000);
		tw.resume();
		ThreadNotify tn = new ThreadNotify(lock);
		tn.start();
		
		
	}

}
