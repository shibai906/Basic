package com.zhao.arithmetic;

import java.util.Arrays;

public class PixelOverturn {

	public static void main(String[] args) {
		int[][] mat = {{1,2,3},{4,5,6},{7,8,9}};
		int n = mat.length;
		transformImage( mat , n );
		for(int i = 0 ; i < mat.length ; i ++){
			System.out.println(Arrays.toString(mat[i]));
		}
	}
	public static int[][] transformImage(int[][] mat, int n) {
		// write code here
		for(int i = 0 ; i < mat.length ; i ++){
			for(int j = 0 ; j < i ; j ++ ){
				n = mat[i][j] ;
				mat[i][j] = mat[j][i];
				mat[j][i] = n;
			}
		}
		for(int i = 0 ; i < mat.length ; i ++){
			for(int j = 0 ; j < mat.length/2 ; j ++){
				n = mat[i][j] ;
				mat[i][j] = mat[i][mat.length - 1 - j ] ;
				mat[i][mat.length - 1 - j ] = n;
			}
		}
		return mat ;
	}
}
