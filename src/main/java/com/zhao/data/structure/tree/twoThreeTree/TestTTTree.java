package com.zhao.data.structure.tree.twoThreeTree;

import java.util.Arrays;


public class TestTTTree {
	
	public static void main(String[] args) {
		
		TTTree<Integer> ttt = new TTTree<>();
		ttt.insert(1);
		ttt.insert(3);
		ttt.insert(8);
		ttt.insert(9);
		ttt.insert(11);
		ttt.insert(12);
		ttt.insert(13);
		ttt.insert(14);
		ttt.insert(15);
		ttt.insert(116);
		
		System.out.println(Arrays.toString(ttt.print().toArray()));
	}
	
}
