package com.zhao.cn.StringBuffer;

public class Demo1 {
	public static void main(String[] args) {
		//添加功能
		StringBuffer sb = new StringBuffer();
		sb.append("赵欢");//添加到后面
		sb.insert(1, "你好"); //通常是再第几个后面添加
		System.out.println(sb.toString());
		
		/*//删除功能
		sb.delete(0, 1); //通常删除一个区间
		sb.deleteCharAt(1); //删除一个位置
		
		System.out.println(sb.toString());*/
		
		//反转功能
		sb.reverse();
		System.out.println(sb);
		
		//替换功能
		sb.replace(0, 1, "j门子");
		
		String s = sb.substring(2);
	}
}
