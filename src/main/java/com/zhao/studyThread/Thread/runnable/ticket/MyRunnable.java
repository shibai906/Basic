package com.zhao.studyThread.Thread.runnable.ticket;

public class MyRunnable implements Runnable {

	private int ticket = 100;
	@Override
	public void run() {
		while (true) {
			synchronized (this) {
				if (ticket > 0) {
					System.out.println(Thread.currentThread().getName() + "  " + ticket-- + " 张");
				}
			}

		}

	}

}
