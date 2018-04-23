package com.zhao.Class.dynamic;

import java.lang.reflect.Proxy;

public class Demo {
	public static void main(String[] args) {

		// 我们要创建一个动态代理对象
		// Proxy类中有一个方法可以创建动态代理对象
		// public static Object newProxyInstance(ClassLoader loader,Class<?>[]
		// interfaces,InvocationHandler h)
		// 我准备对ud对象做一个代理对象
		
		
		Imp o = new Operation();
		o.add();
		MyInvocationHandler handler = new MyInvocationHandler(o);
		Imp proxy = (Imp) Proxy.newProxyInstance(o.getClass().getClassLoader(), o.getClass().getInterfaces(), handler);
		proxy.add();
		proxy.delete();
		proxy.revise();
		proxy.query();
	}
}
