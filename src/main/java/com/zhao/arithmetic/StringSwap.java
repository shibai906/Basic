package com.zhao.arithmetic;

public class StringSwap {
	// 这是一个最简单的
		public static void main(String[] args) {

			String str = "This is nowcoder";
			System.out.println(reverseString(str));
		}

		public static String reverseString(String iniString) {
			char[] c = iniString.toCharArray();
			for (int i = 0; i < c.length / 2; i++) {
				char temp = c[i];
				c[i] = c[c.length - i - 1];
				c[c.length - i - 1] = temp;
			}
			return new String(c);
		}
}
