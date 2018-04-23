package com.zhao.nio;

import java.io.IOException;
import java.nio.CharBuffer;

public class CharBufferDemo {
	
	public static void main(String[] args) throws IOException {
		
		String str = "CharBuffer的实用方式";
		CharBuffer cha = CharBuffer.allocate(16);
		cha.clear();
		cha.put(str);
		cha.flip();
		System.out.println(str);
		
		
	}
	
}
