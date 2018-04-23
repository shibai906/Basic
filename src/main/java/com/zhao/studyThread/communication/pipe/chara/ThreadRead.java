package com.zhao.studyThread.communication.pipe.chara;

import java.io.PipedReader;

public class ThreadRead extends Thread {
	
	private ReadData read;
	private PipedReader input;
	
	public ThreadRead(ReadData read,PipedReader input){
		this.read = read;
		this.input = input;
	}
	
	@Override
	public void run() {
		read.readMethod(input);
		
	}
	
	
}
