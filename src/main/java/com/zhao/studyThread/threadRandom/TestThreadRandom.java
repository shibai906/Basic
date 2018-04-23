package com.zhao.studyThread.threadRandom;


public class TestThreadRandom {
	public static void main(String[] args) {
		
		Entity entity = new Entity();
		ThreadA a = new ThreadA(entity);
		a.setName("huan");
		ThreadB b = new ThreadB(entity);
		b.setName("jiao");
		a.start();
		b.start();
		
	}
}
