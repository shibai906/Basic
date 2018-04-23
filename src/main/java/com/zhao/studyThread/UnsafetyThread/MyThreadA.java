package com.zhao.studyThread.UnsafetyThread;

public class MyThreadA extends Thread{
	
	@Override
	public void run() {
		LoginServlet.post("a", "aa");
	}
	
	
}
