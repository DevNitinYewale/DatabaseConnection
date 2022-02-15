package com.mainDatabase;

import java.util.Scanner;

public class Student_Registration_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Student_Registration str=new Student_Registration();
		
		
		boolean flag=true;
		
		while(flag==true) {
			
			System.out.println(" 1. Register\n 2.Login \n 3. ChangePassword \n 4. De-activate \n 5. Exit");
			System.out.println("Enter your choice: ");
			int n=sc.nextInt();
			switch (n) {
			case 1:
					System.out.print("enter your id: ");
					int id=sc.nextInt();
					System.out.print("enter name: ");
					String name=sc.next();
					System.out.print("enter user name: ");
					String uname=sc.next();
					System.out.print("enter email: ");
					String email=sc.next();
					System.out.print("enter pass: ");
					String pass=sc.next();
					System.out.print("enter dob: ");
					String dob=sc.next();
					System.out.print("enter contact: ");
					String contact=sc.next();
					str.registration(id, name, uname, email, pass, dob, contact);
					break;
			case 2:
					str.login("nitin", "nitin12345");
					break;
			case 3:
					str.changePass(101);
					break;
			case 4:
					str.de_Activate(101);
					break;
			case 5:
				 flag=false;
			default:
				break;
			}
		}
	}

}
