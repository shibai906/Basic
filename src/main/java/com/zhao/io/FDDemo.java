package com.zhao.io;

import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.IOException;

public class FDDemo {
	public static void main(String[] args) throws IOException {
		FileOutputStream fp = new FileOutputStream(FileDescriptor.out);
		fp.write("jkd我想草拟".getBytes());
		fp.close();
	}
}
