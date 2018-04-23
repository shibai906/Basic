package com.zhao.studyThread.communication.WaitInterrupt;

/*
 * 这里抛出来的异常和执行sleep的效果一样，猜想，如果执行等待情况下，执行中断，和停止线程，并抛出异常
 */

public class TestWaitInterrupt {
	
	public static void main(String[] args) {
		
		Entity entity = new Entity();
		ThreadA ta = new ThreadA(entity);
		ta.start();
		
	}
	
}
