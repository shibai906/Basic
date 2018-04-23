package com.zhao.studyThread.communication.pipe.bytes;

import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

public class TestPipe {
	
	public static void main(String[] args) throws IOException, InterruptedException {
		
		WriteData writeData = new WriteData();
		ReadData readData = new ReadData();
		
		PipedInputStream in = new PipedInputStream();
		PipedOutputStream out = new PipedOutputStream();
		out.connect(in);
		ThreadRead tr = new ThreadRead(readData,in);
		tr.start();
		Thread.sleep(2000);
		ThreadWrite tw = new ThreadWrite(writeData,out);
		tw.start();
		
		
		
		
		
		
		
	}
	
}
