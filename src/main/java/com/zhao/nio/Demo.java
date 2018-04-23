package com.zhao.nio;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;

public class Demo {
	public static void main(String[] args) throws IOException {

		Charset charset = Charset.forName("utf-8");
		CharsetDecoder decoder = charset.newDecoder();

		RandomAccessFile ra = new RandomAccessFile("file.txt", "rw");
		FileChannel fc = ra.getChannel();
		ByteBuffer bb = ByteBuffer.allocate(1024);
		CharBuffer charBuffer = CharBuffer.allocate(1024);

		int num = 0;
		num = fc.read(bb);
		while (num != -1) {
			
			bb.flip();//切换到读模式
			decoder.decode(bb, charBuffer, false);
			charBuffer.flip(); //切换到读模式
			while (charBuffer.hasRemaining()) {
				char c = (char) charBuffer.get(); //读取数据时只能用CharBuffer
				System.out.print(c);
			}
			System.out.println();
			charBuffer.clear();
			bb.clear();
			num = fc.read(bb);
		}
		ra.close();
	}
}
