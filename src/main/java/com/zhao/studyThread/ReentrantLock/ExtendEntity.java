package com.zhao.studyThread.ReentrantLock;

public class ExtendEntity extends Entity {
	
	public synchronized void method(){
		System.out.println("子类的锁");
		super.method1();
	}
		
}
