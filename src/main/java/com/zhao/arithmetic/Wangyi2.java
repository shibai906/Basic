package com.zhao.arithmetic;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Wangyi2 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		float f = getAve(str);
		DecimalFormat decimalFormat=new DecimalFormat(".00");
		String st = decimalFormat.format(f);
		System.out.println(st);
	}

	private static float getAve(String str) {
		char[] c = str.toCharArray();
		int[] num = new int[c.length];
		int n = 0;
		
		int j = 1 ;
		for(int i = 0 ; i < c.length - 1 ; i ++){
			if(c[i] == c[i + 1]){
				j ++ ;
			}else{
				num[n ++] = j ;
				j = 1;
			}
		}
		num[n ++] = j;
		int tal = 0 ;
		for(int i = 0 ; i < n ; i ++){
			tal = num[i] + tal;
		}
		
		return ((float)tal ) / n;
	}
	
}
