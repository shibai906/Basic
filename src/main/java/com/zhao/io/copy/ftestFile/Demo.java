package com.zhao.io.copy.ftestFile;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Demo {
	public static void main(String[] args) throws IOException {
		String startFile = "D:\\test.txt";
		String endFile = "E:\\迪.txt";

		 method1(startFile,endFile);
		// method2(startFile,endFile);
		// method3(startFile, endFile);
		// method4(startFile, endFile);
		// method5(startFile, endFile);
	}

	private static void method5(String startFile, String endFile) throws IOException {
		FileReader fr = new FileReader(startFile);
		FileWriter fw = new FileWriter(endFile); // 源文件必须是UTF-8

		int ch = 0;
		while ((ch = fr.read()) != -1) {
			fw.write(ch);
		}
		fr.close();
		fw.close();
	}

	private static void method4(String startFile, String endFile) throws IOException {
		FileReader fr = new FileReader(startFile);
		FileWriter fw = new FileWriter(endFile); // 源文件必须是UTF-8

		char[] ch = new char[1024];
		int h = 0;
		while ((h = fr.read(ch)) != -1) {
			fw.write(ch);
		}
		fr.close();
		fw.close();

	}

	private static void method3(String startFile, String endFile) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader(startFile));
		BufferedWriter bw = new BufferedWriter(new FileWriter(endFile));
		int ch = 0;
		while ((ch = br.read()) != -1) {
			bw.write(ch);
		}
		br.close();
		bw.close();
	}

	private static void method2(String startFile, String endFile) throws IOException {

		BufferedReader br = new BufferedReader(new FileReader(startFile));
		BufferedWriter bw = new BufferedWriter(new FileWriter(endFile));
		char[] ch = new char[1024];
		int h = 0;
		while ((h = br.read(ch)) != -1) {
			bw.write(ch);
		}
		br.close();
		bw.close();

	}

	private static void method1(String startFile, String endFile)  throws IOException{
		
		BufferedReader br = new BufferedReader(new FileReader(startFile));
		BufferedWriter bw = new BufferedWriter(new FileWriter(endFile));
		String arc = null;
		
		while((arc=br.readLine())!=null){
			bw.write(arc);
			bw.newLine();
			bw.flush();
		}
		br.close();
		bw.close();
		
	}
}
