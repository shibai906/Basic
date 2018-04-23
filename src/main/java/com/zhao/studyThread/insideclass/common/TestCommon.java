package com.zhao.studyThread.insideclass.common;


public class TestCommon {
	
	public static void main(String[] args) {
		
		PublicClass pub = new PublicClass();
		pub.setUsername("username");
		pub.setPassword("password");
		System.out.println("publicClass:" + pub.getPassword() + "  " + pub.getUsername());
		// 注意了，普通的方法要用父类方法名.new 实体类
		PublicClass.PrivateClass pri = pub.new PrivateClass();
		pri.setAddress("qishan");
		pri.setAge("20");
		System.out.println("privateClass:" + pri.getAddress() + "  " + pri.getAge());
		
		
		
	}
	
}
