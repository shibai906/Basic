package com.zhao.studyThread.volatilestudy.test;

/*
 * 解决死循环，这个不是很好的办法
 * 
 *	这里的演示，要配置为server，把元素添加到那个什么里面，私有堆里面，才能测试出不用volatile的坏处，也不需要配置server
 * 
 */

public class Run {
	public static void main(String[] args) throws InterruptedException {
		
		PrintString ps = new PrintString();
		Thread t = new Thread(ps);
		t.start();
		Thread.sleep(1000);
		ps.setInContinuPrint(false);
		System.out.println("我要停止它！ stopThread=" + Thread.currentThread().getName());
		
	}
	
}
