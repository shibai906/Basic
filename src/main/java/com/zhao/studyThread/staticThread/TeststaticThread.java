package com.zhao.studyThread.staticThread;


/*
 * 注意静态同步方法，它里面不管用那个方法调用，访问其他静态同步方法，线程都是阻塞的
 * 	因为都是Class，synchronized(class)和synchronized static方法的作用是
 * 一样的,他们就和不是静态方法的就不样了，不管是不是同一个对象调用，都不行
 * 
 * 
 */

public class TeststaticThread {
	
	public static void main(String[] args) {
		
		Entity entity = new Entity();
		Entity entity1 = new Entity();
		
		ThreadA ta = new ThreadA(entity);
		ThreadB tb = new ThreadB(entity1);
		ThreadC tc = new ThreadC(entity1);
		ThreadD td = new ThreadD(entity1);
		ta.start();
		tb.start();
		tc.start();
		td.start();
		
		
		
	}
	
}
