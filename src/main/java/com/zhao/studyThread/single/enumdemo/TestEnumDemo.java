package com.zhao.studyThread.single.enumdemo;


public class TestEnumDemo {
	
	public static void main(String[] args) {
		
		for(int i = 0 ; i < 100 ; i ++ ){
			ThreadA ta = new ThreadA();
			ta.start();
		}
		
	}
	
}	
