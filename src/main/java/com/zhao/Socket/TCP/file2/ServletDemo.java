package com.zhao.Socket.TCP.file2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class ServletDemo {
	public static void main(String[] args) throws IOException{
		
		ServerSocket ss = new ServerSocket(3985);
		
		Socket s = ss.accept();
		
		BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
		
		String line = null;
		while((line = br.readLine())!=null){
			System.out.println(line);
		}
		ss.close();
		s.close();
		
		
	}
}
