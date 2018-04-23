package com.zhao.cn.math_demo;

public class Demo1 {
	public static void main(String[] args) {
		int i = -1;
		System.out.println(Math.abs(i)); //绝对值
		
		float f = 1.1f;
		System.out.println(Math.ceil(f)); //向上取整
		System.out.println(Math.floor(f));//向下取整
		System.out.println(Math.round(f)); //四舍五入,是+上1/2，然后向下取整
		
		int a = 2;
		int b = 5;
		System.out.println(Math.max(a, b)); //取最大值
		System.out.println(Math.min(a, b)); //取最小值
		
		//取1-100的随机数
		for(int ii = 0;ii<100;ii++){
			System.out.println((int)(Math.random()*100+1));
		}
		
		System.out.println(Math.pow(2.0, 3.0)); //2的3次方
		
		System.out.println(Math.sqrt(4)); //4的正跟
	}
}
