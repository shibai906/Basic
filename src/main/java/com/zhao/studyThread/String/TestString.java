package com.zhao.studyThread.String;

/*
 * 这里线程B不能执行，这就是String常量池带来的问题，但大多情况下
 * 	同步synchronized代码块都不能使用String作为锁对象，而改用其他，比如用new Object()
 * 	实例化一个Object对象，但它并不放入缓存中
 * 
 */

public class TestString {
	
	public static void main(String[] args) {
		
		Entity entity = new Entity();
		ThreadA ta = new ThreadA(entity);
		ta.setName("huan");
		ta.start();
		ThreadB tb = new ThreadB(entity);
		tb.setName("jiao");
		tb.start();
		
		
	}
	
}
