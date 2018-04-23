package com.zhao.studyThread.synchronizationException;

public class FatherThread extends Thread {
	
	@Override
	public void run() {
		Father father = new Father();
		father.method();
	}
}
