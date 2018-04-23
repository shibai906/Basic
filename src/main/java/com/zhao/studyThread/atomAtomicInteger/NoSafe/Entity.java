package com.zhao.studyThread.atomAtomicInteger.NoSafe;

import java.util.concurrent.atomic.AtomicLong;

public class Entity {
	
	public static AtomicLong aiRef = new AtomicLong();
	
	//  原子类只能保证自己的执行是原子的，比如和执行两行原子类，它不能保证是阻塞
	
	public void addNum(){
		
		System.out.println(Thread.currentThread().getName() + "加了100之后的值是：" + aiRef.addAndGet(100));
		
		aiRef.addAndGet(1);
		
	}
	
	
}
