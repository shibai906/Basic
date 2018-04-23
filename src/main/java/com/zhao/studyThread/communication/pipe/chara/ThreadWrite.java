package com.zhao.studyThread.communication.pipe.chara;

import java.io.PipedOutputStream;
import java.io.PipedWriter;

public class ThreadWrite extends Thread {
	
	private WriteData write;
	private PipedWriter out;
	
	public ThreadWrite(WriteData write,PipedWriter out){
		this.write = write;
		this.out = out;
	}
	
	@Override
	public void run() {
		write.writeMethod(out);
	}
	
	
}
