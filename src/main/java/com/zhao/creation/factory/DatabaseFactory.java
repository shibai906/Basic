package com.zhao.creation.factory;

public class DatabaseFactory implements Factory {

	@Override
	public Product getProduct() {
		Product product;
		product = new DatabaseConcreteProduct();
		return product;
	}

}
