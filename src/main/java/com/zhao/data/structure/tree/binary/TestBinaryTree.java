package com.zhao.data.structure.tree.binary;

import java.util.List;

public class TestBinaryTree {
	
	public static void main(String[] args) {
		
		BinaryTreeImp<String> btm = new BinaryTreeImp<>();
		Node<String> no = new Node<String>();
		no.setT("根结点");
		no = btm.addTreeNode(no, "niha1", 1);
		no = btm.addTreeNode(no, "niha2", 1);
		no = btm.addTreeNode(no, "niha3", 1);
		no = btm.addTreeNode(no, "niha4", 1);
		no = btm.addTreeNode(no, "niha5", 1);
//		no = btm.addTreeNode(no, "niha6", 1);
//		no = btm.addTreeNode(no, "niha7", 1);
//		no = btm.addTreeNode(no, "niha8", 1);
		
		no = btm.treeFindNode("niha1");
		no = btm.addTreeNode(no, "niha4", 0);
		
		List<Node<String>> list = btm.infixOrderTraverse();
		for(Node<String> n : list){
			System.out.println(n.getT());
		}

		
	}
	
}
