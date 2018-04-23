package com.zhao.io;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;

// 这里面必须是Buffered类，mark和reset才起作用，也要注意，mark是否标记了没有
public class InputMarkReset implements Serializable {
	
	public static void main(String[] args) throws IOException {
		
		BufferedInputStream input = new BufferedInputStream(new FileInputStream("file.txt"));
		
		if(!input.markSupported()){
			System.out.println("不支持");
			return ;
		}
		int i = 0 ;
		while( (i = input.read()) != -1){
			if(i == '4'){
				input.mark(i);
			}
			System.out.print((char)i + ",");
		}
		input.reset();
		while( (i = input.read()) != -1){
			if(i == '4'){
				input.mark(i);
			}
			System.out.print((char)i + ",");
		}
		
	}
	
}
