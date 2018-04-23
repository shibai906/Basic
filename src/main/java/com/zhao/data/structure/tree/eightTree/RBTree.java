package com.zhao.data.structure.tree.eightTree;

import java.util.ArrayList;
import java.util.List;

public class RBTree<T extends Comparable<T>> {

	private RBTNode<T> root; // 根结点
	private RBTNode<T> opRoot; // 操作根结点
	private static final boolean RED = false;
	private static final boolean BLACK = true;
	List<T> list = new ArrayList<T>();
	
	public RBTree() {
		root = new RBTNode<T>();
	}

	public void insert(T t) {
		if (root.getKey() == null) {
			root.setColor(RBTree.BLACK);
			root.setKey(t);
			return;
		}
		opRoot = root;
		RBTNode<T> node = new RBTNode<T>();
		node.setKey(t);
		node.setColor(RBTree.RED);
		insert(opRoot, node);
	}

	private void insert(RBTNode<T> opRoot, RBTNode<T> node) {
		if (opRoot.getKey().compareTo(node.getKey()) > 0) {
			if (opRoot.getLeft() != null) {
				insert(opRoot.getLeft(), node);
			} else {
				opRoot.setLeft(node);
				node.setParent(opRoot);
				redBlack(node);
			}
		}
		if (opRoot.getKey().compareTo(node.getKey()) < 0) {
			if (opRoot.getRight() != null) {
				insert(opRoot.getRight(), node);
			} else {
				opRoot.setRight(node);
				node.setParent(opRoot);
				redBlack(node);
			}
		}
	}

	@SuppressWarnings("unused")
	private void redBlack(RBTNode<T> node) {
		if(node.getParent().isColor() == BLACK){
			return ;
		}
		if (node.getParent().getParent() == null) {
			return;
		}
		node = node.getParent();
		RBTNode<T> parent = node.getParent();
		if(node.getParent().getLeft() != null && node.getParent().getLeft().getKey().compareTo(node.getKey()) == 0){
			if (node.getRight() != null && node.getRight().isColor() == node.isColor()) {
				leftRotate(node);
				node = node.getParent(); // 这里为了固定node位置，还让它是底下的爸爸。
			}
			if (node.getLeft() != null && node.getLeft().isColor() == node.isColor()) {
				rightRotate(node);
				ifFacherColor(node);
			}
		}
		if(node.getParent().getRight() != null && node.getParent().getRight().getKey().compareTo(node.getKey()) == 0){
			if(node.getLeft() != null && node.isColor() == node.getLeft().isColor()){
				rightRotate(node.getParent());
				node = node.getParent();
			}
			if(node.getRight() != null && node.isColor() == node.getRight().isColor()){
				leftRotate(node.getParent());
				if(node.getLeft().isColor() == BLACK){
					ifFacherColor(node);
				}
			}
		}
		
		root.setColor(BLACK);
		root.setParent(null);
		
	}

	private void ifFacherColor(RBTNode<T> node) {
		RBTNode<T> parent = node.getParent();
		if(parent == null || ( parent != null && parent.isColor() == BLACK)){
			if(node.isColor() == RED){
				if(node.getLeft()!= null){
					node.getLeft().setColor(BLACK);
				}
				if(node.getRight() != null){
					node.getRight().setColor(BLACK);
				}
			}
		}
		if(parent != null && parent.isColor() == RED){
			node.setColor(BLACK);
		}
		
	}

	// 这里的node只的也是需要旋转的爸爸，进行往右旋转
	private void rightRotate(RBTNode<T> node) {
		RBTNode<T> parent = node.getParent();
		if (parent == null) {
			return;
		}
		// 先连接最上面的
		grandpason(parent.getParent(), node);
		node.setParent(parent.getParent());
		parent.setLeft(node.getRight());
		if(node.getRight() != null)
			node.getRight().setParent(parent);
		node.setRight(parent);
		parent.setParent(node);
	}

	// 这里node指的是一个值，就是需要旋转中的爸爸，进行往左边旋转
	private void leftRotate(RBTNode<T> node) {
		RBTNode<T> right = node.getRight();
		grandpason(node.getParent(), right);
		right.setParent(node.getParent());
		node.setRight(right.getLeft());
		if (right.getLeft() != null) {
			right.getLeft().setParent(node);
		}
		right.setLeft(node);
		node.setParent(right);
	}

	// 中间隔了一辈
	private void grandpason(RBTNode<T> parent, RBTNode<T> left) {
		if (parent == null) {
			this.root = left ;
			return;
		}
		if (parent.getLeft() != null && parent.getLeft().getKey().compareTo(left.getParent().getKey()) == 0) {
			parent.setLeft(left);
		} else
			parent.setRight(left);
	}

	// 中序遍历，这里就不其他遍历了，其他遍历也没劲了
	public List<T> infixOrderTraverse() {
		opRoot = root;
		infixOrderTraverse(opRoot);
		return list;
	}

	// 真真添加到集合的方法
	private void infixOrderTraverse(RBTNode<T> opRoot) {
		if (opRoot.getLeft() != null) {
			infixOrderTraverse(opRoot.getLeft());
		}
		list.add(opRoot.getKey());
		if (opRoot.getRight() != null) {
			infixOrderTraverse(opRoot.getRight());
		}
	}

}
