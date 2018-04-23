package com.zhao.studyThread.communication.pipe.chara;

import java.io.IOException;
import java.io.PipedReader;
import java.io.PipedWriter;

public class TestPipe {
	
	public static void main(String[] args) throws IOException, InterruptedException {
		
		WriteData writeData = new WriteData();
		ReadData readData = new ReadData();
		
		PipedReader in = new PipedReader();
		PipedWriter out = new PipedWriter();
		out.connect(in);
		ThreadRead tr = new ThreadRead(readData,in);
		tr.start();
		Thread.sleep(2000);
		ThreadWrite tw = new ThreadWrite(writeData,out);
		tw.start();
		
		
		
		
		
		
		
	}
	
}
