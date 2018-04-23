package com.zhao.creation.simplefactory.xml;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

public class Factory {
	
	public static Product getProduct() throws DocumentException, ClassNotFoundException, InstantiationException, IllegalAccessException{
		
		Product product = null; 
		SAXReader sr = new SAXReader();
		
		Document doucment = sr.read(
				Factory.class.getClassLoader()
				.getResourceAsStream("creation/simplefactory/xml/lei.xml")
				);
		System.out.println("测试");
		Element element = doucment.getRootElement();
		Element type = element.element("charType");
		Class clazz = Class.forName(type.getText()) ;
		
		return (Product)clazz.newInstance();
		
		
	}
	
}
