package com.zhao.studyThread.communication.join;

public class ThreadB extends Thread {

	@Override
	public void run() {
		try {
			ThreadA ta = new ThreadA();
			ta.start();
			ta.join();
			System.out.println("线程ThreadB再run end处打印了");
		} catch (InterruptedException e) {
			System.out.println("线程ThreadB在catch处打印了");
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
