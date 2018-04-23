package com.zhao.studyThread.threadRandom;

import java.util.ArrayList;
import java.util.List;

public class Entity {
	
	private List<String> list = new ArrayList<>();
	
	synchronized public void aad(String username) {
		
		System.out.println("ThreadName=" + Thread.currentThread().getName()
				+ " 执行了add方法");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		list.add(username);
		
		System.out.println("ThreadName=" + Thread.currentThread().getName()
				+ "退出了add方法");
		
	}
	
	synchronized public int getSize(){
		System.out.println("ThreadName=" + Thread.currentThread().getName()
				+ " 执行了getSize方法");
		int sizeValue = list.size();
		System.out.println("ThreadName=" + Thread.currentThread().getName()
				+ "推出了getSize方法" + "   " + sizeValue);
		
		return sizeValue;
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
