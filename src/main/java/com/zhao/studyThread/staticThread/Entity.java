package com.zhao.studyThread.staticThread;

public class Entity {

	synchronized public static void printA() {
		try {
			System.out.println(
					"线程名称为：" + Thread.currentThread().getName() + "在" + System.currentTimeMillis() + "进入了printA");

			Thread.sleep(1000);
			System.out.println(
					"线程名称为：" + Thread.currentThread().getName() + "在" + System.currentTimeMillis() + "退出了了printA");

		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	synchronized public static void printB() {
		try {
			System.out.println(
					"线程名称为：" + Thread.currentThread().getName() + "在" + System.currentTimeMillis() + "进入了printB");

			Thread.sleep(1000);
			System.out.println(
					"线程名称为：" + Thread.currentThread().getName() + "在" + System.currentTimeMillis() + "退出了了printB");

		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void printC() {
		System.out
				.println("线程名称为：" + Thread.currentThread().getName() + "在" + System.currentTimeMillis() + "进入了printC");

		System.out
				.println("线程名称为：" + Thread.currentThread().getName() + "在" + System.currentTimeMillis() + "退出了了printC");

	}

	public void printD() {
		synchronized (Entity.class) {

			try {
				System.out.println(
						"线程名称为：" + Thread.currentThread().getName() + "在" + System.currentTimeMillis() + "进入了printD");

				Thread.sleep(1000);
				System.out.println(
						"线程名称为：" + Thread.currentThread().getName() + "在" + System.currentTimeMillis() + "退出了了printD");

			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
