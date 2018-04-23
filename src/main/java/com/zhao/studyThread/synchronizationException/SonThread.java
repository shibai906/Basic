package com.zhao.studyThread.synchronizationException;

public class SonThread extends Thread {
	
	@Override
	public void run() {
		Son son = new Son();
		son.method();
		son.method();
	}
}
