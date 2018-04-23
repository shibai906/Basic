package com.zhao.studyThread.safety;

public class ThreadB extends Thread {
	public SafeClass safe;
	
	public ThreadB(SafeClass saf){
		safe = saf;
	}
	
	@Override
	public void run() {
		super.run();
		safe.add("zhao","huan");
		
		
	}
	
	
}
