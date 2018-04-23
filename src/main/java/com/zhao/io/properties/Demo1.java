package com.zhao.io.properties;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Enumeration;
import java.util.Properties;
import java.util.Set;

public class Demo1 {
	public static void main(String[] args) throws IOException {
		myWriter();
		myReader();
	}

	private static void myReader() throws IOException {
		
		Properties pro = new Properties();
		pro.load(new FileReader("jh.property"));
		Set<String> key = pro.stringPropertyNames();
		System.out.println(pro);
		for(String ke:key){
			String value = pro.getProperty(ke);
			
			System.out.println(key+"="+value);
		}
		
	}

	private static void myWriter() throws IOException {

		Properties pro = new Properties();
		pro.setProperty("赵欢", "20");
		pro.setProperty("凯迪", "30");
		pro.store(new FileWriter("jh.property",true), "夫妻对");
	}
}
