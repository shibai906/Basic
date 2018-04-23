package com.zhao.enumdemo;

public class ClassEnum {
	
	private String name;
	
	public final static ClassEnum UP = new ClassEnum("上");
	public final static ClassEnum DOWN = new ClassEnum("下");
	public final static ClassEnum LEFT = new ClassEnum("左");
	public final static ClassEnum RIGHT = new ClassEnum("右");
	
	private ClassEnum(String name){
		this.name = name;
	}
	
	public void show(){
		System.out.println(name);
	}
}
