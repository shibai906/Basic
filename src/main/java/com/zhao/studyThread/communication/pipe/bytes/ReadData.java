package com.zhao.studyThread.communication.pipe.bytes;

import java.io.IOException;
import java.io.PipedInputStream;

public class ReadData {
	
	public void readMethod(PipedInputStream input){
		try{
			System.out.println("read:");
			byte[] byteArray = new byte[20];
			int readLenth = input.read(byteArray);
			while(readLenth != -1){
				String newData = new String(byteArray,0,readLenth);
				System.out.print(newData);
				readLenth = input.read(byteArray);
			}
			System.out.println();
			input.close();
			
		}catch (IOException e){
			e.printStackTrace();
		}
	}
	
}
