package com.zhao.studyThread.single.interiorstaticclass;
/*
 * 使用内部类的这种形式，也可以实现单例，而且也是确定的安全
 */
public class Entity {
	
	// 内部类方式
	private static class MyEntityHandler{
		private static Entity entity = new Entity();
	}
	private Entity(){
		
	}
	
	public static Entity getInstance(){
		return MyEntityHandler.entity;
	}
	
}
