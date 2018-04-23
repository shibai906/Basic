package com.zhao.studyThread.single.idler;

public class ThreadA extends Thread {
	
	@Override
	public void run() {

		System.out.println(Entity.getInstance().hashCode());
		
	}
	
}
