package com.zhao.nio;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class ChannelDemo {
	public static void main(String[] args) throws IOException {
		int i = 0;
		RandomAccessFile aFile = new RandomAccessFile("file.txt", "rw");
		FileChannel inchannel = aFile.getChannel();

		ByteBuffer buf = ByteBuffer.allocate(48);

		int bytesRead =inchannel.read(buf);

		while (bytesRead  != -1) {
			System.out.println("read" + bytesRead);
			buf.flip();

			while (buf.hasRemaining()) {
				System.out.print((char) buf.get() + "" + (++i));
			}
			
			buf.clear();
			bytesRead = inchannel.read(buf);
		}
		aFile.close();
	}
}
