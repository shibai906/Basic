package com.zhao.studyThread.Thread.runnable.ticket;

public class StartDemo {
	public static void main(String[] args) {
		MyRunnable mr = new MyRunnable();
		Thread td = new Thread(mr,"窗口1");
		Thread td1 = new Thread(mr,"窗口2");
		Thread td2 = new Thread(mr,"窗口3");
		
		td.start();
		td1.start();
		td2.start();

	}
}
