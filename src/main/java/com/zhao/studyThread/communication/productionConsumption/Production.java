package com.zhao.studyThread.communication.productionConsumption;

public class Production {
	private Object lock;

	public Production(Object lock) {
		this.lock = lock;
	}

	public void setValue() {
		try {
			synchronized (lock) {
				while (!"".equals(Entity.value)) {
					lock.wait();
				}
				String value = System.currentTimeMillis() + "_"
						+ System.nanoTime();
				System.out.println("set的值是" + value);
				Entity.value = value;
				lock.notify();
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
