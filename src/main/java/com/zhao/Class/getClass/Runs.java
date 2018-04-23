package com.zhao.Class.getClass;

import java.io.File;
import java.io.FileInputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Properties;

public class Runs {
	public static void main(String[] args) throws Exception{
		
		Properties pro = new Properties();
		pro.load(new FileInputStream(new File("a.properties")));
		Class clazz = Class.forName(pro.getProperty("className"));
		
		Constructor con = clazz.getConstructor();
		Object obj = con.newInstance();
		
		Method me = clazz.getMethod((pro.getProperty("classMethod")));
		me.invoke(obj);
		
		
		
	}
}
