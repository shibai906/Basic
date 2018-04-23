package com.zhao.reflect;

public class Domain {
	
	private String name;
	private int age;
	
	private Domain(){
		
	}

	private Domain(String name, int age) {
		this.name = name;
		this.age = age;
	}

	private String getName() {
		return name;
	}

	private void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
}
