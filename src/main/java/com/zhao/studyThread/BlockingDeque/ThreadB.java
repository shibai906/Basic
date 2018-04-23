package com.zhao.studyThread.BlockingDeque;

import java.util.concurrent.BlockingDeque;

public class ThreadB extends Thread {
	private BlockingDeque<Integer> block ;
	
	public ThreadB(BlockingDeque<Integer> block){
		this.block = block ;
	}
	@Override
	public void run() {
		try {
			while(true)
				System.out.println(block.take());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
