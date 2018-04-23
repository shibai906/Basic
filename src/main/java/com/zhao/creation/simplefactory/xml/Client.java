package com.zhao.creation.simplefactory.xml;

public class Client {
	public static void main(String[] args) throws Exception {
		
		Product pro = Factory.getProduct();
		pro.print();
	}
}
