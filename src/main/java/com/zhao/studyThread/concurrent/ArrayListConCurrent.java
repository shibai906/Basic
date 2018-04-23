package com.zhao.studyThread.concurrent;

import java.util.concurrent.CopyOnWriteArrayList;

public class ArrayListConCurrent {
	
	public static void main(String[] args) {
		CopyOnWriteArrayList<String> copyOn = new CopyOnWriteArrayList<>();
		ThreadA[] ta = new ThreadA[100];
		for(int i = 0 ; i < 100 ; i ++){
			ta[i] = new ThreadA(copyOn,i+"");
			ta[i].start();
		}
		ThreadB tb = new ThreadB(copyOn);
		tb.start();
	}
	
}
