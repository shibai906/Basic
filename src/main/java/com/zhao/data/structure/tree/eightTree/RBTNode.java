package com.zhao.data.structure.tree.eightTree;

public class RBTNode <T extends Comparable<T>> {
	
	private boolean color ;		// 颜色
	private T key ;				// 关键字(键值)
	private RBTNode<T> left ;	// 左孩子
	private RBTNode<T> right ;	// 右孩子
	private RBTNode<T> parent ;	// 父结点
	public boolean isColor() {
		return color;
	}
	public void setColor(boolean color) {
		this.color = color;
	}
	public T getKey() {
		return key;
	}
	public void setKey(T key) {
		this.key = key;
	}
	public RBTNode<T> getLeft() {
		return left;
	}
	public void setLeft(RBTNode<T> left) {
		this.left = left;
	}
	public RBTNode<T> getRight() {
		return right;
	}
	public void setRight(RBTNode<T> right) {
		this.right = right;
	}
	public RBTNode<T> getParent() {
		return parent;
	}
	public void setParent(RBTNode<T> parent) {
		this.parent = parent;
	}
	
}
