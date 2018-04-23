package com.zhao.studyThread.equalityObject;

public class TestEqualityObject {
	
	/*
	 * 在这里判断两个实体类是不是相等，用equals方法判断的
	 * 	为什么String不行了，因为String复写了equals方法
	 * 
	 */
	
	public static void main(String[] args) {
		
		Entity entity = new Entity();
		Entity entity1 = new Entity();
		
		ThreadA ta = new ThreadA(entity);
		ThreadB tb = new ThreadB(entity1);
		ta.start();
		tb.start();
		
		
	}
	
}
