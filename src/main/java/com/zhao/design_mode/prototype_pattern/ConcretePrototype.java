package com.zhao.design_mode.prototype_pattern;

public class ConcretePrototype implements Prototype {
	
	private String attr ; // 成员属性
	
	public void setAttr(String attr){
		this.attr = attr ;
	}
	
	public String getAttr(){
		return attr ;
	}
	
	public Prototype clone() {// 克隆方法
		ConcretePrototype prototype = new ConcretePrototype();
		prototype.setAttr(this.attr);
		return prototype ;
		
	}
}
