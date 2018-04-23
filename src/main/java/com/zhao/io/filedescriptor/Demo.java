package com.zhao.io.filedescriptor;

import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class Demo {

	private static final String FileName = "file.txt";
	private static final String OutText = "在这我就是想试试";

	public static void main(String[] args) {
		// testWrite();

		// testRead();
		testWrite2();

	}

	private static void testRead() {

		try {
			FileOutputStream out1 = new FileOutputStream(FileName);
			// 获取文件"file"对应的“文件描述符”
			FileDescriptor fdout = out1.getFD();

			FileOutputStream out2 = new FileOutputStream(fdout);

			out1.write('A');
			out2.write('B');
			if (fdout != null) {
				System.out.printf("fdout(%s) is %s\n", fdout, fdout.valid());
			}
			out1.close();
			out2.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private static void testWrite2() {

		try {
			FileInputStream file1 = new FileInputStream(FileName);
			FileDescriptor fdout = file1.getFD();

			FileInputStream file2 = new FileInputStream(fdout);

			System.out.println((char) file1.read());
			System.out.println((char) file2.read());
			if (fdout != null)
				System.out.printf("fdin(%s) is %s\n @28d93b30", fdout, fdout.valid());

			file1.close();
			file2.close();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	private static void testWrite() {

		PrintStream out = new PrintStream(new FileOutputStream(FileDescriptor.out));
		out.print(OutText);
		out.close();
	}
}
