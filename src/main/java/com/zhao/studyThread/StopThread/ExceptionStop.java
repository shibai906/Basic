package com.zhao.studyThread.StopThread;

public class ExceptionStop extends Thread {

	@Override
	public void run() {
		try {
			for (int i = 0; i < 5000; i++) {
				if (this.isInterrupted()) {
					System.out.println("已经停止状态了，我要推出了");

					throw new InterruptedException("这里是线程停止了");

				}
				System.out.println("i = " + i);
				System.out.println("我在for下面，你看不見我，你看不见我");
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			System.out.println("这里正好进入这个异常了，哈哈");
			e.printStackTrace();
		}

		
	}

}
