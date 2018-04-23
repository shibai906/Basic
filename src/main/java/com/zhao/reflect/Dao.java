package com.zhao.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/*
 *  方法签名
 *  	只有通过方法签名才能找到唯一的方法，方法签名=方法名+参数列表（参数类型、参数个数、参数顺序）。
 * 
 */

/*
 * 属性是用类Field
 * 方法是method
 * 构造方法是Constructor
 */

public class Dao {
	public static void main(String[] args) throws Exception {
		Class clazz = Class.forName("reflect.Domain");

		// 这个方法只能获取公共的构造方法
		// Constructor con = clazz.getConstructor(String.class,int.class);

		// 想要获取所有的构造方法，就必须用getDeclaredConstructor
		Constructor con = clazz.getDeclaredConstructor(String.class, int.class);
		con.setAccessible(true);
		Object obj = con.newInstance("lskdjfl", 23);

		// 使用Field，必须要自己设置值
		Field field = clazz.getDeclaredField("age");
		field.setAccessible(true);
		System.out.println(field.get(obj));

		Method method = clazz.getMethod("setAge", int.class);
		method.invoke(obj, 32);

		// 暂时是这样的，想获取方法，必须用null
		Method me = clazz.getMethod("getAge", null); // 没有参数时，这里必须设置为null
		Object o = me.invoke(obj, null);
		System.out.println(o);

	}
}
