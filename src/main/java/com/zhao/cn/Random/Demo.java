package com.zhao.cn.Random;

import java.util.Random;

public class Demo {
	public static void main(String[] args) {
		Random r = new Random(1111111111);
		
		for(int x = 0;x<10;x++){
			System.out.println(r.nextInt(100));
		}
	}
}
