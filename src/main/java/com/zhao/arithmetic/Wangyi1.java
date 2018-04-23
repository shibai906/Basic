package com.zhao.arithmetic;

import java.util.Scanner;

public class Wangyi1 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		int z = fanzhuan(i);
		System.out.println(i + z);
		
	}

	private static int fanzhuan(int i) {
		
		String str = String.valueOf(i);
		char[] c = str.toCharArray();
		int num = c.length ;
		for(int j = 0 ; j < num / 2 ; j ++){
			char temp = c[j] ;
			c[j] = c[num - j - 1];
			c[num - j - 1] = temp ;
		}
		
		return Integer.valueOf(new String(c));
		
	}
	
}
