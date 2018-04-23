package com.zhao.studyThread.equalityObject;

public class Entity {
	
	synchronized public void method(){
		
		for(int i = 0 ; i < 10 ; i ++){
			System.out.println("The Thread " + Thread.currentThread().getName()
				+ " " + i); 
		}
	}
	
	@Override
	public boolean equals(Object obj) {
		return true;
	}
	
}
