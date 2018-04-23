package com.zhao.studyThread.communication.InheritableThreadLocal;

public class TestInheritableThreadLocal {
	
	public static void main(String[] args) throws InterruptedException {
		
		for(int i = 0 ; i < 10; i ++){
			System.out.println("     在Main线程中取值=" + Tools.tl.get());
		}
		Thread.sleep(5000);
		ThreadA a = new ThreadA();
		a.start();
	}
	
}
