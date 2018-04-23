package com.zhao.studyThread.ThreadException.group;

public class TestGroupException {
	
	public static void main(String[] args) {
		
		MyThreadGroup group = new MyThreadGroup("我的线程组");
		ThreadA[] ta = new ThreadA[10];
		for(int i = 0 ;i < 10 ; i ++){
			ta[i] = new ThreadA(group,"线程" + i , "1");
			ta[i].start();
		}
		ThreadA t = new ThreadA(group,"报错线程","a");
		t.start();
		
		
	}
	
}
