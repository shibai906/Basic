package com.zhao.data.structure.tree.twoThreeTree;

public class Node<T extends Comparable<T>> {
	private Node<T> parent ;
	private Node<T> left ;
	private Node<T> right ;
	private Node<T> middle ;
	private T leftVal ;
	private T rightVal ;
	public Node<T> getParent() {
		return parent;
	}
	public void setParent(Node<T> parent) {
		this.parent = parent;
	}
	public Node<T> getLeft() {
		return left;
	}
	public void setLeft(Node<T> left) {
		this.left = left;
	}
	public Node<T> getRight() {
		return right;
	}
	public void setRight(Node<T> right) {
		this.right = right;
	}
	public Node<T> getMiddle() {
		return middle;
	}
	public void setMiddle(Node<T> middle) {
		this.middle = middle;
	}
	public T getLeftVal() {
		return leftVal;
	}
	public void setLeftVal(T leftVal) {
		this.leftVal = leftVal;
	}
	public T getRightVal() {
		return rightVal;
	}
	public void setRightVal(T rightVal) {
		this.rightVal = rightVal;
	}
	
}
