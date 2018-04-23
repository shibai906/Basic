package com.zhao.studyThread.volatilestudy.Noatom;

public class TestNoatom {
	
	public static void main(String[] args) {
		
		ThreadA[] ta = new ThreadA[100];
		for(int i = 0; i < 100 ; i ++){
			ta[i] = new ThreadA();
		}
		for(int i = 0 ; i < 100 ; i++){
			ta[i].start();
		}
		
	}
	
}
