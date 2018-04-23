package com.zhao.studyThread.lock.productionConsumption.oneToOne;

public class TestProductionConsumption {

	public static void main(String[] args) {

		Entity entity = new Entity();
		MyService service = new MyService();
		for (int i = 0; i < 10; i++) {
			ThreadA ta = new ThreadA(service, entity);
			ThreadB tb = new ThreadB(service, entity);
			ta.start();
			tb.start();
		}

	}

}
