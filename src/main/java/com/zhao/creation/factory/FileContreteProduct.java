package com.zhao.creation.factory;

public class FileContreteProduct implements Product {

	@Override
	public void writeWrapper() {
		System.out.println("这个是文件的实例");
	}

}
