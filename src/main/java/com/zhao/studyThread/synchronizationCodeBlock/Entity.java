package com.zhao.studyThread.synchronizationCodeBlock;

public class Entity {

	public void method() {

		for (int i = 0; i < 100; i++) {
			System.out.println("nosynchronized threadName" + Thread.currentThread().getName() + " i = " + (i + 1));
		}
		synchronized(this){
			for (int i = 0; i < 100; i++) {
				System.out.println("synchronized threadName" + Thread.currentThread().getName() + " i = " + (i + 1));
			}
		}
	}

}
