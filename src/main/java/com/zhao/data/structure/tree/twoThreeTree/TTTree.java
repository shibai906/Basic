package com.zhao.data.structure.tree.twoThreeTree;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * <p>这里是2-3树的撰写，第一次文档标注
 * 
 *@comments
 *@author 失败906
 *@date 2017年11月22日
 *@version 1.0
 */
public class TTTree<T extends Comparable<T>> {

	
	private Node<T> root;
	private Node<T> opRoot;
	private List<T> list = new ArrayList<T>();

	public TTTree() {
		root = new Node<T>();
	}

	public void insert(T t) {
		if (threeisNull(this.root)) {
			if (leftOrRightInsert(this.root, t))
				return;
			transformation(this.root, t);
			this.opRoot = this.root;
			return;
		}
		insert(this.opRoot, t);
	}

	private void insert(Node<T> opRoot, T t) {
		if (threeisNull(opRoot)) {
			if (leftOrRightInsert(opRoot, t))
				return;
			transformation(opRoot, t);
		}
		if (opRoot.getRightVal().compareTo(t) < 0) {
			if (isRight(opRoot, t))
				return;
			transformation(opRoot.getRight(), t);
		} else if (opRoot.getLeftVal().compareTo(t) > 0) {
			if (isLeft(opRoot , t))
				return;
			transformation(opRoot.getLeft(), t);
		} else {
			if (isMiddle(opRoot , t))
				return;
			transformation(opRoot.getMiddle(), t);
		}
	}



	// 这里是给方法变形用的
	private void transformation(Node<T> root, T t) {
		if (root == null) {
			return;
		}
		Node<T> middle = getMiddle(root, t);
		Node<T> left = getLeft(root, t);
		Node<T> right = getRight(root, t);
		if (root.getParent() == null) {
			root.setLeftVal(middle.getLeftVal());
			root.setRightVal(null);
			if (isLeft(root , left.getLeftVal())) {
			} else {
				transformation(root.getLeft(), left.getLeftVal());
			}
			if (isRight(middle, right.getLeftVal())) {
			} else {
				transformation(root.getRight(), right.getRightVal());
			}
			return;
		}
		if (leftOrRightInsert(root.getParent(), t)) {
			root.setLeftVal(left.getLeftVal());
			root.setRightVal(right.getLeftVal());
			return;
		}

		transformation(root.getParent(), middle.getLeftVal());
		if (isLeft(root , left.getLeftVal())) {
		} else {
			transformation(root.getLeft(), left.getLeftVal());
		}
		if (isRight(root, right.getLeftVal())) {
		} else {
			transformation(root.getRight(), right.getRightVal());
		}
	}
	
	// 连续这三个是为了防止null操作
	private boolean isRight(Node<T> opRoot, T t) {
		if(opRoot.getRight() == null){
			Node<T> node = new Node<T>();
			node.setParent(opRoot);
			opRoot.setRight(node);
			return leftOrRightInsert(node , t) ;
		}
		return leftOrRightInsert(opRoot.getRight(),t);
	}
	
	private boolean isMiddle(Node<T> opRoot, T t) {
		if(opRoot.getMiddle() == null){
			Node<T> node = new Node<T>();
			node.setParent(opRoot);
			opRoot.setMiddle(node);
			return leftOrRightInsert(node , t) ;
		}
		return leftOrRightInsert(opRoot.getMiddle(),t);
	}
	
	private boolean isLeft(Node<T> opRoot, T t) {
		if(opRoot.getLeft() == null){
			Node<T> node = new Node<T>();
			node.setParent(opRoot);
			opRoot.setLeft(node);
			return leftOrRightInsert(node , t) ;
		}
		return leftOrRightInsert(opRoot.getLeft(),t);
	}
	
	private Node<T> getRight(Node<T> root, T t) {
		if (root.getRightVal().compareTo(t) > 0) {
			t = root.getLeftVal();
		}
		Node<T> node = new Node<T>();
		node.setLeftVal(t);
		return node;
	}

	private Node<T> getLeft(Node<T> root2, T t) {
		if (root.getLeftVal().compareTo(t) < 0) {
			t = root.getLeftVal();
		}
		Node<T> node = new Node<T>();
		node.setLeftVal(t);
		return node;
	}

	private Node<T> getMiddle(Node<T> root, T t) {
		if (root.getLeftVal().compareTo(t) > 0)
			t = root.getLeftVal();
		else if (root.getRightVal().compareTo(t) < 0)
			t = root.getRightVal();
		Node<T> node = new Node<T>();
		node.setLeftVal(t);
		return node;
	}

	// 给左右插入值，如果插入值返回true，如果没有插入返回false
	private boolean leftOrRightInsert(Node<T> node, T t) {
		if (node.getLeftVal() == null) {
			node.setLeftVal(t);
			return true;
		} else if (node.getRightVal() == null) {
			if (node.getLeftVal().compareTo(t) > 0) {
				node.setRightVal(node.getLeftVal());
				node.setLeftVal(t);
			} else {
				node.setRightVal(t);
			}
			return true;
		}
		return false;

	}

	private boolean threeisNull(Node<T> node) {
		return node.getLeft() == null && node.getRight() == null && node.getMiddle() == null;
	}

	// 中序遍历
	public List<T> print() {
		opRoot = root;
		print(opRoot);
		return list;
	}

	private void print(Node<T> opRoot) {
		if (opRoot == null) {
			return;
		}
		if (opRoot.getLeft() != null) {
			print(opRoot.getLeft());
		}
		list.add(opRoot.getLeftVal());
		if (opRoot.getRightVal() != null) {
			list.add(opRoot.getRightVal());
		}
		if (opRoot.getRight() != null) {
			print(opRoot.getRight());
		}
	}

}
