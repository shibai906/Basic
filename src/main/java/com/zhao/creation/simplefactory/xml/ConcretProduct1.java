package com.zhao.creation.simplefactory.xml;

public class ConcretProduct1 implements Product {

	@Override
	public void print() {
		System.out.println("这是工厂类代理的模式1");
	}

}
