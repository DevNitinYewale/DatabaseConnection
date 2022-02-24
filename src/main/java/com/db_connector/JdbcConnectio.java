package com.db_connector;

import java.sql.Connection;
import java.sql.DriverManager;
/*
public class JdbcConnectio {
		static Connection con=null;
		public static Connection db() {
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				con=DriverManager.getConnection("jdbc:mysql://localhost:3307/my_db","root","root");
				System.out.println("connection successful.!");
			} catch (Exception e) {
				System.out.println(e);
				// TODO: handle exception
			}
			return con;
		}
}
*/
public class JdbcConnectio {
	static Connection con=null;
	public static Connection db() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3307/nitin","root","root");
			System.out.println("connection successful.!");
		} catch (Exception e) {
			System.out.println(e);
			// TODO: handle exception
		}
		return con;
	}
}