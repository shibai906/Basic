package com.zhao.creation.factory;

public class Client {
	public static void main(String[] args) {
		Factory factory = null;
		Product product = null;
		factory = new FileFactory();  // 这里可以使用配置文件书写
		product = factory.getProduct();
		product.writeWrapper();
	}
}
