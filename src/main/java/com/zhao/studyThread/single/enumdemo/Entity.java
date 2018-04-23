package com.zhao.studyThread.single.enumdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Entity {
	
	private Entity(){
		
	}
	
	public enum EnumSingleton {

		connectionFactiory;
		private Connection connection;

		private EnumSingleton() {

			System.out.println("调用了Entity的构造");
			try {

				Class.forName("com.mysql.jdbc.Driver");
				connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/ssm", "root", "123456");

			} catch (SQLException | ClassNotFoundException e) {
				e.printStackTrace();
			}

		}

		public Connection getConnection() {
			return connection;
		}
	}
	
	public static Connection getConnection(){
		return EnumSingleton.connectionFactiory.getConnection();
	}
	
}
