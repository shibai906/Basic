package com.zhao.Class.getClass;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/*
 * 反射：就是通过class文件对象，去实用该文件中的成员变量，构造方法，成员方法。
 * Student s = new Student();
 * 对s的实用。
 * 要这样用，首先必须得到class文件对象。
 * Class类：
 * 		成员变量	Field
 * 		构造方法	Constructor
 * 		成员方法	Method
 * 
 * 获取class文件对象的方法：
 * A:Object类中的getClass()方法
 * B:数据类型的静态属性class
 * C:Class类中的静态方法
 * 		public static Class forName(String className);
 * 
 * 
 * 
 * 
 */

public class Demo1 {
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
		Class<Student> cla = (Class<Student>) Class.forName("Class.getClass.Student");
		Constructor<Student> con= cla.getConstructor();
		Student s = con.newInstance();
	}
}
