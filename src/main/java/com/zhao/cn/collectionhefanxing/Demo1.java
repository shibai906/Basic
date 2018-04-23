package com.zhao.cn.collectionhefanxing;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Vector;

public class Demo1 {
	public static void main(String[] args) {
		ArrayListDemo();
		VecoterDemo();
		LinkedListDemo();
	}
	
	public static void ArrayListDemo(){
		ArrayList<String> array = new ArrayList<>();
		array.add("赵欢");
		array.add("张即可");
		array.add(1, "贾凯迪");
		array.add(2, "孙丹");
		Iterator<String> iterator = array.iterator();
		while(iterator.hasNext()){
			System.out.println(iterator.next());
		}
		
		System.out.println("-----------------");
		for(int i = 0;i<array.size();i++){
			String s = array.get(i);
			System.out.println(s);
		}
		System.out.println("------------------");
		for(String s:array){
			System.out.println(s);
		}
		System.out.println("------------------");
		
	}
	
	public static void VecoterDemo(){
		Vector<String> vector = new Vector<>();
		vector.addElement("贾凯迪");
		vector.addElement("孙丹");
		vector.addElement("小贾");
		vector.addElement("凯迪");
		Enumeration<String> enume = vector.elements();
		
		while(enume.hasMoreElements()){
			System.out.println(enume.nextElement());
		}
		
	}
	
	public static void LinkedListDemo(){
		LinkedList<String> link = new LinkedList<>();
		link.add("String");
		link.add("Integer");
		link.add("me");
		
		Iterator<String> iterator = link.iterator();
		while(iterator.hasNext()){
			System.out.println(iterator.next());
		}
		
		System.out.println("-----------------");
		for(int i = 0;i<link.size();i++){
			String s = link.get(i);
			System.out.println(s);
		}
		System.out.println("------------------");
		for(String s:link){
			System.out.println(s);
		}
		System.out.println("------------------");
	}
	
}
