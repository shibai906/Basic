package com.zhao.studyThread.studentThread;

public class MyRunnableProduction implements Runnable {
	private int num;
	private Student s;
	public MyRunnableProduction(Student s) {
		this.s = s;
	}
	@Override
	public void run() {
		while(true){
			if(num%2==0){
				s.set("小贾", 22);
			}else{
				s.set("赵欢", 23);
			}
			num ++;
		}
	}

}
