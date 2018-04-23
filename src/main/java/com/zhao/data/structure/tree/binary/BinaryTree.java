package com.zhao.data.structure.tree.binary;

public interface BinaryTree<T> {
	
	int MAXLEN = 20;
	
	Node<T> addTreeNode(Node<T> node, T t, int num);
	
}
