package com.zhao.arithmetic;

import java.math.BigInteger;
import java.util.Scanner;

public class Aiqiyi2 {
	public static void main(String[] args) throws InterruptedException {

		Scanner sc = new Scanner(System.in);
		int x1 = sc.nextInt();
		int k1 = sc.nextInt();
		int x2 = sc.nextInt();
		int k2 = sc.nextInt();

		BigInteger xk1 = getNum(x1, k1);
		BigInteger xk2 = getNum(x2, k2);

		if (xk1.compareTo(xk2) == 0) {
			System.out.println("Equal");
		} else if (xk1.compareTo(xk2) > 0) {
			System.out.println("Greater");
		} else {
			System.out.println("Less");
		}

	}

	private static BigInteger getNum(int x, int k) {
		BigInteger big = new BigInteger("0");
		String str = Integer.toString(x);
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < k; i++) {
			sb.append(str);
		}
		big = big.add(new BigInteger(sb.toString()));
		return big;

	}
}
