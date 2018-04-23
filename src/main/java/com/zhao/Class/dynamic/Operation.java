package com.zhao.Class.dynamic;

public class Operation implements Imp {
	@Override
	public void add(){
		System.out.println("添加数据");
	}
	@Override
	public void delete(){
		System.out.println("删除数据");
	}
	@Override
	public void query() {
		System.out.println("查询数据");
	}
	@Override
	public void revise() {
		System.out.println("修改数据");
	}
}
