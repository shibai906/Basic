package com.zhao.Socket.Thread;

public class Demo {
	public static void main(String[] args) {
		SendThread st = new SendThread();
		ReciptionThread rt = new ReciptionThread();
		
		Thread t1 = new Thread(st);
		Thread t2 = new Thread(rt);
		t1.start();
		t2.start();
		
	}
}
