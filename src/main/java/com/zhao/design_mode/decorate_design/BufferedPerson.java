package com.zhao.design_mode.decorate_design;

public class BufferedPerson extends Person {

	private Person person;
	
	public BufferedPerson(Person person){
		this.person = person;
	}
	
	@Override
	public void eat(){
		
		System.out.println("我这是来装饰的");
		super.eat();
	}
	
	
}
