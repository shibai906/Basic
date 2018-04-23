package com.zhao.cn.File.copy;

import java.io.File;

public class MirkersDemo {
	
	public static void main(String[] args) {
		File file = new File("E:\\nihao");
		System.out.println(file.mkdirs());
	}
	
}
