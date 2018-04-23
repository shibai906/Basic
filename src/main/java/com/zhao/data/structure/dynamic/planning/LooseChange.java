package com.zhao.data.structure.dynamic.planning;

public class LooseChange {
	
	public static void main(String[] args) {
		
		int[] penny = {1,3,5};
		System.out.println(countWays(penny , 15 )) ;
	}
	
	public static int countWays(int[] penny, int aim) {
		int cent = 0 ;
		int[] arr = new int[aim + 1] ;
		arr[0] = 0 ;
		for(int i = 1 ; i < arr.length ; i ++ ){
			arr[i] = i ;
			for(int j = 0 ; j < i ; j ++){
				cent = arr[j] ;
				for(int z = 0 ; z < penny.length ; z ++){
					if(j + penny[z] == i && arr[i] > cent + 1){
						arr[i] = cent + 1 ;
					}
				}
			}
			
		}
		
		return arr[aim] ;
	}

}
