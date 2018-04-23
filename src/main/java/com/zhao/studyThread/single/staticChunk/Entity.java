package com.zhao.studyThread.single.staticChunk;

public class Entity {
	
	private static Entity instance = null;
	private Entity(){
		
	}
	static{
		instance = new Entity();
	}
	
	public static Entity getInstance(){
		return instance;
	}
	
}
