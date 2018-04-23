package com.zhao.studyThread.lock.ReentrantReadWriteLock;

import java.util.concurrent.locks.ReentrantReadWriteLock;

/*
 * ReentrantLock具有完全互斥排他的效果，同一时间只有一个线程在执行ReentrantLock.lock()方法
 * 	后面的任务。这样做效率特别低
 * 这里主要ReentrantReadWriteLock类，它可以加快运行效率，在不需要操作实例变量的方法中，完全可以使用
 * 	这个来提升该方法的运行速度
 * 读写锁表示也有两个锁，一个是读操作相关的锁，也称为共享锁，另一个是写操作相关的锁，也称排他锁。也就是多个读锁
 * 	之间不互斥，读锁与写锁互斥，写锁与写锁互斥。在没有线程Thread进行写操作时，进行读取操作，多个Thread都
 * 	可以获取读锁，而进行写入操作的Thread只有在获取写锁后才能进行写入操作
 * 	
 */

public class Entity {
	
	private ReentrantReadWriteLock rrw = new ReentrantReadWriteLock();
	public void read(){
		try{
			try{
				rrw.readLock().lock();
				System.out.println("获得读锁" + Thread.currentThread().getName()
					+ " " + System.currentTimeMillis());
				Thread.sleep(1000);
				
			} finally{
				rrw.readLock().unlock();
			}
		} catch(InterruptedException e){
			e.printStackTrace();
		}
		
		
	}
	
	public void write(){
		try{
			try{
				rrw.writeLock().lock();
				System.out.println("获得读锁" + Thread.currentThread().getName()
					+ " " + System.currentTimeMillis());
				Thread.sleep(1000);
				
			} finally{
				rrw.writeLock().unlock();
			}
		} catch(InterruptedException e){
			e.printStackTrace();
		}
		
		
	}
	
}
