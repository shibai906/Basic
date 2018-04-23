package com.zhao.studyThread.communication.productionConsumption.OperationStack;

import java.util.ArrayList;
import java.util.List;

public class MyStack {
	
	private List<String> list = new ArrayList<>();
	synchronized public void push(){
		try{
			while(list.size() == 1){
				this.wait();
			}
			list.add("ansyString" + Math.random());
			this.notifyAll();
			System.out.println("push=" + list.size());
		}catch (InterruptedException e){
			e.printStackTrace();
		}
	}
	
	synchronized public String pop(){
		String returnValue = "";
		try{
			while(list.size() == 0){
				System.out.println("pop操作中的：" + Thread.currentThread().getName()
						+"线程显wait状态");
				this.wait();
			}
			returnValue = "" + list.remove(0);
			this.notify();
			System.out.println("push=" + list.size());
		}catch (InterruptedException e){
			e.printStackTrace();
		}
		return returnValue;
	}
	
}
