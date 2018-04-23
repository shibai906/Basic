package com.zhao.studyThread.timer.cancel;

import java.util.Calendar;
import java.util.Date;
import java.util.Timer;

public class TestCancel {
	
	public static void main(String[] args) throws InterruptedException {
		NotimerCancel();
	}
	
	// cancel方法有时并没有争抢到queue锁，那样不能让TimerTask方法停下来，会让里面的任务执行
	public static void NotimerCancel() throws InterruptedException{
		
		int i = 0;
		Calendar cal = Calendar.getInstance();
		Date run = cal.getTime();
		while(true){
			i ++ ;
			Timer timer = new Timer();
			MyTaskD task1 = new MyTaskD(i);
			timer.schedule(task1, run);
			timer.cancel();
		}
		
		
	}
	
	
	public static void timerCancel() throws InterruptedException{
		System.out.println("当前时间为：" + new Date());
		Calendar cal = Calendar.getInstance();
		Date da = cal.getTime();
		System.out.println("计划时间为" + da);
		MyTaskC ma = new MyTaskC();
		MyTaskB mb = new MyTaskB();
		Timer timer = new Timer();
		timer.schedule(ma, da,4000);
		timer.schedule(mb, da,4000);
		Thread.sleep(10000);
		// 这时清除timer里面的东西
		timer.cancel();
		
		
	}
	
	public static void timerTaskCancel(){
		System.out.println("当前时间为：" + new Date());
		Calendar cal = Calendar.getInstance();
		Date da = cal.getTime();
		System.out.println("计划时间为" + da);
		MyTaskA ma = new MyTaskA();
		MyTaskB mb = new MyTaskB();
		Timer timer = new Timer();
		timer.schedule(ma, da,4000);
		timer.schedule(mb, da,4000);
	}
	
}
