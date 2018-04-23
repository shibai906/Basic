package com.zhao.Class.dyna;

import java.lang.reflect.Proxy;

public class Test {
	public static void main(String[] args) {
		
		StudentDao stu = new StudentDaoImp();
		MyInvocationHandler handler = new MyInvocationHandler(stu);
		StudentDao stuu =  (StudentDao) Proxy.newProxyInstance(stu.getClass().getClassLoader(), stu.getClass().getInterfaces(), handler);
		stuu.add();
		
	}
}
