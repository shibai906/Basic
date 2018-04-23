package com.zhao.studyThread.yeild;

public class TestYeild {
	// yeild方法，就是让本线程得执行速度方面，让其他线程先执行
	
	public static void main(String[] args) {
		
		Yesyeild yy = new Yesyeild();
		Noyeild ny = new Noyeild();
		yy.start();
		ny.yield();
		ny.start();
		
	}
}
