package com.zhao.studyThread.communication.joinLang;

public class ThreadA extends Thread {
	private ThreadB tb;

	public ThreadA(ThreadB tb) {
		this.tb = tb;
	}

	@Override
	public void run() {
		synchronized (tb) {
			try {
				System.out.println("A begin" + System.currentTimeMillis());
				Thread.sleep(2000);
				System.out.println("A end" + System.currentTimeMillis());
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}
}
