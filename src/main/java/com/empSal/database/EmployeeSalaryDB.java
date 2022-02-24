package com.empSal.database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import com.db_connector.JdbcConnectio;

public class EmployeeSalaryDB {
	Connection con=null;
	public EmployeeSalaryDB() {
		con=JdbcConnectio.db();
	}
	PreparedStatement ps;
	ResultSet rs;
	
	public void findSecondHighest() {
	//	System.out.println("second");
		try {
			ps= con.prepareStatement("select sal from salary order by sal desc limit 1,1 ");
			
			rs=ps.executeQuery();
			//System.out.println("rs: "+rs);
			while(rs.next()) {
				int sal2=rs.getInt(1);
				System.out.println("Second highest Salary is:= "+sal2);
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	public void findFifthHighest() {
		//	System.out.println("second");
			try {
				ps= con.prepareStatement("select sal from salary order by sal desc limit 5,1 ");
				
				rs=ps.executeQuery();
				//System.out.println("rs: "+rs);
				while(rs.next()) {
					int sal2=rs.getInt(1);
					System.out.println("Fifth highest Salary is:= "+sal2);
				}
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
	
	public void descendingOrder() {
		System.out.println("Descending order of salary: ");
		try {
			ps=con.prepareStatement("select sal  from salary order by sal desc");
			rs=ps.executeQuery();
			while(rs.next()) {
				System.out.println(rs.getInt(1));
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
		
	public void showDataUsingJoins() {
		try {
			Statement st=con.createStatement();
			System.out.println("innner show");
			rs=st.executeQuery("select name , sal from emp e inner join salary d on e.id=d.id");
			while(rs.next()) {
				int eId=rs.getInt(2);
				String eName=rs.getString(1);
			//	int sId=rs.getInt("S_id");
			//	int sSal=rs.getInt("sal");
				System.out.println(eId+" name: "+eName);//" sid: "+sId+" sSal: "+sSal+" ");
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
