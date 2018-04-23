package com.zhao.Class.dyna;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class MyInvocationHandler implements InvocationHandler {
	
	private Object target;
	
	
	
	public MyInvocationHandler(Object target) {
		super();
		this.target = target;
	}



	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		
		System.out.println("权限校检");
		Object result = method.invoke(target);
		System.out.println("工作日志");
		return result;
		
	}

}
