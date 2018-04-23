package com.zhao.studyThread.single.interiorstaticclass;

public class TestInteriorStaticClass {
	
	public static void main(String[] args) {
		for(int i = 0 ; i < 100 ; i ++ ){
			ThreadA ta = new ThreadA();
			ta.start();
		}
	}
	
}
