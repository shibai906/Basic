package com.zhao.arithmetic;

import java.util.Scanner;

public class DelRepet {
	
public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String s = delRepet(str);
		System.out.println(s);
	}

	private static String delRepet(String str) {
		
		char[] ch = str.toCharArray();
		StringBuilder sb = new StringBuilder();
		sb.append(ch[0]);
		boolean flag = false;
		for(int i = 1; i < ch.length;i++){
			for(int y = 0; y<i;y++){
				if(ch[i] == ch[y]){
					flag = true;
					break;
				}
			}
			if(!flag){
				sb.append(ch[i]);
			}
			if(flag){
				flag = false;
			}
		}
		return sb.toString();
		
	}
	
	
}
