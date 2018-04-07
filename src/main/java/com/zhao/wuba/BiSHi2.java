package com.zhao.wuba;

import java.util.Scanner;

public class BiSHi2 {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in) ;
        int max = getMax(new int[]{1,2,3,-4,5} );
        System.out.println(max);
    }

    private static int getMax(int[] ints) {
        int max = 0 ;
        int total = 0 ;
        for(int i = 0 ; i < ints.length ; i ++){
            total = total + ints[i] ;
            if(max < total){
                max = total ;
            }
        }
        return max ;

    }
}
