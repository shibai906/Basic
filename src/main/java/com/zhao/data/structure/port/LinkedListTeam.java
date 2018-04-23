package com.zhao.data.structure.port;


import com.zhao.data.structure.implement.Team;

public class LinkedListTeam<T> implements Team<T> {

	private Node<T> root = null;
	private Node<T> head = null;
	private int size = 0;

	@Override
	public boolean isEmpty() {
		return size == 0 ? true : false;
	}

	@Override
	public boolean push(T e) {
		Node<T> node = new Node<T>(e);
		if(root == null){
			root = node;
			head = root;
			return true;
		}
		root.setNext(node);
		root = root.getNext();
		size++;
		return false;
	}

	@Override
	public T pop() {
		if (isEmpty()) {
			System.err.println("队中无元素，无法移除");
		}
		T t = head.getT();
		head = head.getNext();
		size--;
		return t;
	}

	@Override
	public T peek() {
		return head.getT();
	}

	@Override
	public int getIndex(T e) {
		int i = 0;
		Node<T> n = head;
		while (i < size) {
			if (n.getT().equals(e)){
				return i+1;
			}
			i++;
		}
		return - 1;
	}

	@Override
	public int size() {
		return this.size;
	}


	@Override
	public void display() {
		Node<T> n = head;
		while(n != null){
			System.out.println(n.getT());
			n = n.getNext();
		}
	}

}
