package com.zhao.JVM.JVMError;

import java.util.ArrayList;
import java.util.List;

public class ThrowOutOfMemoryError {

	public static class OOMObject {
		
	}

	public static void outOfMemoryError() {

		// Java heap space
		List<Object> list = new ArrayList<>();
		// 这里是不断创建对象，并保证GC Roots到对象之间有可达的路劲，避免垃圾回收清楚创建的对象
		while (true) {
			list.add(new OOMObject());
			System.out.println(System.currentTimeMillis());
		}

	}

	/*
	 * 1、线程请求的栈深度超过虚拟机所允许的最大深度，将抛出StackOverflowError异常
	 * 2、虚拟机在扩展时无法申请到足够的内存空间，将抛出OutOfMemoryError异常
	 */
	public static void main(String[] args) {
		outOfMemoryError();
		
		
	}

	// 记录内存溢出时的栈深度
	private int stackLength = 1;

	/* 
	 * 这里内存设置的小一点
	 * 通过不断创建活跃线程，消耗虚拟机栈资源 VM Args:-Xss256k
	 */
	public static void stackOverflowError() {
		ThrowOutOfMemoryError tfError = new ThrowOutOfMemoryError();
		try {
			tfError.stackLeak();
		} catch (Throwable e) {
			System.out.println("栈的深度为" + tfError.stackLength);
			throw e;
		}

	}
	public void stackLeak() {
		stackLength++;
		stackLeak();
	}
	
	/*
	 * 通过不断创建活跃线程，消耗虚拟机栈资源
	 * 能让电脑死机
	 * VM Args:-Xss256k
	 */
	public static void stackOutOfMemoryError(){
		while(true){
			Thread thread = new Thread(new Runnable(){
				@Override
				public void run() {
					wontStop();
				}
			});
			thread.start();
		}
	}
	private static void wontStop(){
		while(true){
			System.out.println(Thread.currentThread().getName()+System.currentTimeMillis());
		}
	}
	
	
}
