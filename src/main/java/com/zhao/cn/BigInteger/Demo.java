package com.zhao.cn.BigInteger;

import java.math.BigInteger;
import java.util.Arrays;

public class Demo {
	public static void main(String[] args) {
		BigInteger b = new BigInteger("123");
		BigInteger b1 = new BigInteger("3");
		System.out.println(b.add(b1));
		System.out.println(b.multiply(b1));
		System.out.println(b.subtract(b1));
		System.out.println(b.divide(b1));
		System.out.println(Arrays.toString(b.divideAndRemainder(b1)));
		
	}
}
