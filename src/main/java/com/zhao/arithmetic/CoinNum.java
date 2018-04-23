package com.zhao.arithmetic;

import java.util.Scanner;

/*
    硬币最少问题，类似于之前剪绳子问题
 */
public class CoinNum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in) ;
        int moneyNum = scanner.nextInt() ;
        int num = getCoinNum(moneyNum) ;
        System.out.println(num);
    }

    private static int getCoinNum(int moneyNum) {

        if(moneyNum < 1)
            return 0 ;

        if(moneyNum == 1) {
            return 1 ;
        }
        if (moneyNum == 2)
            return 2 ;
        if (moneyNum == 3)
            return 1 ;
        if (moneyNum == 4)
            return 2 ;
        if (moneyNum == 5)
            return 1 ;
        int[] nums = new int[moneyNum+1] ;
        nums[0] = 0 ;
        nums[1] = 1 ;
        nums[2] = 2 ;
        nums[3] = 1 ;
        nums[4] = 2 ;
        nums[5] = 1 ;

        for(int i = 6 ; i < nums.length ; i ++) {
            nums[i] = i ;
            for(int j = i - 5 ; j < i ; j ++ ) {
                if((j + 1) == i) {
                    if(nums[j] + 1 < nums[i]) {
                        nums[i] = nums[j] + 1;
                    }
                }
                if((j + 2) == i){
                    if (nums[j] + 2 < nums[i]) {
                        nums[i] = nums[j] + 2;
                    }
                }
                if((j + 3) == i){
                    if(nums[j] + 1 < nums[i]) {
                        nums[i] = nums[j] + 1;
                    }
                }
                if ((j + 4) == i) {
                    if(nums[j] + 2 < nums[i]) {
                        nums[i] = nums[j] + 2;
                    }
                }
                if ((j + 5) == i) {
                    if(nums[j] + 1 < nums[i]) {
                        nums[i] = nums[j] + 1;
                    }
                }
            }
        }

        return nums[moneyNum] ;

    }

}
