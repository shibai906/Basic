package com.zhao.JVM.JVMError;

import java.io.UnsupportedEncodingException;

public class JavaMethodAreaOOM {
	
	/*
	 * VM Args : -XX:PermSize=10M -XX:MaxPermSize=10M
	 */
	public static void main(String[] args) throws UnsupportedEncodingException {
		
		String s = "zha";
		String str = "zhao";
		String sss = s.concat("o").intern();
		String ss = (s+"o").intern();
		String ssss = new String("歡歡".getBytes(),"utf-8");
		System.out.println(ssss.length());
		String string = "string";
	}
	
}
