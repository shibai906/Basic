package com.zhao.data.structure.port;


import com.zhao.data.structure.implement.Inn;

public class SequenceInn<T> implements Inn<T> {
	
	private T[] t = null ; // 数据域 
	private int top = 0 ; // 栈顶指针初始值为0
	private int maxSize = 0 ;  // 栈最大容量
	
	public SequenceInn(){
		this(10);
	}

	@SuppressWarnings("unchecked")
	public SequenceInn(int initialSize) {
		if(initialSize >= 0){
			this.t = (T[]) new Object[initialSize];
			this.maxSize = initialSize;
		}else{
			System.out.println("栈初始化失败");
			System.exit(0);
		}
	}

	@Override
	public boolean isEmpty() {
		return top == 0 ? true : false;
	}
	public boolean isMax() { // 判断栈满没
		return top == maxSize ? true : false;
	}
	@Override
	public boolean push(T e) {
		if(isMax()){
			System.err.println("对不起,栈已满,无法入栈");
		}
		t[top] = e; // 将元素添加到表中
		top ++ ;
//		System.out.println("恭喜你，入栈成功");
		return true;
	}
	
	@Override
	public T pop() {
		if(isEmpty()){
			System.err.println("对不起，目前栈空，无法出栈");
		}
		T t = this.t[top]; // 返回当前的栈顶元素
		top -- ; // 更新栈顶
		return t;
	}
	@Override
	public T peek() {  // 返回栈顶
		if(isEmpty()){
			System.err.println("对不起，目前是空栈，无法返回栈顶元素");
			return null;
		}
		return t[top-1];
	}
	@Override
	public int getIndex(T e) { // 返回元素在栈中的位置
		int num = top;
		while(top > 0){
			
			if(peek().equals(e)){
				int temp = top;
				top = num ;
				num = temp;
				return num;
			}
			top -- ;
		}
		return -1;
	}
	@Override
	public int size() {
		return top;
	}
	@Override
	public int getStackSize() {
		return this.maxSize;
	}
	@Override
	public void display() {
		while(top > 0){
			top --;
			System.out.println(t[top]);
			
		}
	}
	
}
