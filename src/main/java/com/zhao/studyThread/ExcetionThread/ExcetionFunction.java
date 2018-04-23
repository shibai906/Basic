package com.zhao.studyThread.ExcetionThread;

public class ExcetionFunction {
	
	public synchronized void method1(){
		System.out.println("error start");
		int num = 1/0;
		System.out.println("error end");
	}
	public synchronized void method2(){
		System.out.println("start");
		System.out.println("end");
	}
	
}
