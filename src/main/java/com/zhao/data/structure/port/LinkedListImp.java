package com.zhao.data.structure.port;


import com.zhao.data.structure.implement.LinkedList;

public class LinkedListImp<E> implements LinkedList<E> {

	private static final long serialVersionUID = 3685599722329504849L;

	private Node<E> root;

	private int size; // 声明单链表中存储的节点数

	public LinkedListImp() {
		root = new Node<E>(); // 开始先实例化头节点
	}

	/*
	 * 这是网上方法，挺好用的 Node<E> node = new Node<>(e); Node<E> tnode = root.getNext();
	 * root.setNext(node); node.setNext(tnode);
	 */
	@Override
	public void add(E e) {

		if (root.getT() == null) {
			root.setT(e);
		} else {
			Node<E> node = new Node<>(e);
			if (root.getNext() == null) {
				root.setNext(node);
			} else {
				Node<E> no = root.getNext();
				while (no.getNext() != null) {
					no = no.getNext();
				}
				no.setNext(node);
			}
			size++;
		}
	}
	@Override
	public E remove(int index) {
		E e = null;
		if (index <= 0 || index > size)
			return null;

		if (index == 1) {
			e = root.getT();
			root = root.getNext();
		} else if (index == 2) {
			e = root.getNext().getT();
			root.setNext(root.getNext().getNext());
			
		} else {
			Node<E> node = root.getNext();
			for (int i = 2; i < index - 1; i++) {
				node = node.getNext();
			}
			e = node.getT();
			node.setNext(node.getNext().getNext());
			

		}

		size--;// 计数器减一

		return e;// 返回删除节点中的数据域
	}
	@Override
	public void add(int num, E e) {
		if (num > size + 1) {
			System.out.println("你做的是错的");
			return;
		}
		if (num == 1) {
			addFirst(e);
		} else if (num == 2) {
			Node<E> node = new Node<E>(e);
			Node<E> tnode = root.getNext();
			node.setNext(tnode);
			root.setNext(node);
		} else {
			Node<E> node = root.getNext();

			for (int i = 2; i < num - 1; i++) {
				node = node.getNext();
			}
			// 先要把这个插进去，我的，属于正式版。
			Node<E> tnode = new Node<E>(e);
			tnode.setNext(node.getNext());
			node.setNext(tnode);
			
			// 庞建飞的
			// Node<E> next1 = node.getNext();
			// node.setNext(tnode);
			// tnode.setNext(next1);
			
		}

	}
	
	@Override
	public void addFirst(E e) {
		if (root.getT() == null) {
			root.setT(e);
		}
		Node<E> node = new Node<E>(e);
		node.setNext(root);
		root = node;
	}
	@Override
	public void toStr() {
		System.out.println(root.getT());
		Node<E> next = root.getNext();
		while (next != null) {
			System.out.println(next.getT());
			next = next.getNext();
		}
	}

}
