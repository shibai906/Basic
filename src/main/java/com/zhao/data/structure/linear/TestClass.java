package com.zhao.data.structure.linear;

public class TestClass {
	private int num;
	private String name;
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public boolean equals(Object obj) {
		TestClass tc = (TestClass) obj;
		if(this.name.equals(tc.name) && this.num == tc.num){
			return true;
		}
		return false;
	}
	
	@Override
	public String toString() {
		return "num:" + num + ",name:"+name;
	}
	
}
