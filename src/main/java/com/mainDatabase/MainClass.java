package com.mainDatabase;

import java.sql.SQLException;

public class MainClass {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		DBSample db=new DBSample();
		db.insert(111,"Satish","marketing",12500);
	}

}
