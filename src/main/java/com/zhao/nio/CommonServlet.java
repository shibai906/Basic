package com.zhao.nio;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketAddress;
import java.nio.ByteBuffer;

public class CommonServlet {
	public static void main(String[] args) {
		ServerSocket ss = null;
		InputStream in = null;
		try {
			ss = new ServerSocket(1111);
			int recv = 0;
			byte[] b = new byte[1024];
			while(true){
				Socket soc = ss.accept();
				SocketAddress address = soc.getRemoteSocketAddress();
				System.out.println("Handling client at" + soc);
				in = soc.getInputStream();
				while((recv = in.read(b))!=-1){
					System.out.print(new String(b,0,recv));
				}
				System.out.println();
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
