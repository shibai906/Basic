package com.zhao.studyThread.UnsafetyThread;

public class LoginServlet {

	private static String usernameRef;
	private static String passwordRef;

	public static void post(String username, String password) {
		usernameRef = username;
		try {
			if ("a".equals(username)) {
				Thread.sleep(20);
			}
			passwordRef = password;
			System.out.println("username:"+username + ",password:" + password);
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
