package com.zhao.studyThread.insideclass.staticC;
public class TestOutClass {
	/*
	 * 内部类也类似于普通方法，锁不一样，也会创建多个锁
	 * 静态的内部类要注意一下，和静态方法有区别
	 * 	静态内部类需要是同一个类，而静态方法不需要
	 */
	public static void main(String[] args) {
		
		final OutClass.Inner1 out = new OutClass.Inner1();
		final OutClass.Inner2 out2 = new OutClass.Inner2();
		final OutClass.Inner2 out3 = new OutClass.Inner2();
		
		Thread t1 = new Thread(new Runnable() {
			@Override
			public void run() {
				out.method1();
			}
		});
		
		Thread t2 = new Thread(new Runnable() {
			@Override
			public void run() {
				out.method2(out3);
			}
		});
		
		Thread t3 = new Thread(new Runnable() {
			@Override
			public void run() {
				out2.method1();
			}
		});
		
		t1.start();
		t2.start();
		t3.start();
		
		
	}
	
}
