package com.zhao.studyThread.Thread.runnable.ticket;

public class TicketDemo extends Thread {

	private static int ticket = 100;

	@Override
	public void run() {
		while (true) {
			synchronized (this) {
				if (ticket > 0) {
					System.out.println(getName() + " " + ticket-- + "张");
				}
			}
		}

	}
}
