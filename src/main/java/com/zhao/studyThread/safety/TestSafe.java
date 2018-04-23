package com.zhao.studyThread.safety;

public class TestSafe {

	/*
	 * 这里说明，如果把对象换成私有，或者放在方法内部，不存在线程不安全，线程一致都是安全
	 * 如果方法中步存在非线程安然问题，永远都是线程安全得。
	 * 
	 * 如果两个线程共同使用一个变量，并且有成员变量，会出来线程错误情况
	 * 	线程安全方面，单例多要考虑考虑
	 * 
	 * 	如果多个线程线程访问多个对象，jvm会创建多个锁
	 * 
	 * synchronized进行同步处理，只有在对共享资源得读写访问才需要同步化。
	 * 	synchronized(Class) 为什么要传入class对象，因为它加锁加的是类，对这个类进行排队
	 * 
	 */
	public static void main(String[] args) {
		SafeClass saf = new SafeClass();
		SafeClass saf1 = new SafeClass();
		ThreadA ta = new ThreadA(saf);
		ThreadB tb = new ThreadB(saf1);
		tb.start();
		ta.start();
		

	}

}
