package com.zhao.Socket.criculation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class Send {
	public static void main(String[] args) throws IOException{
		
		DatagramSocket ds = new DatagramSocket();
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in,"gb2312"));
		String line = null;
		while(true){
			line = br.readLine();
			if("886".equals(line)){
				break;
			}
			
			DatagramPacket dp = new DatagramPacket(line.getBytes(), line.length(),InetAddress.getByName("192.168.1.112"), 12345);
			ds.send(dp);
			
		}
		br.close();
		ds.close();
	}
}
