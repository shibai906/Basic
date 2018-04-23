package com.zhao.studyThread.lock.Native;

/*
 * 非公平锁就是一种获取锁的抢占机制，是随机获取锁的
 * 	它的顺序基本是乱的
 */
public class TestNoPublicLock {
	
	public static void main(String[] args) {
		
		final Entity entity = new Entity(false);
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
