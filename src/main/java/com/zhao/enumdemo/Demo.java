package com.zhao.enumdemo;

public enum Demo {
	/*
	 * 特别注意：枚举必须放在第一行
	 * 
	 */
	UP("上"),DOWN("下"),LEFT("左"),RIGHT("右");
	private String name;
	
	private Demo(String name){
		this.name = name;
	}
	public void show(){
		System.out.println(name);
	}
	
	
}
