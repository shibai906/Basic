package com.zhao.studyThread.single.badmash;

public class TestBadmash {
	
	public static void main(String[] args) {
		
		ThreadA ta = new ThreadA();
		ThreadA tb = new ThreadA();
		
		ta.start();
		tb.start();
		
	}
	
}
