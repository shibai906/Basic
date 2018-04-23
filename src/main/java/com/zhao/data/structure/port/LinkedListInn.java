package com.zhao.data.structure.port;


import com.zhao.data.structure.implement.Inn;

public class LinkedListInn<T> implements Inn<T> {
	
	private Node<T> top = null ; // 定义栈顶
	private int size = 0; // 定义栈节点数量
	
	// 判断栈空
	@Override
	public boolean isEmpty() {
		return size == 0 ? true : false;
	}
	
	// 压栈
	@Override
	public boolean push(T e) {
		Node<T> node = new Node<T>(e);
		node.setNext(top);
		top = node;
		size ++;
		return true;
	}

	@Override
	public T pop() {  // 出栈
		if(isEmpty()){
			System.out.println("对不起，栈空");
			return null;
		}
		T t = top.getT();
		top = top.getNext();
		size --;
		return t;
	}

	@Override
	public T peek() {
		return this.top.getT();
	}

	@Override
	public int getIndex(T e) {
		int i = size;
		Node<T> n = top;
		while(n != null){
			if(n!=null && i > 0){
				if(n.getT().equals(e)){
					return i;
				}
				n = n.getNext();
				i--;
			}
			
		}
		return -1;
	}

	@Override
	public int size() {
		return this.size;
	}

	@Override
	public int getStackSize() {
		return 0;
	}

	@Override
	public void display() {
		
		while(top != null){
			System.out.println(top.getT());
			top = top.getNext();
		}
		
	}

}
