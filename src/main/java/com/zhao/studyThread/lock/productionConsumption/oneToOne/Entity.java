package com.zhao.studyThread.lock.productionConsumption.oneToOne;

public class Entity {
	
	private String name = "";
	private String password = "";
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	@Override
	public String toString() {
		return "name:" + name + ",password:" + password;
	}
	
}
