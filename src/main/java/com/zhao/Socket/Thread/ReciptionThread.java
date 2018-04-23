package com.zhao.Socket.Thread;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class ReciptionThread implements Runnable {

	@Override
	public void run() {
		try {
			DatagramSocket ds = new DatagramSocket(12345);

			while (true) {
				byte[] bus = new byte[1024];
				DatagramPacket dp = new DatagramPacket(bus, bus.length);

				ds.receive(dp);
				byte[] bus2 = dp.getData();
				int len = dp.getLength();
				System.out.println(new String(bus2, 0, len, "gb2312"));
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
