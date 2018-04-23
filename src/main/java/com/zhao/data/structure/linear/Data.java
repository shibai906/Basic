package com.zhao.data.structure.linear;

public class Data {
	public String key;
	public String name;
	public int age;
	@Override
	public String toString() {
		return "key:" + key +",name:" + name + ",age:"+age + ";";
	}
	@Override
	public boolean equals(Object obj) {
		 Data data = (Data) obj;
		 if(this.key.equals(data.key) && this.name.equals(data.name) && this.age==data.age){
			 return true;
		 }
		 return false;
	}
	
	
}
