package com.zhao.studyThread.timer.example;

import java.util.Calendar;
import java.util.Date;
import java.util.Timer;

public class TestExample {
	
	public static void main(String[] args) {
		test4();
		
	}
	
	public static void test4(){
		
		System.out.println("当前时间为：" + new Date());
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.SECOND, cal.get(Calendar.SECOND)-10);
		Date run = cal.getTime();
		System.out.println("计划时间为：" + run);
		MyTaskC task = new MyTaskC();
		Timer timer = new Timer();
		/*
		 * schedule(task,run);代表几秒后执行，而后面在家一个时间
		 * 	表示每隔多少秒又继续执行一次
		 * 当计划早于当前时间，就现在执行每隔多少秒的任务
		 */
		timer.schedule(task, run,4000);
	}
	
	public static void test3(){
		
		System.out.println("当前时间为:" + new Date());
		Calendar cal = Calendar.getInstance();
		Date run1 = cal.getTime();
		System.out.println("计划时间是" + run1);
		
		Calendar cal2 = Calendar.getInstance();
		cal2.add(Calendar.SECOND, 15);  // 设置多少秒后执行
		Date run2 = cal2.getTime();
		System.out.println("计划时间为：" + run2);
		
		MyTaskA t1 = new MyTaskA();
		MyTaskB t2 = new MyTaskB();
		
		Timer timer = new Timer();
		timer.schedule(t1, run1);
		timer.schedule(t2, run2);
		
	}
	
	public static void test2(){
		/*
		 * TimerTask是以队列的方式一个一个被顺序性地执行，所以执行的时间有可能和预期的时间不一致
		 */
		System.out.println("当前时间为:" + new Date());
		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.SECOND, 10);
		Date run1 = cal.getTime();
		System.out.println("计划时间是" + run1);
		
		Calendar cal2 = Calendar.getInstance();
		cal2.add(Calendar.SECOND, 15);
		Date run2 = cal2.getTime();
		System.out.println("计划时间为：" + run2);
		
		Timer1 t1 = new Timer1();
		Timer1 t2 = new Timer1();
		
		Timer timer = new Timer();
		timer.schedule(t1, run1);
		timer.schedule(t2, run2);
		
		
	}
	
	public static void test1(){
		System.out.println(" 当前时间为：" + new Date());
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.SECOND, cal.get(Calendar.SECOND) - 20);
		Date runDate = cal.getTime();
		System.out.println("计划时间为" + runDate); // 如果不加这一句，下面的执行时间也不减少
		Timer1 t1 = new Timer1();
//		Timer timer = new Timer(true); // 该为守护线程
		Timer timer = new Timer();
		timer.schedule(t1, runDate);
		
	}
	
}
