package com.zhao.studyThread.lock.method;

public class TestHasMethod {
	
	public static void main(String[] args) throws InterruptedException {
		testHasWaiters();
	}
	
	public static void testHasQueuedThread() throws InterruptedException{
		
		final HasMethod hm = new HasMethod();
		Runnable run = new Runnable(){
			@Override
			public void run() {
				hm.hasQueuedThread();
			}
		};
		Thread t1 = new Thread(run);
		t1.start();
		Thread.sleep(500);
		Thread t2 = new Thread(run);
		t2.start();
		Thread.sleep(500);
		System.out.println(hm.lock.hasQueuedThread(t1));
		System.out.println(hm.lock.hasQueuedThread(t2));
		System.out.println(hm.lock.hasQueuedThreads());
	}
	
	public static void testHasWaiters() throws InterruptedException{
		
		final HasMethod hm = new HasMethod();
		Runnable run = new Runnable(){
			@Override
			public void run() {
				hm.waitMethod();
			}
		};
		
		Thread[] td = new Thread[10];
		for(int i = 0 ; i < 10 ; i ++){
			td[i] = new Thread(run);
		}
		for(int i = 0 ; i < 10 ; i ++){
			td[i].start();
		}
		Thread.sleep(1000);
		hm.notityMethod();
	}
	
}
