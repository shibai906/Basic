package com.zhao.studyThread.lock.method;

public class TestIsMethod {

	public static void main(String[] args) {
		isLocked();
	}

	public static void isHeldByCurrentThread() {

		IsMethod im = new IsMethod();
		Runnable run = new Runnable() {

			@Override
			public void run() {
				im.isHeldByCurrentThread();
			}

		};

		Thread ta = new Thread(run);
		ta.start();

	}

	public static void isLocked() {

		IsMethod im = new IsMethod();
		Runnable run = new Runnable() {

			@Override
			public void run() {
				im.isHeldByCurrentThread();
			}

		};

		Thread ta = new Thread(run);
		ta.start();

	}

}
