package com.zhao.data.structure.tree;

import java.io.Serializable;

public class BinaryNode<T extends Comparable> implements Serializable {

	private static final long serialVersionUID = -7712402016845480957L;
	public BinaryNode<T> left; // 左结点
	public BinaryNode<T> right; // 右结点
	
	public T data;
	
	public BinaryNode(T data,BinaryNode left , BinaryNode right){
		this.data = data;
		this.left = left;
		this.right = right;
	}
	
	public BinaryNode(T data){
		this(data,null,null);
	}
	
	/**
	 * 判断是否为叶子结点
	 * @return
	 */
	public boolean isLeaf(){
		return this.left == null && this.right == null;
		
	}
}