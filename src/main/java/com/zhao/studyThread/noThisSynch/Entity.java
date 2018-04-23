package com.zhao.studyThread.noThisSynch;

public class Entity {

	private String usernameParam;
	private String passwordParm;
	private String anyString = new String();
	private String passwordParam;

	public void set(String username, String password) {
		try {
			synchronized (anyString) {
				System.out.println(
						"线程的名称为" + Thread.currentThread().getName() + "在" + System.currentTimeMillis() + "进入同步块");

				passwordParam = password;
				Thread.sleep(3000);
				usernameParam = username;
				System.out.println(
						"线程名称为：" + Thread.currentThread().getName() + "，在" + System.currentTimeMillis() + "时离开的");
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
