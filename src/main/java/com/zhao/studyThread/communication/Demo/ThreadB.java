package com.zhao.studyThread.communication.Demo;

public class ThreadB extends Thread {

	private MyList list;

	public ThreadB(MyList list) {
		this.list = list;
	}

	@Override
	public void run() {
		try {
			while (true) {
				if (list.size() == 5) {
					System.out.println("==5 了，线程B要推出去了");

					throw new InterruptedException();

				}
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
