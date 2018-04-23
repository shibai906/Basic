package com.zhao.cn.StringConstantPool;
public class StringStudy {
	public static void main(String[] args) {
		String str = "ni";
		String st = new String("ni").intern();
		System.out.println(str == st);
	}
}
