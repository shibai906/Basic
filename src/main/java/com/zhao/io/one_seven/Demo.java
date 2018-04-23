package com.zhao.io.one_seven;

import java.io.FileInputStream;
import java.io.InputStreamReader;

public class Demo {
	public static void main(String[] args) {
		
		try(InputStreamReader ir = new InputStreamReader(new FileInputStream("Demo1.java"));
				){
			char[] b = new char[1024];
			int len = 0;
			while((len=ir.read(b))!=-1){
				System.out.println(new String(b,0,len));
			}
			
		}catch(Exception e){
			
		}
		
	}
}
