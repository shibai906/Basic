package com.zhao.arithmetic;

import java.util.Scanner;

public class Aiqiyi1 {

	public static void main(String[] args) throws InterruptedException {
		
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int max = getMax(str);
		System.out.println(max);
	}

	private static int getMax(String str) {
		int max = 0 ;
		int num = 0 ;
		char[] c = str.toCharArray();
		for(int i = 0 ; i < c.length ; i++){
			if(c[i] == '('){
				num ++ ;
			}else{
				if(num > max){
					max = num ;
				}
				num -- ;
			}
		}
		
		return max;
	}
	
}
