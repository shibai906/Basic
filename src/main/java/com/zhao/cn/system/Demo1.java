package com.zhao.cn.system;

import java.util.Arrays;

public class Demo1 {
	public static void main(String[] args) {
		
		long time = System.currentTimeMillis();
		System.out.println(time); //获取当前时间的毫秒值
		int[] i = {1,6,8,7,6};
		int[] c = {5,8,6,8,9};
		System.arraycopy(i, 1, c, 2, 3);
		System.out.println(Arrays.toString(c));
		
	}
}
