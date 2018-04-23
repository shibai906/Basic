package com.zhao.data.structure.implement;

public interface Inn<E> {
	
	// 1、判断空栈
	boolean isEmpty();
	
	
	
	// 3、入栈
	boolean push(E e);
	
	// 4、出栈
	public E pop();
	
	// 5、返回栈顶
	E peek();
	
	// 6、返回元素在栈中的位置
	int getIndex(E e);
	
	// 7、返回栈的实际长度
	public int size();
	
	// 8、返回栈内容
	abstract public int getStackSize();
	
	// 9、打印栈
	void display();
	
}
