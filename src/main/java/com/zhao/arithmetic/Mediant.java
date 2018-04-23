package com.zhao.arithmetic;

import java.util.Scanner;

public class Mediant {

public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int[] arr1 = new int[num1];
		for(int i = 0;i < num1;i++){
			arr1[i] = sc.nextInt();
		}
		int num2 = sc.nextInt();
		int[] arr2 = new int[num2];
		for(int i = 0;i < num2;i++){
			arr2[i] = sc.nextInt();
		}
		int[] me = merge(arr1,arr2);
		float ave = 0.0f;
		if(me.length % 2 == 0){
			ave = (float)(me[me.length/2] + me[me.length/2 - 1])/2;
		}else{
			ave = me[(me.length-1)/2];
		}
		System.out.println(ave);
	}

	private static int[] merge(int[] arr1, int[] arr2) {
		
		int maxarr1 = arr1[arr1.length-1];
		int minarr1 = arr1[0];
		
		int maxarr2 = arr2[arr2.length-1];
		int minarr2 = arr2[0];
		
		if(minarr1 <= minarr2 && maxarr1 >= maxarr2){
			return arr1;
		}else if(minarr1 >= minarr2 && maxarr1 <= maxarr2){
			return arr2;
		}else if(minarr1 > maxarr2){
			int[] newarr = new int[arr1.length+arr2.length];
			System.arraycopy(arr2, 0, newarr, 0, arr2.length);
			System.arraycopy(arr1, 0, newarr, arr2.length, arr1.length);
			return newarr;
			
		}else if(maxarr1 < minarr2){
			int[] newarr = new int[arr1.length+arr2.length];
			System.arraycopy(arr1, 0, newarr, 0, arr1.length);
			System.arraycopy(arr2, 0, newarr, arr1.length, arr2.length);
			return newarr;
		}else if(minarr1 <= minarr2 && maxarr1 <= maxarr2){
			int cha = maxarr2 - maxarr1;
			int[] newarr = new int[arr1.length + cha];
			System.arraycopy(arr1, 0, newarr, 0, arr1.length);
			System.arraycopy(arr2, arr2.length-cha, newarr, arr1.length, cha);
			return newarr;
		}else{
			int cha = maxarr1 - maxarr2;
			int[] newarr = new int[arr2.length + cha];
			System.arraycopy(arr2, 0, newarr, 0, arr2.length);
			System.arraycopy(arr1, arr1.length-cha, newarr, arr2.length, cha);
			return newarr;
		}	
	}
}
