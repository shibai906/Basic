package com.zhao.design_mode.BuilderPattern;

/**
 * 建造这设计模型，主要是创建对象。
 * 	这个对象有很多功能组成，每个功能不可缺少，但每个功能必须有。
 * 	
 * 
 *@comments
 *@author 失败906
 *@date 2017年12月12日
 *@version 1.0
 */
public class Actor {
	
	private String type ; // 角色类型
	private String sex ; // 性别
	private String face ; // 脸型
	private String costume ; // 服装
	private String hairStyle ; // 发型
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getFace() {
		return face;
	}
	public void setFace(String face) {
		this.face = face;
	}
	public String getCostume() {
		return costume;
	}
	public void setCostume(String costume) {
		this.costume = costume;
	}
	public String getHairStyle() {
		return hairStyle;
	}
	public void setHairStyle(String hairStyle) {
		this.hairStyle = hairStyle;
	}
	
	
}
