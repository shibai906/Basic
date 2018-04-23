package com.zhao.studyThread.concurrent.mutex;

import java.util.Collection;
import java.util.Random;

public class MutexTestSecond {
	
	private static Random r = new Random(47);
	private static int threadCount = 10 ;
	private static Mutex mut = new Mutex();
	
	private static class Weight implements Runnable{ // 给苹果称重的任务
		
		String name ;
		public Weight(String name){
			this.name = name ;
		}
		
		@Override
		public void run() {
			mut.lock(); 
			System.out.println(name + "放苹果！");
			System.out.println(name + "重量：" + (r.nextInt(10) + 3));
			System.out.println(name + "取苹果！");
			printQueuedThread(mut.getQueuedThreads());
			mut.unlock();
		}

		private static void printQueuedThread(Collection<Thread> queuedThreads) {
			System.out.println("等待队列中的线程");
			for(Thread t : queuedThreads){
				System.out.print(t.getName() + " ");
			}
			System.out.println();
		}
		
	}
	
	public static void main(String[] args){
		Thread[] threads = new Thread[threadCount];
		for(int i = 0 ; i < threadCount ; i ++){
			threads[i] = new Thread(new Weight("weight-" + i) , "Thread-" + i);
			
		}
		for(int i = 0 ; i < threadCount ; i ++){
			threads[i].start();
		}
	}
	
}
