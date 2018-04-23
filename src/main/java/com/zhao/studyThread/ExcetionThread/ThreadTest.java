package com.zhao.studyThread.ExcetionThread;

public class ThreadTest extends Thread {
	private ExcetionFunction ef;
	private int num;
	public ThreadTest(int num,ExcetionFunction ef){
		this.num = num;
		this.ef = ef;
	}
	@Override
	public void run() {
		super.run();
		if(num == 1){
			ef.method1();
			ef.method2();
		}else{
			ef.method2();
		}
	
	}
		
}
