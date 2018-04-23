package com.zhao.studyThread.ThreadStopGroup;

public class TestThreadStopGroup {
	
	public static void main(String[] args) throws InterruptedException {
		
		ThreadGroup group = new ThreadGroup("我的线程组");
		
		for(int i = 0 ; i < 5 ; i ++){
			ThreadA ta = new ThreadA(group,"线程" +(i + 1));
			ta.start();
		}
		Thread.sleep(1000);
		group.interrupt();
		
	}
	
}
