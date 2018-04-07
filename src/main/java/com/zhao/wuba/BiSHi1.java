package com.zhao.wuba;

import java.util.Scanner;

public class BiSHi1 {

    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in) ;

        String string = scanner.nextLine() ;
        int num = scanner.nextInt();

        String[] strings = getNum(string,num);
        for(int i = 0 ; i < strings.length ; i ++){
            System.out.println(strings[i]);
        }

    }
    public static String[] getNum(String string,int num){

        char[] chars = string.toCharArray();
        char[] jishu = new char[chars.length] ;
        int [] nums = new int[chars.length] ;
        int geshuji = 1 ;
        int total = 0 ;
        for(int i = 1 ; i < chars.length + 1 ; i ++ ){
            if( i != chars.length  && chars[i] == chars[i - 1]){
                geshuji ++ ;
            }else {
                if(num == geshuji){
                    jishu[total] = chars[i - 1] ;
                    nums[total*2] = i - num  ;
                    nums[total*2 + 1] = i - 1;
                    total ++ ;
                }
                geshuji = 1;
            }
        }
        String[] strings = new String[total];
        for(int i = 0 , j = 0 ; i < total ; i ++ ){
            strings[i] = "(" + nums[j++] + "," + nums[j++] + "," ;
            for(int z = 0 ; z < num ; z ++){
                strings[i] = strings[i] + jishu[i] ;
            }
            strings[i] = strings[i] + ")" ;
        }
        return strings ;

    }
}
