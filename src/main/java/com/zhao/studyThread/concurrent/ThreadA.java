package com.zhao.studyThread.concurrent;

import java.util.concurrent.CopyOnWriteArrayList;

public class ThreadA extends Thread {
	
	private CopyOnWriteArrayList<String> copyOn ;
	private String str ;
	
	public ThreadA(CopyOnWriteArrayList<String> copyOn , String str){
		this.copyOn = copyOn ;
		this.str = str ;
	}
	
	@Override
	public void run() {
		copyOn.add(str) ;
	}
	
}
