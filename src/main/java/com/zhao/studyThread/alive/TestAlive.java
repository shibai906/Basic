package com.zhao.studyThread.alive;

public class TestAlive {
	public static void main(String[] args) {
		
		AliveThread at = new AliveThread();
		System.out.println("main begin at isAlive:" + at.isAlive());
		at.setName("A");
		at.start();
		System.out.println("main end at isAlive:" + at.isAlive());
		System.out.println("main isAlive" + Thread.currentThread().isAlive()); 
	}
}
