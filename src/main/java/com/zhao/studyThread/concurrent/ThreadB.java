package com.zhao.studyThread.concurrent;

import java.util.concurrent.CopyOnWriteArrayList;

public class ThreadB extends Thread {
	
	private CopyOnWriteArrayList<String> copyOn ;
	
	public ThreadB(CopyOnWriteArrayList<String> copyOn){
		this.copyOn = copyOn ;
	}
	
	@Override
	public void run() {
		for(String str : copyOn){
			System.out.println(str);
		}
	}
	
}
