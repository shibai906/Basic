package com.zhao.cn.Exception;

import java.util.Scanner;

public class Demo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入分数");
		int x = sc.nextInt();
		try {
			System.out.println(MyScore.score(x));
		} catch (MyScoreException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
