package com.zhao.io.copy.files;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo {
	public static void main(String[] args) throws IOException {

		String startFile = "D:\\423955.jpg";
		String endFile = "E:\\love.jpg";

		method1(startFile, endFile);
//		method2(startFile, endFile);
//		method3(startFile, endFile);
//		method4(startFile, endFile);
	}

	private static void method4(String startFile, String endFile) throws IOException {

		FileInputStream is = new FileInputStream(startFile);
		FileOutputStream fs = new FileOutputStream(endFile);
		
		int ch = 0;
		while((ch=is.read())!=-1){
			fs.write(ch);
		}
		
		is.close();
		fs.close();

	}

	private static void method3(String startFile, String endFile) throws IOException  {
		
		FileInputStream is = new FileInputStream(startFile);
		FileOutputStream fs = new FileOutputStream(endFile);
		byte[] c = new byte[1024];
		int ch = 0;
		while((ch=is.read(c))!=-1){
			fs.write(c,0,ch);
		}
		
		is.close();
		fs.close();
	}

	private static void method2(String startFile, String endFile)  throws IOException {
		
		BufferedInputStream bs = new BufferedInputStream(new FileInputStream(startFile));
		BufferedOutputStream bo = new BufferedOutputStream(new FileOutputStream(endFile));
		
		int ch = 0;
		while((ch=bs.read())!=-1){
			bo.write(ch);
		}
		
		bs.close();
		bo.close();
	}

	private static void method1(String startFile, String endFile) throws IOException  {
		
		BufferedInputStream bs = new BufferedInputStream(new FileInputStream(startFile));
		BufferedOutputStream bo = new BufferedOutputStream(new FileOutputStream(endFile));
		
		int ch = 0;
		byte[] b = new byte[1024];
		while((ch=bs.read(b))!=-1){
			bo.write(b,0,ch);
		}
		
		bs.close();
		bo.close();
		
	}
}
