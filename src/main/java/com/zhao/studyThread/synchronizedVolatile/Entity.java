package com.zhao.studyThread.synchronizedVolatile;

public class Entity {
	
	private boolean isContinueRun = true;
	
	public void runMethod() {
		String anyString = new String();
		
		while(isContinueRun){
			// 必须使用在方法的内部。让isContinueRun具有可见性
			synchronized(anyString){
				
			}
		}
		System.out.println("请下来了！");
	}
	
	public void stopMethod(){
		isContinueRun = false;
	}
	
	
}
