package com.zhao.arithmetic;

import java.util.Scanner;

public class DNAFragment {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int num = getNum(str);
		System.out.println(num);
	}

	private static int getNum(String str) {
		int num = 0 ;
		int max = 0 ;
		char[] c = str.toCharArray();
		for(int i = 0 ; i < c.length ; i ++){
			if(c[i] == 'T' || c[i] == 'A' || c[i] == 'C' || c[i] == 'G'){
				num ++ ;
			}else{
				if(num > max){
					max = num ;
				}
				num = 0 ;
			}
		}
		if(num > max){
			max = num ;
		}
		
		return max ;
	}
}
