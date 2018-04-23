package com.zhao.data.structure.stack;

import java.util.Stack;

public class RecursionReverseStack {
	
	private Stack<Integer> stack;
	
	public RecursionReverseStack(){
		stack = new Stack<>();
	}
	
	/*
	 * 这个方法目的是每次取出栈顶
	 */
	public int getAndRemovelasetElement(){
		
		int result = stack.pop();
		if(stack.isEmpty()){
			return result;
		} else {
			int last = getAndRemovelasetElement();
			stack.push(result);
			return last;
		}
	}
	
	public void reverse(){
		
		if(stack.isEmpty()){
			return ;
		}
		
		int i =stack.pop(); // getAndRemovelasetElement 刚成这个方法也行，不知道作者怎么想的
		reverse();
		stack.push(i);
	}
	
	public void push(int item){
		stack.push(item);
	}
	
	public int pop(){
		return stack.pop();
	}
	
	
}
