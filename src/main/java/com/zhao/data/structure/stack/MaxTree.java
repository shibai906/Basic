package com.zhao.data.structure.stack;

import java.util.HashMap;
import java.util.Stack;

/*
 * 这里要注意的是，数不能重复
 * 
 */
public class MaxTree {
	public static void main(String[] args) {
		Node node = new MaxTree().getMaxTree(new int[]{10,7,2,12,15,3,6,4,1});
		System.out.println(node.value);
		
		while(node.left != null || node.right != null){
			System.out.println(node.value);
			if(node.left != null)
				node = node.left ;
			if(node.right != null){
				node = node.right;
			}
		}
		while(node.right != null){
			System.out.println(node.value);
			node = node.right;
		}
		
	}
	
	public Node getMaxTree(int[] arr) {
		Node[] nArr = new Node[arr.length];
		for (int i = 0; i != arr.length; i++) {
			nArr[i] = new Node(arr[i]);
		}
		Stack<Node> stack = new Stack<Node>();
		HashMap<Node, Node> lBigMap = new HashMap<Node, Node>();
		HashMap<Node, Node> rBigMap = new HashMap<Node, Node>();
		 // 从左边取数，这里呢，取出所有的数，比左边所有小的数，存入HashMap中，
		for(int i = 0 ; i != nArr.length ; i ++){
			Node curNode = nArr[i] ;
			while((!stack.isEmpty()) && stack.peek().value < curNode.value){
				popStackSetMap(stack , lBigMap);
			}
			stack.push(curNode);
		}
		// 如何左边第一个直接小于，直接插入到集合中
		while(!stack.isEmpty()){
			popStackSetMap(stack , lBigMap);
		}
		// 从右边取数，这里呢，取出所有的数，比右边所有小的数，存入HashMap中，
		for(int i = arr.length - 1 ; i != -1 ; i-- ){
			Node curNode = nArr[i] ;
			while((!stack.isEmpty()) && stack.peek().value < arr[i]){
				popStackSetMap(stack , rBigMap);
			}
			stack.push(curNode);
		}
		// 如何右边第一个直接小于，直接插入到集合中
		while(!stack.isEmpty()){
			popStackSetMap(stack, rBigMap);
		}
		Node head = null ;
		for(int i = 0 ; i != nArr.length ; i ++){
			Node curNode = nArr[i] ;
			Node left = lBigMap.get(curNode);
			Node right = rBigMap.get(curNode);
			if(left == null && right == null){
				head = curNode ;
			// 这边看当左边没有比他大的数时，它只能看右边了，这个数就是最后的父结点
			// 父结点再判断，接下来的左右子节点了，如果左边有它就将这个放在右边了，如果左边有，它就将这个放在右边
			}else if(left == null){
				if(right.left == null){
					right.left = curNode ;
				}else{
					right.right = curNode ;
				}
			}else if(right == null){
				if(left.left == null){
					left.left = curNode ;
				}else{
					left.right = curNode ;
				}
			} else{
				// 这里是看这个数的左右两边第一个比他大的数比较大小，那个数小一点，那个就是它的父结点
				Node parent = left.value < right.value ? left : right ;
				if(parent.left == null){
					parent.left = curNode;
				} else {
					parent.right = curNode;
				}
			}
		}
		return head;
	}
	private void popStackSetMap(Stack<Node> stack, HashMap<Node, Node> BigMap) {
		Node popNode = stack.pop();
		if(stack.isEmpty()){
			BigMap.put(popNode, null);
		}else{
			BigMap.put(popNode, stack.peek());
		}
	}

}
