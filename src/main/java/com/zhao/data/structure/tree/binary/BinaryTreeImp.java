package com.zhao.data.structure.tree.binary;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreeImp<T> implements BinaryTree<T> {
	
	private Node<T> root = null;
	public int deep = 0;
	public boolean flag = true;
	private List<Node<T>> list = new ArrayList<>();
	
	public BinaryTreeImp(){
	}
	
	public BinaryTreeImp(Node<T> root){
		this.root = root; // 自己设置值，初始化Node
		root.setLeftNode(null);
		root.setRightNode(null);
		root.setPersionNode(null);
		flag = false;
	}
	
	// 对这个结点进行元素添加，每次必须要返回元素，
	// 如果不把获取的元素添加进行，可能会出现在本元素下面添加
	// num有两个值，0，1， 0代表添加在左边，1代表添加在右边
	@Override
	public Node<T> addTreeNode(Node<T> node, T t ,int num){
		if(node == null){
			System.err.println("添加的元素不能为空");
			return null;
		}
		if(num != 0 && num != 1){
			System.err.println("无效数字，请注意，0添加在左边，1添加在右边");
			return node;
		}
		if(flag){
			root = node;
			flag = false;
		}
		
		Node<T> nw = new Node<T>();
		nw.setT(t);
		// 这里进行判断，看添加左子树还是添加右子树
		switch(num){
		case 0:
			if(node.getLeftNode() == null){
				node.setLeftNode(nw);
			}else{
				node = node.getLeftNode();
				while(node.getLeftNode() != null){
					node = node.getLeftNode();
				}
				node.setLeftNode(nw);
			};
			break;
		case 1:
			if(node.getRightNode() == null){
				node.setRightNode(nw);
			}else{
				node = node.getRightNode();
				while(node.getRightNode() != null){
					node = node.getRightNode();
				}
				node.setRightNode(nw);
			};
			break;
		}
		return nw;
	}
	
	// 判断树是否为空
	public boolean treeIsEmpty(Node<T> node){
		if(node == null){
			return true;
		}
		return false;
		
	}
	// 找数据
	public Node<T> treeFindNode(T t){
		
		if(t == null){
			return null;
		}
		Node<T> node = root;
		return treeFindeNode(node,t);
	}
	private Node<T> treeFindeNode(Node<T> node, T t) {
		if(t.equals(node.getT())){
			return node;
		}else{
			if(node.getLeftNode()!= null){
				return treeFindeNode(node.getLeftNode(), t);
			}
			if(node.getRightNode()!=null){
				return treeFindeNode(node.getRightNode(), t);
			}
		}
		return null;
	}
	
	// 往左结点加入数据
	public Node<T> getLeftNode(Node<T> node){
		if(!treeIsEmpty(node)){
			if(node.getLeftNode() != null){
				return node.getLeftNode();
			}
		}
		return null;
	}
	
	public Node<T> getRightNode(Node<T> node){
		if(!treeIsEmpty(node)){
			if(node.getRightNode() != null){
				return node.getRightNode();
			}
		}
		return null;
	}
	
	public int treeDepth(){
		return treeDepth(root);
	}
	
	// 求树的深度
	private int treeDepth(Node<T> node) {
		int left = 0 , right = 0 ;
		if(node == null){
			return 0 ;
		}
		left = treeDepth(node.getLeftNode());
		right = treeDepth(node.getRightNode()) ;
		if(left > right){
			return left + 1 ;
		}else {
			return right + 1;
		}
	}
	public void clearType(){
		root = null;
		flag = true;
	}
	
	
	
	/*
	 * 前序遍历：按照“根左右”，先遍历根节点，再遍历左子树，再遍历右子树
	 * 中序遍历：按照“左根右”
	 * 后序遍历：按照“左右根”
	 */
	// 后序`遍历：按照
	public List<Node<T>> epilogueTraverse(){
		
		epilogueTraverse(root);
		
		return list ;
	}
	
	private void epilogueTraverse(Node<T> root) {
		if(root.getLeftNode()!=null){
			epilogueTraverse(root.getLeftNode());
		}
		if(root.getRightNode()!=null){
			epilogueTraverse(root.getRightNode());
		}
		list.add(root);
	}

	// 前序，根左右
	public List<Node<T>> preOrderTraverse(){
		if(!list.isEmpty()){
			list.clear();
		}
		preOrderTraverse(root);
		return this.list;
	}
	private void preOrderTraverse(Node<T> root) {
		
		list.add(root);
		if(root.getLeftNode()!= null){
			preOrderTraverse(root.getLeftNode());
		}
		if(root.getRightNode() != null){
			preOrderTraverse(root.getRightNode());
		}
	}

	// 这里是中序遍历
	public List<Node<T>> infixOrderTraverse(){
		
		indfixOrderTraverse(root);
		return this.list;
	}
	// 中序 ， 左根右
	private void indfixOrderTraverse(Node<T> root) {
		
		if(root.getLeftNode()!= null){
			indfixOrderTraverse(root.getLeftNode());
		}
		list.add(root);
		if(root.getRightNode()!= null){
			indfixOrderTraverse(root.getRightNode());
		}
		
	}
	
}
