package com.zhao.studyThread.studentThread;

public class Student {
	private String name;
	private int age;
	private boolean flag;

	public synchronized void set(String name, int age) {
		if (flag) {
			try {
				this.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		this.age = age;
		this.name = name;
		flag = true;
		this.notify();
	}

	public synchronized void get() {
		if (!flag) {
			try {
				this.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("姓名:" + this.name + "---" + "年龄:" + this.age);
		flag = false;
		this.notify();
	}
}
