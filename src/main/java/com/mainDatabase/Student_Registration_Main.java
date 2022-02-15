package com.mainDatabase;

import java.util.Scanner;

public class Student_Registration_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Student_Registration str=new Student_Registration();
		
		
		boolean flag=true;
		int n1=15;
		System.out.print("n1  "+n1);
		while(flag==true) {
			
			System.out.println(" 1. Register\n 2.Login \n 3. ChangePassword \n 4. De-activate \n 5. Exit");
			System.out.println("Enter your choice: ");
			int n=sc.nextInt();
			switch (n) {
			case 1:
					System.out.print("enter your id: ");
					int id=sc.nextInt();
					
					System.out.print("enter your name: ");
					String name=sc.next();
					
					System.out.print("enter your user name and remember it in future: ");
					String uname=sc.next();
					
					System.out.print("enter your password and remember it in future: ");
					String pass=sc.next();
					
					System.out.print("enter your email_Id: ");
					String email=sc.next();
					
					System.out.print("enter your dob DD-MM-YYYY: ");
					String dob=sc.next();
					
					System.out.print("enter your contact nimber: ");
					String contact=sc.next();
					
					str.registration(id, name, uname, email, pass, dob, contact);
					break;
			case 2:
					System.out.print("Enter user Name: ");
					String user=sc.next();
					System.out.print("Enter Password: ");
					String pass2=sc.next();
					str.login(user, pass2);
					break;
			case 3:
				System.out.print("Enter your ID: ");
				int id2=sc.nextInt();
					str.changePass(id2);
					break;
			case 4:
				System.out.print("Enter your ID: ");
				int id3=sc.nextInt();
					str.de_Activate(id3);
					break;
			case 5:
				 flag=false;
			default:
				System.out.println("Enter valid choice 1-5");
				break;
			}
		}
	}

}
