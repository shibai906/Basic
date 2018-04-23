package com.zhao.cn.set;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {
	public static void main(String[] args) {
		LinkedHashSet<String> hashSet = new LinkedHashSet<>();
		hashSet.add("lksdf");
		hashSet.add("sdfs");
		hashSet.add("abc");
		
		for(String s:hashSet){
			System.out.println(s);
		}
	}
}
