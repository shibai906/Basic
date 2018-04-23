package com.zhao.studyThread.deadlock;

public class DeadLockThread implements Runnable {

	public String username;
	private Object ob1 = new Object();
	private Object ob2 = new Object();

	@Override
	public void run() {
		while (true) {
			if ("a".equals(username)) {
				synchronized (ob1) {
					try {
						System.out.println("a运行开始");
						Thread.sleep(100);
						System.out.println("a运行开始");
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					synchronized (ob2) {
						System.out.println("a内b运行开始");
						System.out.println("a内b运行结束");
					}
				}
			} else {
				synchronized (ob2) {
					try {
						System.out.println("b运行开始");
						Thread.sleep(100);
						System.out.println("b运行开始");
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					synchronized (ob1) {
						System.out.println("b内a运行开始");
						System.out.println("b内a运行结束");
					}
				}
			}
		}
	}

}
