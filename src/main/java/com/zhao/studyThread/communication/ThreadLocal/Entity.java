package com.zhao.studyThread.communication.ThreadLocal;

public class Entity {
	public static ThreadLocal<Entity> tl = new ThreadLocal<>();
	private String name;
	private String word;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getWord() {
		return word;
	}
	public void setWord(String word) {
		this.word = word;
	}
	@Override
	public String toString() {
		
		return "name:" + name + ",word:" + word;
		
	}	
	
	
}
