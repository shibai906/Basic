package com.zhao.studyThread.communication.pipe.chara;

import java.io.IOException;
import java.io.PipedReader;

public class ReadData {
	
	public void readMethod(PipedReader input){
		try{
			System.out.println("read:");
			char[] byteArray = new char[20];
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
