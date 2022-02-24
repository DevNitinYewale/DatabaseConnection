package com.empSal.database;

public class EmployeeSalaryDBMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeSalaryDB esd=new EmployeeSalaryDB();
		esd.findSecondHighest();
		esd.findFifthHighest();
		esd.descendingOrder();
		esd.showDataUsingJoins();
	}

}
