package com.zhao.studyThread.communication.join;

/*
 * join 的作用是使所属线程对象x正常执行run()方法中的任务
 * 	而使当前线程z进行无限期的组赛，等待线程x销毁后再继续执行线程z后面的代码
 * 
 * 方法join具有使线程排队运行的作用，有些类似同步的运行效果，join与synchronized的区别是：
 * 	join再内部使用wait()方法进行等待，而sychronizedg关键字使用的是“对象监视器”原理作为同步。
 */

public class TestJoin {
	
	public static void main(String[] args) throws InterruptedException {
		
		ThreadB tb = new ThreadB();
		tb.start();
		tb.interrupt();
		
		/*ThreadB tb = new ThreadB();
		tb.start();
		Thread.sleep(1000);
		ThreadC tc = new ThreadC(tb);
		tc.start();*/
		
	}
	
}
