package com.zhao.arithmetic;

import java.util.Scanner;

public class Mi3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		str = str.trim();
		String[] strings = str.split(" ");
		strings = overTurn(strings);
		for(int i = 0 ; i < strings.length - 1 ; i ++){
			System.out.print(strings[i] + " ");
		}
		System.out.println(strings[strings.length - 1]);
	}

	private static String[] overTurn(String[] strings) {
		for(int i = 0 ; i < strings.length / 2 ; i ++){
			String temp = strings[i] ;
			strings[i] = strings[strings.length - i - 1 ];
			strings[strings.length - i - 1] = temp ;
		}
		return strings;
	}
}
