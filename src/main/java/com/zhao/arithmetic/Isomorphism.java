package com.zhao.arithmetic;

import java.util.Scanner;


public class Isomorphism {
	public static void main(String[] args) {
		
	/*	int[] arr = {2,3,4};
		int[] a = new int[arr.length];
		System.arraycopy(arr, 0, a, 0, 3);
		System.out.println(Arrays.toString(a));
		*/
		Scanner sc = new Scanner(System.in);
		String str1 = sc.nextLine();
		String[] str = str1.split(",");
		str1 = mergerSort(str[0]);
		String str2 = mergerSort(str[1]);
		if(str1.equals(str2)){
			System.out.println(true);
		}else{
			System.out.println();
		}
	}
	
	public static String mergerSort(String str){
		char[] c = str.toCharArray();
		
		mergerSort(c,0,c.length - 1);
		return new String(c);
		
	}

	private static void mergerSort(char[] c, int min, int max) {
		int mid = (min + max) / 2;
		if(min < max){
			mergerSort(c,min,mid);
			mergerSort(c,mid + 1, max ) ;
			sort(c,min,max,mid);
		}
	}

	private static void sort(char[] c, int min, int max,int mid) {
		char[] ch = new char[max-min+1];
		int x = min ;
		int y = mid + 1;
		int j = 0 ;
		while(x <= mid && y <= max){
			if(c[x] < c[y] ){
				ch[j++] = c[x++];
			}else{
				ch[j++] = c[y++];
			}
		}
		for( ; x <= mid ;){
			ch[j++] = c[x++];
		}
		for(; y<= max ; ){
			ch[j++] = c[y++];
		}
		System.arraycopy(ch, 0,c , min, max-min+1);
		
	}
	
}
