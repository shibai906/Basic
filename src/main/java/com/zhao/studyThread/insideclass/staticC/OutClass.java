package com.zhao.studyThread.insideclass.staticC;

public class OutClass {

	static class Inner1 {

		synchronized public void method1() {

			for (int i = 0; i < 10; i++) {
				System.out.println("这个是method1" + i);
			}
		}

		public void method2(Inner2 inner) {
			synchronized (inner) {
				try {
					for (int i = 0; i < 10; i++) {
						System.out.println("这个是method2" + i);
					}
					Thread.sleep(2000);
					System.out.println("method2退出");
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
	static class Inner2 {
		public synchronized void method1() {
			try {
				System.out.println("inner2 进入");
				Thread.sleep(200);
				System.out.println("inner2退出");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
	}

}
