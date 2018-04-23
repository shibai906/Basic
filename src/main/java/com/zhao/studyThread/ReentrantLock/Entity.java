package com.zhao.studyThread.ReentrantLock;

public class Entity {
	
	public synchronized void method1(){
		System.out.println("锁1");
		method2();
	}
	public synchronized void method2(){
		System.out.println("锁2");
		method3();
	}
	public synchronized void method3(){
		System.out.println("锁3");
		
	}
	
	
}
