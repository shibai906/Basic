package com.zhao.studyThread.UnsafetyThread;

public class MyThreadB extends Thread {
	
	@Override
	public void run() {
		LoginServlet.post("b", "bb");
	}
	
}
