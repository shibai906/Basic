package com.zhao.studyThread.single.staticChunk;

public class ThreadA extends Thread {
	
	@Override
	public void run() {
		System.out.println(Entity.getInstance().hashCode());
	}
	
}
