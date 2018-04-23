package com.zhao.io.printwriter;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.io.PrintWriter;

public class Demo1 {
	public static void main(String[] args) throws IOException {
		conWriter();
	}

	private static void conWriter() throws IOException{
		
		InputStream is = System.in;
		InputStreamReader isr= new InputStreamReader(is);
		BufferedReader br = new BufferedReader(isr);
		
		PrintStream ps = System.out;
		PrintWriter pw = new PrintWriter(ps);
		pw.println(br.readLine());
	}
}
