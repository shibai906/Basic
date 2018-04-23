package com.zhao.studyThread.synchronizationException;

public class TestSynchronizationException {
	
	/*
	 * 执行结果，是因为不同锁
	 * 	这里需要注意的是：子类
	 * 	这里写的有毛病，不能达到效果，可以设置同步代码块，加相同锁实现。
	 */
	
	public static void main(String[] args) {
		
		
		SonThread st = new SonThread();
		st.setPriority(Thread.MAX_PRIORITY);
		st.start();
		FatherThread ft = new FatherThread();
		ft.start();
		
	}
	
}	
