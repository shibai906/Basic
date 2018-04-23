package com.zhao.studyThread.concurrent;

// 12月19号晚上做这个， 尝试着ReentrantLock让线程不死锁。
import java.util.concurrent.locks.ReentrantLock;

public class TestReenLock {
	
	public static ReentrantLock lock1 = new ReentrantLock();
	public static ReentrantLock lock2 = new ReentrantLock();
	
	int lock ;
	public TestReenLock(int lock ) {
		
	}
	
}
