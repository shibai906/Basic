package com.zhao.Class.getClass;

public class Student {
	private String name;
	Integer age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public Student(String name, Integer age) {
		super();
		this.name = name;
		this.age = age;
	}
	public Student(Integer age) {
		super();
		this.age = age;
	}
	public Student(String name) {
		super();
		this.name = name;
	}
	public Student() {
		super();
	}
	
	
	
}
