package com.zhao.data.structure.tree.binary;

public class Node<T> {
	private T t;  		// 元素数据
	private Node<T> leftNode;	// 左子树结点引用
	private Node<T> rightNode;	// 右子树结点引用
	private Node<T> persionNode;
	public T getT() {
		return t;
	}
	public void setT(T t) {
		this.t = t;
	}
	public Node<T> getLeftNode() {
		return leftNode;
	}
	public void setLeftNode(Node<T> leftNode) {
		this.leftNode = leftNode;
	}
	public Node<T> getRightNode() {
		return rightNode;
	}
	public void setRightNode(Node<T> rightNode) {
		this.rightNode = rightNode;
	}
	public Node<T> getPersionNode() {
		return persionNode;
	}
	public void setPersionNode(Node<T> persionNode) {
		this.persionNode = persionNode;
	}
	
	
	
	
}
