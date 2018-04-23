package com.zhao.studyThread.testThread;

public class TestTestThread {
	
	public static void main(String[] args) throws InterruptedException {
		
		TestThread tt = new TestThread();
		tt.start();
		tt.join(1);
		for(int i = 0 ; i < 100 ; i ++){
			System.out.println("main " + i);
		}
		
	}
	
}
