package com.zhao.studyThread.threadPool;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;


public class ThreadPoolExecutorTest {
	
	public static void main(String[] args) {
		
		ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(5, 10, 20, TimeUnit.SECONDS, new LinkedBlockingQueue<Runnable>());
		
		for(int i = 0 ; i < 15 ; i ++ ) {
			MyTask myTask = new MyTask(i);
			threadPoolExecutor.execute(myTask);
			System.out.println("线程池中线程数目： " + threadPoolExecutor.getPoolSize() + ",队列中等到执行的任务条数" + threadPoolExecutor.getQueue().size()
					+ ",已执行完别的任务数目：" + threadPoolExecutor.getCompletedTaskCount());
		}
		
		threadPoolExecutor.shutdown();
		
	}
	
}

class MyTask implements Runnable{
	
	private int taskNum ;
	
	public MyTask(int num){
		this.taskNum = num ;
	}
	
	@Override
	public void run() {
		System.out.println("正在执行task " + taskNum);
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("task " + taskNum + "执行完毕");
		
	}
	
}
