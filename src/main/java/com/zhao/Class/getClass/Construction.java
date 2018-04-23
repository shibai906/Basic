package com.zhao.Class.getClass;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;


public class Construction {
	public static void main(String[] args) throws Exception {

		// 获取字节码文件对象
		Class c = Class.forName("Class.Person");

		// 获取构造方法
		// 获取构造方法
		// public Constructor[] getConstructors():所有公共构造方法
		// public Constructor[] getDeclaredConstructors():所有构造方法
		// Constructor[] cons = c.getDeclaredConstructors();
		// for (Constructor con : cons) {
		// System.out.println(con);
		// }

		// Person p = new Person();
		// System.out.println(p);
		// public T newInstance(Object... initargs)
		// 使用此 Constructor 对象表示的构造方法来创建该构造方法的声明类的新实例，并用指定的初始化参数初始化该实例。
		// Constructor con = c.getConstructor();
		// Person p = (Person) con.newInstance();
		// System.out.println(p);
		
		// 获取私有的构造方法
		Constructor con = c.getDeclaredConstructor(String.class);
		con.setAccessible(true);
		Object obj = con.newInstance("赵欢");
		System.out.println(obj);
		
		Field f = c.getDeclaredField("name");
		f.setAccessible(true);
		f.set(obj, "孙丹");
		System.out.println(obj);
		
		Method me = c.getDeclaredMethod("function");
		me.setAccessible(true);
		me.getDefaultValue();
		me.invoke(obj);

	}
}
