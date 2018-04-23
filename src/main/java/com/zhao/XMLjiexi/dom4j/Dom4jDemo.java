package com.zhao.XMLjiexi.dom4j;

import java.io.FileOutputStream;
import java.util.List;

import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.SAXReader;
import org.dom4j.io.XMLWriter;

public class Dom4jDemo {
	
	public static void main(String[] args) throws Exception {

	//	query();
		AddAll();
	}
	
	
	private static void AddAll() throws Exception {
		//创建解析器
		SAXReader sr = new SAXReader();
		//创建document对象
		Document doucment = sr.read("test.xml");
		//得到根节点
		Element element = doucment.getRootElement();
		
		//创建Account
		Element account = element.addElement("Account");
		
		//在account下添加元素
		Element code = account.addElement("code");
		code.setText("10002");
		
		Element name = account.addElement("name");
		name.setText("sy");
		
		Element love = account.addElement("you");
		love.setText("zh");
		
		//回写xml
		OutputFormat format = OutputFormat.createCompactFormat();
		XMLWriter xmlWriter = new XMLWriter(new FileOutputStream("test.xml"), format);
		xmlWriter.write(doucment);
	}


	@SuppressWarnings("unchecked")
	private static void query() throws Exception{
		
		/*
		 * 1、创建对象，
		 * 2、得到Document
		 * 3、得到根节点
		 * 4、然后得到想要的对象
		 */
		
		SAXReader reader = new SAXReader();
		// 得到document
		Document document = reader.read("test.xml");
		// 得到根节点
		Element element = document.getRootElement();
		// 得到根节点下得第一个节点
		// Element ele = element.element("Account");
		// 这各可以得到所有得
		List<Element> list = element.elements("Account");
		Element el = list.get(0);
		Element e = el.element("love");

		System.out.println("name得内容" + e.getText());
		System.out.println("name的父节点" + e.getParent().getName());
	}
}
