package com.mainDatabase;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

import com.db_connector.JdbcConnectio;

public class Student_Registration {
	Connection con=null;
	
	public Student_Registration() {
		con=JdbcConnectio.db();
	}
	PreparedStatement ps=null;
	Statement stmt=null;
	ResultSet rs=null;
	Scanner sc=new Scanner(System.in);
	
	/*1.
	 * Registration
	 * 
	 * */
	
	public void registration(int id, String name, String  user, String email, String pass, String dob, String contact) {
		try {
			ps=con.prepareStatement("insert into Registration (id, name, user, email, pass, dob, contact)"+"values(?,?,?,?,?,?,?)");
			ps.setInt(1, id);
			ps.setString(2, name);
			ps.setString(3, user);
			ps.setString(4, email);
			ps.setString(5, pass);
			ps.setString(6, dob);
			ps.setString(7, contact);
			
			int i=ps.executeUpdate();
			
			System.out.println(i+ "record inserted successfully...!");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	/*2
	 * Login
	 * */
	public void login(String userName, String password) {
		try {
			ps=con.prepareStatement("select * from Registration where user=? and pass=?");
			ps.setString(1,userName);
			ps.setString(2, password);
			
			rs=ps.executeQuery();
			
			while(rs.next()) {
				String user=rs.getString(3);
				String pass=rs.getString(5);
				System.out.println("Login Successfully...!");
				break;
			}
				System.out.println("Please enter currect user name and pass");
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	/*3
	 * Change Password:
	 * */
	
	public void changePass(int id) {
		int id2=0;
		try {
			ps=con.prepareStatement("select * from Registration where id=?");
			ps.setInt(1,id);
			rs=ps.executeQuery();
			while(rs.next()) {
				id2=rs.getInt(1);
				//System.out.println("Id2: "+id2);
			}
			if(id2==id) {
				System.out.print("Enter New User Name: ");
				String newUser=sc.next();
				System.out.print("Enter New Password: ");
				String newPass=sc.next();
				
				//ps=con.prepareStatement("update Registration set user='"+newUser+"'"+", pass='"+newPass+"'"+ "where id='"+id+"'");
				ps=con.prepareStatement("update Registration set user=? , pass=? where id=?");
				ps.setString(1, newUser);
				ps.setString(2, newPass);
				ps.setInt(3, id2);
				int p=ps.executeUpdate();
				System.out.println("Updated successfully...! "+p);
			}
			else {
				System.out.print("Your User id is wrong try agian: ");
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	/*4.
	 * Deactivate Account
	 * */
	
	public void de_Activate(int id) {
		try {
			ps=con.prepareStatement("delete from Registration where id=?");
			ps.setInt(1, id);
			int a=ps.executeUpdate();
			if(a>0)
				System.out.println(a+"your account is de-activated successfully...!");
			else
				System.out.println("your account is not deactivated \nenter correct user Id");
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
	}
}
