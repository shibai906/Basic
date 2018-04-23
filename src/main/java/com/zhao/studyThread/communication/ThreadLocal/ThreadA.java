package com.zhao.studyThread.communication.ThreadLocal;

public class ThreadA extends Thread {

	private Entity entity;

	public ThreadA(Entity entity) {
		this.entity = entity;
	}

	@Override
	public void run() {
		// synchronized (entity) {
		 Entity.tl.set(entity);
		int value = (int) (Math.random() * 10);
		entity.setName("赵欢" + value);
		entity.setWord("hao" + value);
		// }
		 System.out.println(Entity.tl.get());
		 //System.out.println(entity);
	}

}
