package com.zhao.studyThread.dirtyRead;

public class TestDirtyRead {
	
	public static void main(String[] args) throws InterruptedException {
		
		Entity entity = new Entity();
		ThreadA ta = new ThreadA(entity);
		ta.start();
		Thread.sleep(200);
		entity.getValue();
		
	}
	
}
