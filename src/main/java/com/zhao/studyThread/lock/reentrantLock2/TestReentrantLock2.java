package com.zhao.studyThread.lock.reentrantLock2;

public class TestReentrantLock2 {
	
	public static void main(String[] args) {
		
		Entity entity = new Entity();
		ThreadAA taa = new ThreadAA(entity);
		taa.setName("AA");
		taa.start();
		ThreadAB tab = new ThreadAB(entity);
		tab.setName("AB");
		tab.start();
		ThreadBA tba = new ThreadBA(entity);
		tba.setName("BA");
		tba.start();
		ThreadBB tbb = new ThreadBB(entity);
		tbb.setName("BB");
		tbb.start();
		
	}
	
}
