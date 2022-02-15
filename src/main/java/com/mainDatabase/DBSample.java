package com.mainDatabase;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.db_connector.JdbcConnectio;

public class DBSample {
	Connection con;
	public DBSample() {
		con=JdbcConnectio.db();
	}
	void insert(int id, String name, String designation, int salary) throws SQLException {
		try {
			PreparedStatement ps=con.prepareStatement("insert into employee1 (id,name,designation,salary)"+"values(?,?,?,?)");
			ps.setInt(1, id);
			ps.setString(2, name);
			ps.setString(3, designation);
			ps.setInt(4, salary);
			
			int i=ps.executeUpdate();
			System.out.println(i+" record inserted successfully...! ");
			
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		con.close();
	}
}







/*
String query="select * from employee1";
Statement stnt=con.createStatement();
//stnt.execute(query);
ResultSet rs=stnt.executeQuery(query);
System.out.println("ID   Name    Designation    Salary");
while(rs.next()) {
	int id1=rs.getInt(1);
	String nam=rs.getString(2);
	String desg=rs.getString(3);
	int sal=rs.getInt(4);
	//System.out.println("ID: "+id1+" Name: "+nam+" designation: "+ desg+" Salary: "+ sal);
	System.out.printf("%-5d%-10s%-15s%-10d\n",id1,nam,desg,sal);
}*/