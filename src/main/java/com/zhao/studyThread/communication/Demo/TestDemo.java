package com.zhao.studyThread.communication.Demo;

public class TestDemo {
	public static void main(String[] args) {
		
		MyList ml = new MyList();
		ThreadA ta = new ThreadA(ml);
		ThreadB tb = new ThreadB(ml);
		ta.start();
		tb.start();
		
	}
}
