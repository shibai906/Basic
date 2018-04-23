package com.zhao.studyThread.ThreadState;

public class TestThreadState {
	/*
	 * 线程的几种状态
	 * NEW, 至今尚未启动的线程处于这种状态
	 * RUNNABLE,正在java虚拟机中执行的线程处于这种状态，一般用在同步等待当中
	 * TERMINATED,已退出线程处于这种状态
	 * BLOCKED,受阻塞并等待某个监视器锁的线程处于这种状态
	 * WAITING,无期限地等待另一个线程来执行某一特定操作地线程处于这种状态,就是执行了线程Object.wait()方法后的状态
	 * TIMED_WAITING,等待另一个线程来执行取决于指定等待时间地操作地线程处于这种状态。这个线程执行了，不过它还在等待的状态中，它是执行sleep()方法后线程的状态枚举
	 * 
	 * 
	 */
	public static void main(String[] args) throws InterruptedException {		
		TestWAITING();
		
	}
	
	public static void TestWAITING() throws InterruptedException{
		WAITINGThreadA wt = new WAITINGThreadA();
		wt.start();
		Thread.sleep(1000);
		System.out.println("main方法中的t状态" + wt.getState());
	}
	
	public static void TestBLOCKED(){
		
		BLOCKED_ThreadA bta = new BLOCKED_ThreadA();
		bta.setName("A");
		bta.start();
		BLOCKED_ThreadB btb = new BLOCKED_ThreadB();
		btb.setName("B");
		btb.start();
		System.out.println("main方法中的t2状态：" + btb.getState());
		
	}
	
	public static void TestTIMED_WAITING_Thread() throws InterruptedException{
		
		TIMED_WAITING_Thread ttt = new TIMED_WAITING_Thread();
		ttt.start();
		Thread.sleep(1000);
		System.out.println("main方法中的状态：" + ttt.getState());
		
		
	}
	
	public static void commonStatic() throws InterruptedException{
		ThreadA ta = new ThreadA();
		System.out.println("main方法中地状态1" + ta.getState());
		Thread.sleep(1000);
		ta.start();
		Thread.sleep(1000);
		System.out.println("main方法中地状态2" + ta.getState());
	}
	
}
