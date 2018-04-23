package com.zhao.studyThread.selectPool;

import java.sql.Connection;
import java.sql.SQLException;

public class SelectPoolTest {
	
	public static void main(String[] args) throws InterruptedException, SQLException {
		
		ConnectionPool connpool = new ConnectionPool(10);
		Connection conn = connpool.fetchConnection(0l);
		connpool.close(conn);
		System.out.println(conn);
		
	}
	
}
