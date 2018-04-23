package com.zhao.studyThread.communication.changeWait;

// 加法操作
public class Add {
	
	private String lock;
	public Add(String lock){
		this.lock = lock;
	}
	
	public void add(){
		synchronized(lock){
			ValueObject.list.add("anyString");
			lock.notifyAll();
		}
		
	}
}
