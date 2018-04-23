package com.zhao.studyThread.SimpleDateFormatDemo;

public class TestSimpleDateFormatDemo {
	public static void main(String[] args) {
		
		for(int i = 0 ; i < 10 ; i ++){
			ThreadA ta = new ThreadA("2017-11-09");
			ta.start();
		}
		
	}
}
