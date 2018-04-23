package com.zhao.data.structure.tree;

public class TestTree {
	public static void main(String[] args) {
		opreInteger();
	}
	
	public static void oprePerson(){
		Person per = new Person("赵欢",23);
		Person per2 = new Person("赵欢",24);
		Person per1 = new Person("赵欢1",23);
		
		BinarySearchTree<Person> bina = new BinarySearchTree<>();
		bina.insert(per);
		bina.insert(per1);
		bina.insert(per2);
	}
	
	public static void opreInteger(){
		
		int i = 5;
		int i1 = 3;
		int i2 = 4;
		int i3 = 2;
		int i4 = 7;
		int i5 = 1;
		int i6 = 9;
		int i7 = 8;
		
		BinarySearchTree<Integer> bina = new BinarySearchTree<>();
		bina.insert(i);
		bina.insert(i1);
		bina.insert(i2);
		bina.insert(i3);
		bina.insert(i4);
		bina.insert(i5);
		bina.insert(i6);
		bina.insert(i7);
		
		bina.toStr();
		System.out.println("height=" +bina.height());
		
	}
	
}
