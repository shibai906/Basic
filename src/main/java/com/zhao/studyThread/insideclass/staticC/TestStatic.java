package com.zhao.studyThread.insideclass.staticC;

public class TestStatic {
	
	public static void main(String[] args) {
		
		PublicClass pub = new PublicClass();
		pub.setUsername("username");
		pub.setPassword("password");
		System.out.println("publicClass:" + pub.getPassword() + "  " + pub.getUsername());
		// 静态的内部类只需要直接new就可以
		PublicClass.PrivateClass pri = new PublicClass.PrivateClass();
		pri.setAddress("qishan");
		pri.setAge("20");
		System.out.println("privateClass:" + pri.getAddress() + "  " + pri.getAge());
		
		
		
	}
	
}
