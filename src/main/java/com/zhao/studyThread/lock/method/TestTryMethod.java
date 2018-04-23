package com.zhao.studyThread.lock.method;

public class TestTryMethod {

	public static void main(String[] args) throws InterruptedException {
		tryLockPara();
	}

	/*
	 * 如果当前线程未被中断，则获取锁定，如果已经中断则出现异常
	 */
	public static void lockInterruptibly() throws InterruptedException {

		TryMethod tm = new TryMethod();
		Runnable run = new Runnable() {
			@Override
			public void run() {
				tm.lockInterruptibly();
			}
		};

		Thread ta = new Thread(run);
		ta.setName("A");
		ta.start();
		Thread.sleep(500);

		Thread tb = new Thread(run);
		tb.setName("B");
		tb.start();
		tb.interrupt(); // 打标记
		System.out.println("main end!");

	}

	public static void tryLock() throws InterruptedException{
		TryMethod tm = new TryMethod();
		Runnable run = new Runnable() {
			@Override
			public void run() {
				tm.tryLock();
			}
		};
		
		Thread ta = new Thread(run);
		ta.setName("A");
		ta.start();
		Thread.sleep(1000);
		Thread tb = new Thread(run);
		tb.start();
		
	}
	
	public static void tryLockPara() throws InterruptedException{
		TryMethod tm = new TryMethod();
		Runnable run = new Runnable() {
			@Override
			public void run() {
				System.out.println(Thread.currentThread().getName()
					+ "调用waitMethod时间：" + System.currentTimeMillis());
				tm.tryLockPara();
			}
		};
		
		Thread ta = new Thread(run);
		ta.setName("A");
		ta.start();
		Thread tb = new Thread(run);
		tb.setName("B");
		tb.start();
		
	}
	
}
