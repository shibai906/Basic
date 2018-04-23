package com.zhao.studyThread.circulationQuertion;

public class Entity {
	
	synchronized public void methodA(){
		
		System.out.println("methodA begin");
		boolean isContinueRun = true;
		while(isContinueRun){
			
		}
		System.out.println("methodB end");
		
	}
	
	synchronized public void methodB(){
		
		System.out.println("methodB begin");
		System.out.println("methodB end");
		
	}
	
}
