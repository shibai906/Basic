package com.zhao.studyThread.timer.cancel;

import java.util.Date;
import java.util.TimerTask;

public class MyTaskA extends TimerTask {
	
	/*
	 * 这里面的cancel()方法的作用是将自身从任务队列中进行清除。
	 * (non-Javadoc)
	 * @see java.util.TimerTask#run()
	 */
	@Override
	public void run() {
		
		System.out.println("A run timer=" + new Date());
		this.cancel();
		System.out.println("A任务已经自己移除自己，不执行了");
		
	}

}
