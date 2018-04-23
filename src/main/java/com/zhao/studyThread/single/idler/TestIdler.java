package com.zhao.studyThread.single.idler;

public class TestIdler {
	
	public static void main(String[] args) {
		
		for(int i = 0 ; i < 100 ; i ++){
			ThreadA ta = new ThreadA();
			ta.start();
		}
		
	}
	
}
