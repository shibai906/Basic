package com.zhao.arithmetic;


import java.util.Scanner;

/*
    动态规划的特征:
        1、求一个问题的最优解
        2、大问题可以分解为子问题，自问题还有重叠的更小的子问题
        3、整体问题最优解取决于自问题的最优解(状态转移方程)
        4、从上往下分析问题，从下往上解决问题
        5、讨论底层边界问题
 */
public class RopeQuestion {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in) ;
        int n = scanner.nextInt();
        int num = jianshenzi(n) ;

        System.out.println(num);

    }

    private static int jianshenzi(int n) {
        if (n < 2) {
            return 0;
        }
        if (n == 2)
            return 1;       // 长度为2，只能剪成1*1
        if (n == 3)
            return 2 ;      // 长度为3，剪成2*1 > 1*1*1

        // 现在做的是，求这几个里面的最大数，分割绳子
        int shenzi[] = new int[n+1] ;
        shenzi[0] = 0;
        shenzi[1] = 1;
        shenzi[2] = 2;
        shenzi[3] = 3;

        for (int i = 4 ; i < shenzi.length ; i ++) {
            shenzi[i] = i ;
            for(int j = 0 ; j < i ; j ++){
                if(shenzi[j]*(i-j) > shenzi[i]) {
                    shenzi[i] = shenzi[j]*(i-j);
                }
            }

        }
        return shenzi[n] ;

    }


}
