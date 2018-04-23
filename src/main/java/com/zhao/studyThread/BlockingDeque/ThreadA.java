package com.zhao.studyThread.BlockingDeque;

import java.util.concurrent.BlockingDeque;

public class ThreadA extends Thread {
	private BlockingDeque<Integer> block ;
	
	public ThreadA(BlockingDeque<Integer> block){
		this.block = block ;
	}
	@Override
	public void run() {
		for(int i = 0 ; i < 100 ; i ++){
			try {
				block.put(i);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}
