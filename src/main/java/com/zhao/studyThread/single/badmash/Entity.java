package com.zhao.studyThread.single.badmash;

// 立即加载方式 == 饿汉模式

public class Entity {
	
	private static Entity entity = new Entity();
	private Entity(){
		
	}
	
	public static Entity getInstance(){
		
		// 此代码版本为立即加载
		// 此版本代码的缺点是不能有其他实例变量
		// 因为getInstance()方法没有同步
		// 所有有可能出现非线程安全问题
		return entity;
	}
}
