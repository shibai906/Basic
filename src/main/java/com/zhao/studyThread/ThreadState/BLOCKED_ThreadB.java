package com.zhao.studyThread.ThreadState;

public class BLOCKED_ThreadB extends Thread {
	
	@Override
	public void run() {
		BLOCKED_Entity.serviceMethod();
		
	}
	
}
