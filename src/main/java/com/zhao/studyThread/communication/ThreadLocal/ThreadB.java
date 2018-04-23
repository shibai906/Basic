package com.zhao.studyThread.communication.ThreadLocal;

public class ThreadB extends Thread {

	private static Entity entity;

	public ThreadB(Entity entity) {
		this.entity = entity;
	}

	@Override
	public void run() {
		synchronized (entity) {
			entity.setName("娇娇");
			entity.setWord("h");
		}
		System.out.println(Entity.tl.get());

	}

}
