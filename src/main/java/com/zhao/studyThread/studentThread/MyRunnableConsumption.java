package com.zhao.studyThread.studentThread;

public class MyRunnableConsumption implements Runnable{
	
	private Student s;
	public MyRunnableConsumption(Student s) {
		this.s = s;
	}
	@Override
	public void run() {
		while(true){
			s.get();
		}
	}
	
}
