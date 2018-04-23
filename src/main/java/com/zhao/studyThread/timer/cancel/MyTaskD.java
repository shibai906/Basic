package com.zhao.studyThread.timer.cancel;

import java.util.TimerTask;

public class MyTaskD extends TimerTask {
	
	private int i ; 
	
	public MyTaskD(int i){
		this.i = i;
	}
	
	@Override
	public void run() {
		System.out.println("第" + i + "次没有被cancel取消");
	}

}
