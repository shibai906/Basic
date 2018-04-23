package com.zhao.studyThread.communication.changeWait;

public class TestChangeWait {
	public static void main(String[] args) throws InterruptedException {
		String lock = new String("");
		Subtract subtract = new Subtract(lock);
		ThreadSubstract ts = new ThreadSubstract(subtract);
		ts.setName("ts");
		ts.start();
		ThreadSubstract ts1 = new ThreadSubstract(subtract);
		ts1.setName("ts1");
		ts1.start();
		Thread.sleep(1000);
		Add add = new Add(lock);
		ThreadAdd at = new ThreadAdd(add);
		at.setName("at");
		at.start();
		
	}
	
}
