package com.zhao.creation.factory;

public class DatabaseConcreteProduct implements Product {

	@Override
	public void writeWrapper() {
		System.out.println("这里是数据库的那个什么鬼");
	}

}
