package com.zhao.studyThread.single.enumdemo;

public class ThreadA extends Thread {
	
	@Override
	public void run() {
		System.out.println(Entity.getConnection());
	}
}
