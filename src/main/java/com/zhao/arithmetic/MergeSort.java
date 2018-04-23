package com.zhao.arithmetic;

import java.util.Arrays;

public class MergeSort {
	
	public static void main(String[] args) {
		int[] arr = {3,6,8,5,9,2,1,7};
		mergeSrot(arr,0,arr.length - 1);
		System.out.println(Arrays.toString(arr));
		
	}

	private static void mergeSrot(int[] arr, int min, int max) {
		
		if(min >= max){
			return ;
		}
		int mid = (min + max) / 2;
		mergeSrot(arr,min , mid);
		mergeSrot(arr,mid + 1, max);
		mergeSort(arr,min , max , mid);
	
	}

	private static void mergeSort(int[] arr, int min, int max, int mid) {
	
		int[] temp = new int[ max - min +1];
		int i = min ;
		int j = mid + 1;
		int ji = 0 ;
		while(i <= mid && j <= max){
			if(arr[i] < arr[j]){
				temp[ji ++] = arr[i ++] ; 
			}else{
				temp[ji ++ ] = arr[ j ++];
			}
		}
		for(; i <= mid ; i ++){
			temp[ji ++] = arr[i++];
		}
		for(; j <= max ; j ++){
			temp[ji ++] = arr[j ++];
		}
		System.arraycopy(temp, 0, arr, min, max - min +1 );
		
	}

	
}
