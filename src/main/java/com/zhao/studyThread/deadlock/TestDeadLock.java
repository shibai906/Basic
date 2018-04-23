package com.zhao.studyThread.deadlock;


/*
 * 什么是死锁了
 * 	死锁他发生是这样的，就是这个锁的同步方法调用了另一个锁的的同步方法，这个锁同步放弃了权利让另一个锁执行
 * 	另一个锁执行了，又遇到了事情了就让上一个锁去执行，然而上一个锁去执行了，执行另一个锁，发现另一个锁并
 * 	没有释放锁，他就在哪里等待，锁又去执行下面的了，下面想调用上面的锁，发现上面那个类并没有释放，那么，这个锁
 * 也就开始等待了，
 * 	简单的将，死锁就是两个不相干的锁嵌套了，两个锁都没有释放，内部要执行另一个锁，都在相互等待
 * 
 */

public class TestDeadLock {
	
	public static void main(String[] args) throws InterruptedException {
		DeadLockThread dt1 = new DeadLockThread();
		DeadLockThread dt2 = new DeadLockThread();
		dt1.username = "a";
		Thread t1 = new Thread(dt1);
		Thread t2 = new Thread(dt1);
		t1.start();
		t2.start();
		Thread.sleep(10);
		dt1.username = "b";
		
	}
	
}
