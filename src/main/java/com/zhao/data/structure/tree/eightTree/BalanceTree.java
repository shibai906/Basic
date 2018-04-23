package com.zhao.data.structure.tree.eightTree;

import java.util.ArrayList;
import java.util.List;

public class BalanceTree<T extends Comparable<T>> {

	private Node<T> root;
	private Node<T> opRoot;
	// 用来存放元素，准备遍历元素，放到list集合种
	private List<T> list = new ArrayList<>();
	private int size;

	public BalanceTree() {
		root = new Node<T>();
	}

	// 查找值
	public Node<T> query(T t) {
		opRoot = root;
		return query(opRoot, t);
	}

	private Node<T> query(Node<T> opRoot, T t) {
		if (opRoot == null) {
			return null;
		}
		if (opRoot.getT().compareTo(t) == 0) {
			return opRoot;
		} else if (opRoot.getT().compareTo(t) > 0) {
			return query(opRoot.getLeft(), t);
		} else {
			return query(opRoot.getRight(), t);
		}
	}

	public void insert(T t) {
		if (root.getT() == null) {
			root.setT(t);
			size++;
			return;
		}
		opRoot = root;
		Node<T> node = new Node<T>();
		node.setT(t);
		insert(opRoot, node);
		size++;
	}

	private void insert(Node<T> opRoot, Node<T> node) {

		if (opRoot.getT().compareTo(node.getT()) > 0) {
			if (opRoot.getLeft() != null) {
				insert(opRoot.getLeft(), node);
			} else {
				opRoot.setLeft(node);
				node.setParent(opRoot);
				xuanzhuanshu(node);
			}
		}
		if (opRoot.getT().compareTo(node.getT()) < 0) {
			if (opRoot.getRight() != null) {
				insert(opRoot.getRight(), node);
			} else {
				opRoot.setRight(node);
				node.setParent(opRoot);
				xuanzhuanshu(node);
			}
		}
	}

	/*
	 * 添加的时候有四种判断方式。 第一种是左左 第二种是右右 第三种是左右 第四种是右左
	 */
	private void xuanzhuanshu(Node<T> node) {
		Node<T> parent = null;
		// 判断，是否右父父(爷爷元素)
		if (node.getParent() != null && node.getParent().getParent() != null)
			parent = node.getParent().getParent();
		if (parent == null) {
			return;
		}
		// 连续左左为空，右右有元素
		if (parent.getLeft() == null && node.getParent().getLeft() == null) {
			if (parent.getParent() != null) {
				leftOrRight(parent.getParent(), node.getParent());
				node.getParent().setParent(parent.getParent());
				node.getParent().setLeft(parent);
			} else {
				node.getParent().setLeft(parent);
				root = node.getParent();
			}
			parent.setParent(node.getParent());
			parent.setRight(null);
		}
		// 连续左左有元素，右右为空
		if (parent.getRight() == null && node.getParent().getRight() == null) {
			if (parent.getParent() != null) {
				leftOrRight(parent.getParent(), node.getParent());
				node.getParent().setParent(parent.getParent());
				node.getParent().setRight(parent);
			} else {
				node.getParent().setRight(parent);
				root = node.getParent();
			}
			parent.setParent(node.getParent());
			parent.setLeft(null);
		}
		// 下面是右空，然后在左空
		if (parent.getRight() == null && node.getParent().getLeft() == null) {
			if (parent.getParent() != null) {
				leftOrRightNoOnOne(parent.getParent(), node);
				node.setParent(parent.getParent());
				node.setLeft(parent.getLeft());
				parent.getLeft().setParent(node);
				parent.getLeft().setRight(null);
				node.setRight(parent);
				parent.setParent(node);
				parent.setLeft(null);
			} else {
				root = node;
				node.setRight(parent);
				parent.setParent(node);
				parent.setLeft(null);
				node.setLeft(node.getParent());
				node.getParent().setParent(node);
				node.getParent().setRight(null);
			}
		}
		// 左空，右空
		if (parent.getLeft() == null && node.getParent().getRight() == null) {
			if (parent.getParent() != null) {
				leftOrRightNoOnOne(parent.getParent(), node);
				node.setParent(parent.getParent());
				node.setRight(parent.getRight());
				parent.getRight().setParent(node);
				parent.getRight().setLeft(null);
				node.setLeft(parent);
				parent.setParent(node);
				parent.setRight(null);
			} else {
				root = node;
				node.setLeft(parent);
				parent.setParent(node);
				parent.setRight(null);
				node.setRight(node.getParent());
				node.getParent().setParent(node);
				node.getParent().setLeft(null);
			}
		}
		root.setParent(null);
		opRoot = root ;
		leftAndRightBalance(opRoot);
		
	}
	// 这个是用来检查左右方法平衡不平衡，两边的深度差是否小于等于1，如果大于1了，根据方向旋转;
	private void leftAndRightBalance(Node<T> opRoot) {
		int left = treeDepth(opRoot.getLeft()) ;
		int right = treeDepth(opRoot.getRight()) ;
		if(left - right > 1){
			rightxuanzhuan(opRoot);
			return ;
		}
		if(right - left > 1){
			leftxuanzhuan(opRoot);
			return ;
		}
	}
	// 这里是左旋转的
	private void rightxuanzhuan(Node<T> opRoot) {
		Node<T> parent = opRoot.getParent();
		Node<T> left = opRoot.getLeft();
		Node<T> right = opRoot.getRight();
		Node<T> rightLeft = findLeft(right);
		if(rightLeft.getT().compareTo(right.getT()) == 0){
			rightLeft = null ;
		}
		newxuanzhuan(rightLeft);
		left.setParent(parent);
		if(parent != null){
			parent.setLeft(left);
		}else {
			root = left ;
			left.setParent(null);
		}
		if(rightLeft != null){
			rightLeft.setLeft(left.getLeft());
			if(left.getLeft()!=null){
				left.getLeft().setParent(rightLeft);
			}
		}else{
			opRoot.setLeft(left.getRight());
			if(left.getRight() != null){
				left.getRight().setParent(opRoot);
			}
		}
		left.setRight(opRoot);
		zaipanduan(left);
	}
	private void zaipanduan(Node<T> left) {
		if(left != null && left.getLeft() != null){
			zaipanduan(left.getLeft());
		}
		if(left !=null && left.getRight() != null){
			zaipanduan(left.getRight());
		}
		zaipanduandigui(left);
	}
	private void zaipanduandigui(Node<T> left){
		xuanzhuanshu(left);
	}
	private void leftxuanzhuan(Node<T> opRoot) {
		Node<T> parent = opRoot.getParent();
		Node<T> right = opRoot.getRight();
		Node<T> rightleft = findLeft(right);
		newxuanzhuan(rightleft);
		right.setParent(parent);
		if(parent != null){
			parent.setRight(right);
		}else{
			root = right;
		}
		if(rightleft != null){
			rightleft.setLeft(opRoot);
			opRoot.setParent(rightleft);
		}else{
			right.setLeft(opRoot);
			opRoot.setParent(right);
		}
		opRoot.setRight(null);
		zaipanduan(right);
	}
	// 为上面这两个类提供的旋转
	private void newxuanzhuan(Node<T> rightleft) {
		if(rightleft == null){
			return ;
		}
		Node<T> parent = rightleft.getParent();
		if(parent == null || parent.getRight() != null){
			return ;
		}
		rightleft.setParent(parent.getParent());
		
		if(parent.getParent().getLeft() != null && parent.getParent().getLeft().getT().compareTo(parent.getT()) == 0){
			parent.getParent().setLeft(parent.getLeft());
		}else{
			parent.getParent().setRight(parent.getLeft());
		}
		
		rightleft.setRight(parent);
		parent.setParent(rightleft);
		parent.setLeft(null);
		
	}

	// 这个用于处理，不是连续的
	private void leftOrRightNoOnOne(Node<T> parent, Node<T> son) {
		if (parent.getLeft().getT().compareTo(son.getParent().getParent().getT()) == 0) {
			parent.setLeft(son);
		} else {
			parent.setRight(son);
		}

	}
	// 处理连续的
	private void leftOrRight(Node<T> parent, Node<T> son) {
		
		if (parent.getLeft() != null && parent.getLeft().getT()
				.compareTo(son.getParent().getT()) == 0) {
			parent.setLeft(son);
		} else {
			parent.setRight(son);
		}

	}

	// 删除值
	public Node<T> delete(T t) {
		Node<T> node = query(t);
		if (node == null) {
			return null;
		}
		delete(node);
		return node;
	}

	private void delete(Node<T> node) {
		Node<T> parent = node.getParent();
		Node<T> right = node.getRight();
		Node<T> left = node.getLeft();

		if (right == null) {
			right = left;
		} else {
			Node<T> rightLeft = findLeft(right.getLeft());
			// 上面是获取到最左边元素
			xuanzhuan(rightLeft);
			if (rightLeft == null) {
				right.setLeft(left);
				if (left != null) {
					left.setParent(right);
				}
			} else {
				rightLeft.setLeft(left);
				if (left != null) {
					left.setParent(rightLeft);
				}
			}
		}
		// 这里如果是node=right，只是把node执行别的地方，并没有真的删除了
		if (parent == null) {
			root = right;
		} else {
			if (right == null) {
				leftOrRightIsNull(parent, node);
			} else {
				leftOrRightDelete(parent, right);
			}
		}
		root.setParent(null);
		// 上面程序执行完以后，其实还有一种方法没有判断，就是当删除的最上面的根，而右边只由一个元素
		// 上面全部执行完，还要处理这种，右边没有元素，左边的高度大于1。
		opRoot = root ;
		jianchaDelete(opRoot) ;
		
	}
	private void jianchaDelete(Node<T> opRoot) {
		if(opRoot == null ) {
			 return ;
		}
		if(opRoot.getRight() == null && opRoot.getLeft() != null &&
		(opRoot.getLeft().getLeft()!=null || opRoot.getLeft().getRight() != null )){
			opjianchaDeleteOp(opRoot);
			return ;
		}
		if(opRoot.getRight() != null){
			jianchaDelete(opRoot.getRight());
		}
		if(opRoot.getLeft() != null){
			jianchaDelete(opRoot.getLeft());
		}
	}

	private void opjianchaDeleteOp(Node<T> opRoot) {
		if(opRoot.getParent() == null){
			root = opRoot.getLeft();
			root.setParent(null);
		}else{
			leftOrRightDelete(opRoot.getParent() , opRoot.getLeft());
			opRoot.getLeft().setParent(opRoot.getParent());
		}
		insert(opRoot.getT());
		
	}

	// 主要旋转下面只有一个元素的，只有一个左元素的
	private void xuanzhuan(Node<T> left) {
		// 这里是判定，符合那种特点条件的就是left的父亲没有右节点
		if(left == null || left.getParent() == null ||
				left.getParent().getRight() == null || 
				left.getParent().getParent() == null){
			return ;
		}
		Node<T> parent = left.getParent();
		left.setParent(parent.getParent());
		parent.setParent(left);
		parent.setLeft(null);
		left.setRight(parent);
	}

	// 当父类元素不能空，右边没有元素，把这个元给清除了
	private void leftOrRightIsNull(Node<T> parent, Node<T> node) {
		if (parent.getLeft().getT().compareTo(node.getT()) == 0) {
			parent.setLeft(node.getLeft());
		} else {
			parent.setRight(node.getLeft());
		}
	}

	// 判断是删除父类左边还是父类右边，然后给删除了
	private void leftOrRightDelete(Node<T> parent, Node<T> right) {
		if (parent.getLeft().getT().compareTo(right.getParent().getT()) == 0) {
			parent.setLeft(right);
		} else {
			parent.setRight(right);
		}
		right.setParent(parent);
	}

	private Node<T> findLeft(Node<T> left) {
		if (left == null) {
			return null;
		}
		if (left.getLeft() == null) {
			return left;
		} else {
			return findLeft(left.getLeft());
		}
	}
	
	// 求树的深度
	public int treeDepth(){
		opRoot = root ;
		return treeDepth(opRoot);
	}
	
	private int treeDepth(Node<T> opRoot) {
		if(opRoot == null){
			return 0 ;
		}
		int left = 0 ;
		int right = 0 ;
		left = treeDepth(opRoot.getLeft());
		right = treeDepth(opRoot.getRight());
		if(left > right){
			return left + 1;
		}else {
			return right + 1;
		}
	}

	// 中序遍历，这里就不其他遍历了，其他遍历也没劲了
	public List<T> infixOrderTraverse() {
		opRoot = root;
		infixOrderTraverse(opRoot);
		return list;
	}

	// 真真添加到集合的方法
	private void infixOrderTraverse(Node<T> opRoot) {
		if (opRoot.getLeft() != null) {
			infixOrderTraverse(opRoot.getLeft());
		}
		if (opRoot != null)
			list.add(opRoot.getT());
		if (opRoot.getRight() != null) {
			infixOrderTraverse(opRoot.getRight());
		}
	}

}
