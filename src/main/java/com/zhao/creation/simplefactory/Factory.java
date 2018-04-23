package com.zhao.creation.simplefactory;


// 这里一搬用的是类加载模式
public class Factory {
	
	// 静态工厂方法,创建类对象
	public static Product getProduct(String arg){
		Product product = null;
		if(arg.equalsIgnoreCase("A")){
			product = new ConcreteProduct1();
			// 初始化设置product
		}else if(arg.equalsIgnoreCase("B")){
			product = new ConcreteProduct2();
			// 初始化是指product
		}else {
			throw new RuntimeException("没有这个类对象");
		}
		
		return product;
		
	}
}
