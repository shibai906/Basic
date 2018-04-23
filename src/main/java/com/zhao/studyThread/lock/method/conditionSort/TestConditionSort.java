package com.zhao.studyThread.lock.method.conditionSort;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class TestConditionSort {
	volatile private static int next = 1;
	private static ReentrantLock lock = new ReentrantLock();
	final private static Condition conA = lock.newCondition();
	final private static Condition conB = lock.newCondition();
	final private static Condition conC = lock.newCondition();
	
	public static void main(String[] args) {
		Thread ta = new Thread(){
			@Override
			public void run(){
				try{
					lock.lock();
					while(next != 1){
						conA.await();
					}
					for(int i = 0 ; i < 3 ; i ++){
						System.out.println("ThreadA " + (i+1));
					}
					next = 2;
					conB.signal();
				}catch(InterruptedException e){
					e.printStackTrace();
				}finally{
					lock.unlock();
				}
			}
		};
		
		Thread tb = new Thread(){
			@Override
			public void run(){
				try{
					lock.lock();
					while(next != 2){
						conB.await();
					}
					for(int i = 0 ; i < 3 ; i ++){
						System.out.println("ThreadB " + (i+1));
					}
					next = 3;
					conC.signal();
				}catch(InterruptedException e){
					e.printStackTrace();
				}finally{
					lock.unlock();
				}
			}
		};
		
		Thread tc = new Thread(){
			@Override
			public void run(){
				try{
					lock.lock();
					while(next != 3){
						conC.await();
					}
					for(int i = 0 ; i < 3 ; i ++){
						System.out.println("ThreadB " + (i+1));
					}
					next = 1;
					conA.signal();
				}catch(InterruptedException e){
					e.printStackTrace();
				}finally{
					lock.unlock();
				}
			}
		};
		
		for(int i = 0 ; i < 5 ; i ++){
			Thread taa = new Thread(ta);
			Thread tbb = new Thread(tb);
			Thread tcc = new Thread(tc);
			taa.start();
			tbb.start();
			tcc.start();
		}
		
	}
	
	
	
}
