package com.zhao.cn.recursive;

public class Demo1 {
	
	public static void main(String[] args) {
		System.out.println(body(4,1,0,0));
	}
	
	public static int body(int month,int diyiyue,int dieryue,int body){
		if(month>1){
			return body(--month,body+dieryue,diyiyue,body+dieryue);
		}else{
			System.out.println(diyiyue+"--"+dieryue+"--"+body);
			return body+diyiyue+dieryue;
		}
		
	}
	
}
