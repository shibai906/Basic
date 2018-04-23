package com.zhao.studyThread.communication.productionConsumption.OperationStack;

public class ThreadPush extends Thread {
	
	private MyStack myStack;
	public ThreadPush(MyStack myStack){
		this.myStack = myStack;
	}
	
	@Override
	public void run() {
		while(true)
		myStack.push();
	}
	
	
}
