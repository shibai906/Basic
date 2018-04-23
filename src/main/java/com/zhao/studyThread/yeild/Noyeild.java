package com.zhao.studyThread.yeild;

public class Noyeild extends Thread{

	@Override
	public void run() {
		super.run();
		long beginTime = System.currentTimeMillis();
		for(int i = 0 ; i < 500000 ; i++){
			
		}
		
		long endTime = System.currentTimeMillis();
		System.out.println("无yield得方法运行了" + (endTime - beginTime)+"毫秒");
		
	}
	
}
