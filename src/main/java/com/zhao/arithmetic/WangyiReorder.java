package com.zhao.arithmetic;

import java.util.Arrays;
import java.util.Scanner;

public class WangyiReorder {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int num = Integer.valueOf(s);
		int[] arr = new int[num];
		int[][] ar = new int[num][];
		String[] str = new String[num];
		for(int i = 0 ; i < num ; i ++){
			String ssss = sc.nextLine();
			arr[i] = Integer.valueOf(ssss);
			ar[i] = new int[arr[i]];
			String sss = sc.nextLine();
			String[] ss = sss.split(" ");
			for(int j = 0 ; j < ss.length ; j ++){
				ar[i][j] = Integer.valueOf(ss[j]); 
			}
		}
		
		for(int i = 0 ; i < num ; i ++){
			System.out.println(Arrays.toString(ar[i]));
			str[i] = getYesOrNo(ar[i]);
		}
		for(int i = 0 ; i < num ; i ++)
			System.out.println(str[i]);
		
	}

	private static String getYesOrNo(int[] is) {
		String str = get(is);
		if("Yes".equals(str))
			return str ;
		return getYesOrNo(is , is.length - 2) ;
		
	}

	@SuppressWarnings("unused")
	private static String getYesOrNo(int[] is, int length) {
		
		if(length < 0){
			return "No" ;
		}
		String str = "No";
		for(int i = length ; i < is.length - 1 ; i++){
			int temp = is[i + 1];
			System.arraycopy(is, i - length , is, i - length + 1 , length + 1);
			is[i - length] = temp ;
			String s = get(is) ;
			if("Yes".equals(s)){
				return s ;
			}
			str = getYesOrNo(is , length - 1);
			
		}
		return str ;
	}

	private static String get(int[] is) {
		String str = "Yes";
		for(int i = 0 ; i < is.length - 1 ; i ++){
			if((is[i] * is[i+1])%4 != 0){
				str = "No" ;
			}
		}
		return str;
	}
	
}
