package com.zhao.Socket.criculation;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class Reciption {
	public static void main(String[] args)throws IOException {
		DatagramSocket ds = new DatagramSocket(12345);
		
		while(true){
			byte[] bus = new byte[1024];
			DatagramPacket dp = new DatagramPacket(bus, bus.length);
			
			ds.receive(dp);
			byte[] bus2 = dp.getData();
			int len = dp.getLength();
			System.out.println(new String(bus2,0,len,"gb2312"));
		}
		
		
	}
}
