package com.zhao.cn.collectionhefanxing;

import java.awt.Component;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Dictionary;
import java.util.Hashtable;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Genericity<T> {
	
	public T[] elements;
	
	@SuppressWarnings("unchecked")
	public Genericity(){
		elements = (T[]) new Object[10];
	}
	
	private  Dictionary<Integer, Component> lableTable = new Hashtable<>();
	
	public Dictionary<Integer, Component> getLableTable() {
		return lableTable;
	}
	public  void setLableTable(Dictionary<Integer, Component> lableTable) {
		this.lableTable = lableTable;
	}
	public static void main(String[] args) {
		
//		System.out.println(fond(new Enti()));
//		add();
//		testArr();
		
		Pair<String> p = Pair.makePair(String::new);
		p.setFirst("你好");
		System.out.println(p.getFirst());
		Pair<String> p1 = Pair.makePair(String.class);
		p.setFirst("你好");
		System.out.println(p1.getFirst());
		
//		Pair<String>[] pair = arr(new Pair<String>(),new Pair<String>());
//		pair[0] = new Pair<String>();
//		pair[0].setFirst("会不会报错");
//		System.out.println(pair[0].getFirst());
//		System.out.println(pair[0].toString());
	
	}
	/*
	 * 泛型中不能有8种基本类型
	 * 因为8种基本类型不是Object的子类
	 */
	public static void add(){
//		int[] i = new int[10];
//		Integer[] ii = new Integer[10];
//		List<Integer> list ;
	// 也可以这样使用泛型，但是这里是不推荐的。
		// List<String>[] lists = new ArrayList<String>[10];
		// 上面那样是错误的
		List<String>[] lists = (List<String>[]) new ArrayList<?>[10];
		// 调用方法会出现异常，NullPointerExcetpion
		lists[1].add("nihao");
	}
	
	public static <T> void addTest(Pair<T> pair, T ...ts){
		
	}
	
	
	public static void testArr(){
		// 首先这样定义是不可以的
		// Pair<String>[] table = new Pair<String>[10];
		// 可以这样定义
		Pair<String>[] table = (Pair<String>[]) new Pair<?>[10];
		table[0].setFirst("nihk");
	}
	
	public static <E> E[] arr(E ...array){
		return array;	
	}
 
	// 这样是可以的 
	public static <T> List<T> addll(List<T> list, T...ts){
		
		for(T t:ts){
			list.add(t);
		}
		return list;
		
	}
	
	public void testDict(){
		Dictionary<Integer, Component> lable = new Hashtable<>();
		lableTable.put(9, new JLabel(new ImageIcon("nine.gif")));
		Genericity<String> gene = new Genericity<String>();
		gene.setLableTable(lable);
		Dictionary<Integer, Component> tst = gene.getLableTable();
		
		
	}
	

	
	/*
	 * 这里的&代表交集，需要继承这两个类的子类,要么是两个接口，
	 * 如果一个实体类，一个接口，实体类必须在前面，不能是两个实体类
	 * 
	 */
	public static <T extends ExtendsDem2 & ExtendsDem1> T fond(T t){
		return t;
	}
	
}
