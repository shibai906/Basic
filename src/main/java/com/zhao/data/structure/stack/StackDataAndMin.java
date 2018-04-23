package com.zhao.data.structure.stack;

import java.util.Stack;
/*
 * 这是记录最小元素的设计模式
 * 	主要有两种
 * 		第一种：push和pop是一组对应的
 * 			这样更节约空间，但是取出的时候费一些时间
 * 		第二种：pushEconomyTime和popEconomyTime是一组对应的
 * 			这样取出的时候能稍省时间
 * 	stackMin是栈低到栈顶越来越小
 * 
 */
public class StackDataAndMin {
	
	private Stack<Integer> stackData;
	private Stack<Integer> stackMin;
	
	public StackDataAndMin(){
		stackData = new Stack<>();
		stackMin = new Stack<>();
	}
	
	public void pushEconomyTime(int newNum){
		if(this.stackMin.isEmpty()){
			stackMin.push(newNum);
		}else if(this.stackMin.peek() >= newNum){
			stackMin.push(newNum);
		}else{
			stackMin.push(stackMin.peek());
		}
		this.stackData.push(newNum);
		
	}
	
	public void push(int newNum){
		
		if(this.stackMin.isEmpty()){
			stackMin.push(newNum);
		}else if(this.stackMin.peek() >= newNum){
			stackMin.push(newNum);
		}
		this.stackData.push(newNum);
	}
	public int popEconomyTime(){
		if(this.stackData.isEmpty()){
			throw new RuntimeException("Your stack is empty");
		}
		int value = this.stackData.pop();
		this.stackMin.pop();
		
		return value;
	}
	
	public int pop(){
		if(this.stackData.isEmpty()){
			throw new RuntimeException("Your stack is empty");
		}
		int value = this.stackData.pop();
		if(value == this.stackMin.peek()){
			this.stackMin.pop();
		}
		
		return value;
	}
	
	
	
	
}
