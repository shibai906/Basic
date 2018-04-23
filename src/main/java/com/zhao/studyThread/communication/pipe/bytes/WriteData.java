package com.zhao.studyThread.communication.pipe.bytes;

import java.io.IOException;
import java.io.PipedOutputStream;

public class WriteData {
	
	public void writeMethod(PipedOutputStream out){
		String outData = "";
		try{
			System.out.println("写：");
			for(int i = 0 ; i < 300 ; i ++){
				outData = "" + i;
				out.write(outData.getBytes());
				System.out.print(outData);
			}
			System.out.println();
			out.close();
		} catch(IOException e){
			e.printStackTrace();
		}
		
	}
	
}
