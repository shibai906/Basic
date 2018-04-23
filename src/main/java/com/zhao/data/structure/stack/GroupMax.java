package com.zhao.data.structure.stack;

import java.util.Arrays;
import java.util.LinkedList;


public class GroupMax {
	
	public static void main(String[] args) {
		System.out.println(Arrays.toString(getMaxWidow(new int[]{5,7,3,5,9,1,3,5} , 6)));
		
	}
	
	@SuppressWarnings("null")
	public static int[] getMaxWidow(int[] arr , int w){
		if(arr == null && arr.length < w){
			return null;
		}
		LinkedList<Integer> lkl = new LinkedList<>();
		int [] ref = new int[arr.length - w + 1] ;
		int index = 0 ;
		for(int i = 0 ; i < arr.length ; i ++){
			while(!lkl.isEmpty() && arr[lkl.peekLast()] <= arr[i]){
				lkl.pollLast();
			}
			lkl.addLast(i);
			if(lkl.peekFirst() == i - w){
				lkl.pollFirst();
			}
			if(i >= w - 1){
				ref[index ++] = arr[lkl.peekFirst()];
			}
		}
		return ref;
	}
	
}
