package com.zhao.arithmetic;

import java.util.Scanner;

public class EvenString {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int num = getNum(str);
		System.out.println(num);
		
	}

	private static int getNum(String str) {
		int num = 0 ;
		int n = 0 ;
		char[] c = str.toCharArray();
		for(int i = 1 ; i <= c.length/2 ; i ++){
			if(new String(c,0,i).equals(new String(c,i,i))){
				n = i ;
			}
		}
		String s = new String(c,0,n);
		System.out.println(s);
		num = n;
		if(n > 0){
			for(int i = 0 ; i <= c.length - 2*n ; i += n){
				if(new String(c,i,n).equals(new String(c,i+n,n))){
					num += n;
				}
			}
		}else{
			num = str.length();
		}
		
		
		return num;
	}
	
}
