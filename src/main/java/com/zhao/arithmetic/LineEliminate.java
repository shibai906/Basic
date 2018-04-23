package com.zhao.arithmetic;

import java.util.Arrays;

public class LineEliminate {

	public static void main(String[] args) {
		int[][] mat = {{1,2,3},{0,1,2},{0,0,1}};
		clearZero(mat,3);
		for(int i = 0 ; i < mat.length ; i ++){
			System.out.println(Arrays.toString(mat[i]));
		}
	}

	public static int[][] clearZero(int[][] mat, int n) {
		// write code here
		int[] hang = new int[n]; 
		int[] lie = new int[n];
		for(int i = 0 ; i < mat.length ; i ++){
			for(int j = 0 ; j < mat.length ; j ++){
				if(mat[i][j] == 0){
					hang[i] = 1;
					lie[j] = 1;
				}
			}
		}
		for(int i = 0 ; i < n ; i ++){
			if(hang[i] == 1){
				for(int j = 0 ; j < n ; j ++){
					mat[i][j] = 0 ;
				}
			}
			if(lie[i] == 1){
				for(int j = 0 ; j < n ; j ++){
					mat[j][i] = 0 ;
				}
			}
			
		}
		
		return mat;
	}

}
