package com.zhao.studyThread.single.serialization;

import java.io.ObjectStreamException;
import java.io.Serializable;

public class Entity implements Serializable {

	private static final long serialVersionUID = -223053030932285115L;
	
	private static class entityHandler{
		
		private static final Entity entity = new Entity();
	}
	
	private Entity(){
	}
	public static Entity getInstance(){
		return entityHandler.entity;
	}
	
	// 这里是解决反序列化的问题
	protected Object readResolve() throws ObjectStreamException{
		
		System.out.println("调用了readResolve方法");
		return entityHandler.entity;
		
	}
	
}
