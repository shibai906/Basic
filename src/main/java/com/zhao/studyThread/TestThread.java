package com.zhao.studyThread;

public class TestThread {
	
	/*
	 * 这里可以看出start()方法的顺序不代表线程启动的顺序，对方法加上关键字后，就很明显的知道，
	 * 	主线程先启动他们，他们不一定得先执行完
	 * 
	 */
	
	public static void main(String[] args) {
		
		ThreadSeq t1 = new ThreadSeq(1);
		ThreadSeq t2 = new ThreadSeq(2);
		ThreadSeq t3 = new ThreadSeq(3);
		ThreadSeq t4 = new ThreadSeq(4);
		ThreadSeq t5 = new ThreadSeq(5);
		ThreadSeq t6 = new ThreadSeq(6);
		ThreadSeq t7 = new ThreadSeq(7);
		ThreadSeq t8 = new ThreadSeq(8);
		ThreadSeq t9 = new ThreadSeq(9);
		ThreadSeq t10 = new ThreadSeq(10);
		try {
			Thread.sleep(1000);
			System.out.println("nihk");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		t6.start();
		t7.start();
		t8.start();
		t9.start();
		t10.start();
	}
	
}
