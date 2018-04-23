package com.zhao.data.structure.tree.eightTree;

import java.util.ArrayList;
import java.util.List;

public class Bintree<T extends Comparable<T>> {
	// 主要用来保存节点
	private Node<T> root ;
	// 用来操作节点的
	private Node<T> opRoot ;
	// 用来存放元素，准备遍历元素，放到list集合种
	private List<T> list = new ArrayList<>();
	// 初始化头节点
	public Bintree (){
		root = new Node<T>();
	}
	// 插入元素
	public void insert(T t){
		if(opRoot == null){
			root.setT(t);
			opRoot = root;
			return ;
		}
		opRoot = root ;
		Node<T> node = new Node<T>();
		node.setT(t);
		insert(opRoot , node) ;
	}
	// 插入值
	private void insert(Node<T> opRoot, Node<T> node) {
		if(opRoot.getT().compareTo(node.getT()) > 0){
			if(opRoot.getLeft() != null){
				insert(opRoot.getLeft() , node ) ;
			}else {
				opRoot.setLeft(node);
				node.setParent(opRoot);
			}
		}
		if(opRoot.getT().compareTo(node.getT()) < 0){
			if(opRoot.getRight() != null){
				insert(opRoot.getRight() , node) ;
			}else {
				opRoot.setRight(node);
				node.setParent(opRoot);
			}
		}
	}
	// 查找值
	public Node<T> query(T t) {
		opRoot = root ;
		return query(opRoot , t) ;
	}
	private Node<T> query(Node<T> opRoot, T t) {
		if(opRoot == null){
			return null;
		}
		if(opRoot.getT().compareTo(t) == 0 ){
			return opRoot ;
		}else if(opRoot.getT().compareTo(t) > 0 ) {
			return query(opRoot.getLeft(),t);
		}else{
			return query(opRoot.getRight() , t);
		}
	}
	
	// 删除值
	public Node<T> delete(T t){
		Node<T> node = query(t);
		if(node == null ){
			return null ;
		}
		delete(node);
		return node ;
	}
	private void delete(Node<T> node) {
		Node<T> parent = node.getParent() ;
		Node<T> right = node.getRight() ;
		Node<T> left = node.getLeft() ;
		
		if(right == null ){
			right = left ;
		} else {
			Node<T> rightLeft = findLeft(right.getLeft());
			if(rightLeft == null ){
				right.setLeft(left);
				if(left != null){
					left.setParent(right);
				}
			}else{
				rightLeft.setLeft(left);
				if(left != null ) {
					left.setParent(rightLeft);
				}
			}
		}
		// 这里如果是node=right，只是把node执行别的地方，并没有真的删除了
		if(parent == null) {
			root = right ;
		}else {
			if ( right == null ) {
				leftOrRightIsNull(parent , node) ;
			}else {
				leftOrRightDelte(parent , right ) ;
			}
		}
	}
	// 当父类元素不能空，右边没有元素，把这个元给清除了
	private void leftOrRightIsNull(Node<T> parent, Node<T> node) {
		if(parent.getLeft().getT().compareTo(node.getT()) == 0){
			parent.setLeft(node.getLeft());
		}else{
			parent.setRight(node.getLeft());
		}
	}
	// 判断是删除父类左边还是父类右边，然后给删除了
	private void leftOrRightDelte(Node<T> parent, Node<T> right) {
		if(parent.getLeft().getT().compareTo(right.getParent().getT()) == 0){
			parent.setLeft(right);
		}else{
			parent.setRight(right);
		}
		right.setParent(parent);
	}
	private Node<T> findLeft(Node<T> left) {
		if(left == null ) {
			return null;
		}
		if(left.getLeft() == null){
			return left ;
		}else{
			return findLeft(left.getLeft());
		}
	}
	
	// 中序遍历，这里就不其他遍历了，其他遍历也没劲了
	public List<T> infixOrderTraverse(){
		opRoot = root ;
		infixOrderTraverse(opRoot);
		return list;
	}
	// 真真添加到集合的方法
	private void infixOrderTraverse(Node<T> opRoot) {
		if(opRoot.getLeft()!=null){
			infixOrderTraverse(opRoot.getLeft());
		}
		list.add(opRoot.getT());
		if(opRoot.getRight()!=null){
			infixOrderTraverse(opRoot.getRight());
		}
	}
	
}
