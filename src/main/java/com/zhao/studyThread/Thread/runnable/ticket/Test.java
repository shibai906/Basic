package com.zhao.studyThread.Thread.runnable.ticket;

public class Test {
	public static void main(String[] args) {
		
		TicketDemo t1 = new TicketDemo();
		t1.setName("凯迪拉萨");
		TicketDemo t2 = new TicketDemo();
		t2.setName("vkhr");
		
		t1.start();
		t2.start();
		
	}
}
