package com.zhao.studyThread.priority;

public class TestThread {
	
	/*
	 * 在这里注意一下，优先级有继承性，线程在哪里启动得，就继承哪里得优先级，除非你设置新的优先级
	 * 高优先级得线程总是大部分先执行完，但不代表高优先级得线程全部执行完。
	 * 优先级具有随机性
	 */
	
	public static void main(String[] args) {
		
		// 守护线程，当非守护线程执行完，不管守护线程到底有没有执行完
		GuardThread gt = new GuardThread();
		
		gt.setDaemon(true);
		
		
		
		
	}
	
	public static void testPriority(){
		
		Thread.currentThread().setPriority(Thread.MAX_PRIORITY);
		LowThread lt = new LowThread();
		HighThread ht = new HighThread();
		ht.start();
		lt.start();
		
//		for(int i = 0 ; i< 100 ; i++)
//			System.out.println("mainThread" + i);
		System.out.println("mainThread end");
		System.out.println(lt.getPriority() == ht.getPriority() && lt.getPriority() == Thread.currentThread().getPriority());
	
	}
	
}
