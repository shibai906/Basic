package com.zhao.design_mode.decorate_design;

public class Demo {
	
	public static void main(String[] args) {
		
		Person person = new Person();
		BufferedPerson bufferedPerson = new BufferedPerson(person);
		bufferedPerson.eat();
		
	}
	
}
