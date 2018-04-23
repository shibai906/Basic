package com.zhao.studyThread.lock.Native;

/*
 * 公平锁标识线程获取锁的顺序是按照线程加锁的顺序来分配的
 * 	即先来先得的FIFO先进先出吮吸
 * 	就基本是先运行的先获取锁
 */
public class TestPublicLock {
	
	public static void main(String[] args) {
		
		final Entity entity = new Entity(true);
		Runnable runnable = new Runnable(){
			@Override
			public void run() {
				System.out.println("**线程" + Thread.currentThread().getName() + "运行了");
				entity.serviceMethod();
			}
			
		};
		Thread[] t = new Thread[10];
		for(int i = 0 ; i < 10 ; i++){
			t[i] = new Thread(runnable);
		}
		for(int i = 0 ; i < 10 ; i++){
			t[i].start();
		}
		
	}
	
}
