package com.zhao.studyThread.communication.productionConsumption.OperationStack;

public class TestOperationStack {
	
	public static void main(String[] args) {
		
		MyStack ms = new MyStack();
		ThreadPush tpu = new ThreadPush(ms);
		ThreadPush tpu1 = new ThreadPush(ms);
		ThreadPush tpu2 = new ThreadPush(ms);
		ThreadPush tpu3 = new ThreadPush(ms);
		ThreadPop tpo = new ThreadPop(ms);
		ThreadPop tpo1 = new ThreadPop(ms);
		ThreadPop tpo2 = new ThreadPop(ms);
		tpu.start();
		tpu1.start();
		tpu2.start();
		tpu3.start();
		tpo.start();
		tpo1.start();
		tpo2.start();
	}
	
}
