package com.zhao.studyThread.Thread.ThreadLo;


public class ThreaLoder {
	 static  ThreadLocal<String> threa;

	 public void testLoder(){
		
		threa = new ThreadLocal<String>();
		System.out.println("sdf" + threa.get());
		new Thread(new Runnable() {
			@Override
			public void run() {
				threa.set("nihao");
				String s = threa.get();
				System.out.println(s);
			}
		}).start();
	}
}
