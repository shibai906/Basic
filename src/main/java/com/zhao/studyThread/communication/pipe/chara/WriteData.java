package com.zhao.studyThread.communication.pipe.chara;

import java.io.IOException;
import java.io.PipedWriter;

public class WriteData {
	
	public void writeMethod(PipedWriter out){
		String outData = "";
		try{
			System.out.println("写：");
			for(int i = 0 ; i < 300 ; i ++){
				outData = "" + i;
				out.write(outData);
				System.out.print(outData);
			}
			System.out.println();
			out.close();
		} catch(IOException e){
			e.printStackTrace();
		}
		
	}
	
}
