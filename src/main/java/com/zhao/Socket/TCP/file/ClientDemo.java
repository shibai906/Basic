package com.zhao.Socket.TCP.file;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;  

public class ClientDemo {
	public static void main(String[] args) throws IOException{
		//创建客户端Socket对象
		Socket s = new Socket("172.51.11.156",11000);
		
		//封装键盘录入
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
		
		String line = null;
		while((line = br.readLine())!=null){
			if("over".equals(line)){
				break;
			}
			
			bw.write(line);
			bw.newLine();
			bw.flush();
			
		}
		
		s.close();
	}
}
