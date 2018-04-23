package com.zhao.data.structure.stack;

import java.util.Stack;

public class StackSort {
	
	public static void main(String[] args) {
		
		Stack<Integer> stack = new Stack<Integer>();
		Stack<Integer> stack1 = new Stack<Integer>();
		for(int i = 0 ; i < 500 ; i ++){
			int num = (int) (Math.random() * 10000);
			stack.push(num);
			stack1.push(num);
		}
		Long start = System.currentTimeMillis();
		improvementSortByStack(stack);
		Long end = System.currentTimeMillis();
		System.out.println(end - start);
		Long start1 = System.currentTimeMillis();
		sortByStack(stack1);
		Long end1 = System.currentTimeMillis();
		System.out.println(end1 - start1);
		
		while(!stack.isEmpty()){
			System.out.print(stack.pop()+",");
		}
		System.out.println();
		while(!stack1.isEmpty()){
			System.out.print(stack1.pop()+",");
		}
		
		
	}
	
	public static void improvementSortByStack(Stack<Integer> stack){
		Stack<Integer> help = new Stack<Integer>();
		boolean flag = false;
		int count = 0 ;
		while(!stack.isEmpty()){
			if(flag){
				for(int i = 0 ; i < count ; i ++){
					help.push(stack.pop());
				}
				count = 0;
				flag = false;
			}
			if(stack.isEmpty())
				break;
			int cur = stack.pop();
			while((!help.isEmpty()) && help.peek() < cur){
				stack.push(help.pop());
				count ++;
				flag = true ;
			}
			help.push(cur);
		}
		while(!help.isEmpty()){
			stack.push(help.pop());
		}
	}
	
	public static void sortByStack(Stack<Integer> stack){
		Stack<Integer> help = new Stack<Integer>();
		while(!stack.isEmpty()){
			int cur = stack.pop();
			while((!help.isEmpty()) && help.peek() < cur){
				stack.push(help.pop());
			}
			help.push(cur);
		}
		while(!help.isEmpty()){
			stack.push(help.pop());
		}
		
/*		if(stack.isEmpty()){
			return ;
		}
		Stack<Integer> help = new Stack<Integer>();
		help.push(stack.pop());
		while(!stack.isEmpty()){
			int cur = stack.pop();
			while(!help.isEmpty() && help.peek() < cur){
				help.push(cur);
			}
			if(cur < help.peek()){
				while(!help.isEmpty()){
					stack.push(help.pop());
				}
				help.push(cur);
			}
		}
		while(!help.isEmpty()){
			stack.push(help.pop());
		}*/
		
	}
	
}
