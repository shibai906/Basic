package com.zhao.creation.factory;

public class FileFactory implements Factory{

	@Override
	public Product getProduct() {
		Product product = null;
		product = new FileContreteProduct();
		return product;
	}

}
