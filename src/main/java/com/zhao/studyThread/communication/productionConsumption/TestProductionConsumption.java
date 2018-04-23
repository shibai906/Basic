package com.zhao.studyThread.communication.productionConsumption;

public class TestProductionConsumption {

	public static void main(String[] args) throws InterruptedException {
		Object obj = new Object();
		Production pro = new Production(obj);
		Consumption con = new Consumption(obj);

		ThreadConsumption ts = new ThreadConsumption(con);
		ThreadProduction tp = new ThreadProduction(pro);
		ThreadConsumption ts1 = new ThreadConsumption(con);
		ThreadProduction tp1 = new ThreadProduction(pro);
		ts.start();
		ts1.start();
		ts.setPriority(Thread.MAX_PRIORITY);
		ts1.setPriority(Thread.MAX_PRIORITY);
		Thread.sleep(1000);
		tp1.start();
		tp.start();
		tp.setPriority(Thread.NORM_PRIORITY);
		tp1.setPriority(Thread.NORM_PRIORITY);
		
		
		

	}

}
