package com.zhao.genericity;

import java.util.ArrayList;
import java.util.List;

public class Advanced {

	public static void main(String[] args) {

		// 数据和集合的比较
		/*
		 * 下面这两个都可以放任意的东西
		 * 	可以添加不同的类型
		 */
		Object[] objs = new Object[10];
		List list = new ArrayList();
		objs[0] = "nihao";
		objs[1] = 23;
		list.add("nihao");
		list.add(23);
		System.out.println(objs[0]+objs[1].toString());
		System.out.println(list.get(0).toString()+list.get(1));
	}
	
	public void fun1(){
		List<Integer> integerList = new ArrayList<>();
		print(integerList);
		List<String> stringList = new ArrayList<>();
		print1(stringList);
		
	}

	private void print1(List<? extends String> stringList) {
		
		
	}

	private void print(List<? super Integer> integerList) {
		
		
		
	}
	
	
}
