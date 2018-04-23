package com.zhao.studyThread.communication.productionConsumption.OperationStack;

public class ThreadPop extends Thread {
	
	private MyStack myStack;
	public ThreadPop(MyStack myStack){
		this.myStack = myStack;
	}
	
	@Override
	public void run() {
		while(true)
		myStack.pop();
	}
	
}
