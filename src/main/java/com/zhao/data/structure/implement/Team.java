package com.zhao.data.structure.implement;

public interface Team<T> {
	// 1、判断空栈
		boolean isEmpty();
		
		// 3、入队
		boolean push(T e);
		
		// 4、出队
		public T pop();
		
		// 5、返回将要出队的元素
		T peek();
		
		// 6、返回元素在队中的位置
		int getIndex(T e);
		
		// 7、返回队的实际长度
		public int size();
		
		
		// 9、打印队
		void display();
}
