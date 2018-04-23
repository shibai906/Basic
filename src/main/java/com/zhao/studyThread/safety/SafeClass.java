package com.zhao.studyThread.safety;

public class SafeClass {
	private int num = 0;
	
	synchronized public void add( String name,String user) {

		try {
			if ("zhao".equals(name)) {
				num = 100;
				System.out.println(name + ": set over !" + user);
				Thread.sleep(200);
			} else {
				num = 200;
				System.out.println(name + ": set over !" + user);
			}
			System.out.println("num:" + num + ",name:" + name);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
