package com.zhao.creation.simplefactory;

public class Client {
	public static void main(String[] args) {
		Product product;
		product = Factory.getProduct("A"); // 通过工厂创建对象
		product.methodDiff();
		product.methodSame();
	}
}
