package com.zhao.data.structure.tree;

public class Person implements Comparable<Person> {
	
	private String name;
	private int age;
	
	Person(String name,int age){
		this.name = name;
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "name:" + name + ",age" + age;
	}
	
	@Override
	public int compareTo(Person o) {
		int num ;
		num =  (name.hashCode() - o.name.hashCode())*17;
		num = num + age - o.age;
		return num;
	}

}
