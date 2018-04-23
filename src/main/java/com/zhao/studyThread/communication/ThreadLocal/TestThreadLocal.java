package com.zhao.studyThread.communication.ThreadLocal;

public class TestThreadLocal {

	public static void main(String[] args) throws InterruptedException {
		Entity entity = new Entity();
		for (int i = 0; i < 10; i++) {
			ThreadA ta = new ThreadA(entity);
			ThreadA ta1 = new ThreadA(entity);
			ThreadA ta2 = new ThreadA(entity);
			ThreadA ta3 = new ThreadA(entity);
			ThreadA ta4 = new ThreadA(entity);
			ThreadB tb = new ThreadB(entity);
			ta.start();

			ta1.start();
			ta2.start();
			ta3.start();
			ta4.start();
		}
	}

}
