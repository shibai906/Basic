package com.zhao.data.structure.tree.eightTree;

import java.util.List;

public class TestEightTree {
	
	public static void main(String[] args) {
		TestRBTree();
	}

	private static void TestRBTree() {
		RBTree<Integer> rb = new RBTree<Integer>();
		rb.insert(5);
		rb.insert(4);
		rb.insert(7);
		rb.insert(9);
		
		List<Integer> list = rb.infixOrderTraverse();
		for(Integer in : list){
			System.out.print(in + " , ");
		}
	}

	private static void TestBinTree() {
		Bintree<Integer> bt = new Bintree<>();
		bt.insert(10);
		bt.insert(4);
		bt.insert(15);
		bt.insert(8);
		bt.insert(7);
		bt.insert(9);
		bt.insert(3);
		bt.insert(12);
		bt.delete(9);
		List<Integer> list = bt.infixOrderTraverse();
		System.out.print("[");
		for(int num : list){
			System.out.print(num + ",");
		}
		System.out.println("]");
	
	}
	
	private static void TestBalanceTree(){
		BalanceTree<Integer> bt = new BalanceTree<>();
		bt.insert(6);
		bt.insert(1);
		bt.insert(15);
		bt.insert(12);
		bt.insert(16);
		bt.insert(8);
		bt.insert(13);
		List<Integer> list = bt.infixOrderTraverse();
		for(int i : list){
			System.out.print(i+",");
		}
	}
	
	
	
	
}
