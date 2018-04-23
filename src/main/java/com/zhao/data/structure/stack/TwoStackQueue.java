package com.zhao.data.structure.stack;

import java.util.Stack;

public class TwoStackQueue {
	
	// 作为一个栈，存储数据，主要用作压入栈的
	private Stack<Integer> stackPush;
	// 这个主要输出数据
	private Stack<Integer> stackPop;
	
	public TwoStackQueue(){
		this.stackPop = new Stack<>();
		this.stackPush = new Stack<>();
	}
	
	public void add(int pushInt){
		stackPush.push(pushInt);
	}
	
	public int poll(){
		
		if(stackPop.empty() && stackPush.empty()){
			throw new RuntimeException("Queue is empty");
		}else if(stackPop.empty()){
			while(!stackPush.empty()){
				stackPop.push(stackPush.pop());
			}
		}
		
		return stackPop.pop();
		
	}
	public int peek(){
		
		if(stackPop.empty() && stackPush.empty()){
			throw new RuntimeException("Queue is empty");
		}else if(stackPop.empty()){
			while(!stackPush.empty()){
				stackPop.push(stackPush.pop());
			}
		}
		return stackPop.peek();
		
	}
}
