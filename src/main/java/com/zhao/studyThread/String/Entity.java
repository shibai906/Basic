package com.zhao.studyThread.String;

public class Entity {

	public void method(String param) {
		try {
			synchronized (param) {
				while (true) {
					System.out.println(Thread.currentThread().getName());
					Thread.sleep(1000);
				}
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
