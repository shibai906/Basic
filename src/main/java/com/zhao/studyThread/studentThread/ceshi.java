package com.zhao.studyThread.studentThread;

public class ceshi {
	public static void main(String[] args) {
		Student s = new Student();
		MyRunnableProduction mrp = new MyRunnableProduction(s);
		MyRunnableConsumption mrc = new MyRunnableConsumption(s);
		Thread t1 = new Thread(mrp);
		Thread t2 = new Thread(mrc);
		
		t1.start();
		t2.start();
	}
}
