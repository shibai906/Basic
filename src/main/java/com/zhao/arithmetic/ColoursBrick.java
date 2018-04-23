package com.zhao.arithmetic;

import java.util.Scanner;

public class ColoursBrick {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		str = str.toUpperCase();
		int num = getNum(str);
		System.out.println(num);
		
	}

	private static int getNum(String str) {
		int num = 0 ;
		char[] c = str.toCharArray();
		for(int i = 0 ; i < c.length - 1 ; i ++){
			if(c[i] == c[i + 1]){
				num ++ ;
				i ++ ;
			}
		}
		return num;
	}
	
}
