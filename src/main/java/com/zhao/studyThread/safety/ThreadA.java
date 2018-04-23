package com.zhao.studyThread.safety;

public class ThreadA extends Thread {
	public SafeClass safee;

	
	public ThreadA(SafeClass safe){
		safee = safe;
	}
	
	@Override
	public void run() {
		super.run();
		safee.add("jiao","jiao");
		
		
	}
	
	
}
