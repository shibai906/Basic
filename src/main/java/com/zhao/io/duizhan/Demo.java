package com.zhao.io.duizhan;


import java.util.Stack;

public class Demo {
	public static void main(String[] args) {

		long start = System.currentTimeMillis();

		Stack<String> s = new Stack<>();
		s.push("nihao");
		s.push("nitameoi");
		while (!s.empty()) {
			System.out.println(s.pop());
		}

		long end = System.currentTimeMillis();
		long e = start - end;
		System.out.println(start);
		System.out.println(end);
		System.out.println(e);

		/*
		 * Throwable t = new Throwable(); StringWriter out = new StringWriter();
		 * t.printStackTrace(new PrintWriter(out)); String description =
		 * out.toString(); System.out.println(description);
		 */

		// Throwable t = new Throwable();
		// StackTraceElement[] frames = t.getStackTrace();
		// for(StackTraceElement s : frames){
		// System.out.println(s);
		// }

		// factorial(5);

	}

	private static int factorial(int n) {
		System.out.println("factorial(" + n + ")");
		Throwable t = new Throwable();
		StackTraceElement[] s = t.getStackTrace();
		for (StackTraceElement f : s) {
			System.out.println(f);
		}
		int r = 0;
		if (n <= 1)
			r = 1;
		else
			r = n * factorial(n - 1);
		System.out.println("return" + r);

		return r;

	}

}
