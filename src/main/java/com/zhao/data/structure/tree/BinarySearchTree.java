package com.zhao.data.structure.tree;

public class BinarySearchTree<T extends Comparable> implements Tree {

	// 根结点
	protected BinaryNode<T> root;
	private Comparable<T> data;
	private int size;
	private int height;
	
	public BinarySearchTree() {
		root = null;
	}
	public void toStr(){
		toStr(root);
	}
	private void toStr(BinaryNode<T> root) {
		if (root.left != null) {
			if (root.left.left != null)
				toStr(root.left);
			else{
				System.out.println(root.left.data);
			}
		}
		System.out.println(root.data);
		if (root.right != null) {
			if (root.right.left != null) {
				toStr(root.right);
			}else if (root.right.right != null) {
				toStr(root.right);
			} else{
				System.out.println(root.right.data);
			}
		}
	}
	@Override
	public boolean isEmpty() {
		if(root == null){
			return false;
		}
		return true;
	}
	@Override
	public int size() {
		return size;
	}
	@Override
	public int height() {
		return height - 1;
	}

	@Override
	public String preOrder() {
		return null;
	}

	@Override
	public String inOrder() {
		return null;
	}

	@Override
	public String postOrder() {
		return null;
	}

	@Override
	public String leveOrder() {
		return null;
	}

	/*
	 * 这里的插入是这样插入的，先插入一个值，然后把大的放右边，把小的放左边
	 * 
	 */
	private int max = 1;
	@Override
	public void insert(Comparable data) {
		if (root == null) {
			size ++;
			height = 1;
			root = new BinaryNode(data);
		} else {
			insert(root, data,max);
		}
	}

	@SuppressWarnings("unchecked")
	private void insert(BinaryNode<T> root, Comparable data,int max) {
		max ++;
		if(max > height){
			height = max;
		}
		if (root.data.compareTo(data) > 0) {
			if (root.left != null) {
				insert(root.left, data,max);
			} else {
				size ++;
				root.left = new BinaryNode(data);
			}
		} else {
			if (root.right != null) {
				insert(root.right, data,max);
			} else {
				size ++;
				root.right = new BinaryNode(data);
			}
		}
	}

	@Override
	public void remove(Comparable date) {
	}

	@Override
	public Comparable findMax() {
		getMax(root);
		return null;
	}
	
	private Comparable getMax(BinaryNode<T> root){
		if(root.right != null)
			getMax(root.right);
		
		return root.data;
	}
	
	@Override
	public Comparable findMin() {
		return null;
	}

	@Override
	public BinaryNode findNode(Comparable data) {
		return null;
	}

	@Override
	public boolean contains(Comparable data) throws Exception {
		return false;
	}

	@Override
	public void clear() {
	}

}
