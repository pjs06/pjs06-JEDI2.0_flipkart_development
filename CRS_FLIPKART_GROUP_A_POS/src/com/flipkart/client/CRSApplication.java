package com.flipkart.client;

import java.util.Scanner;

import com.flipkart.business.StudentOperations;

public class CRSApplication {
	
		public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		CRSApplication crsApplication=new CRSApplication();
		int userInput;	
		//create the main menu
		createMainMenu();
		
		
		userInput=sc.nextInt();
		
		while(userInput!=4)
		{
			switch(userInput)
			{	
				case 1:
					//login
					crsApplication.loginUser();
					break;
				case 2:
					//student registration
					crsApplication.registerStudent();
					break;	
				case 3:
					crsApplication.updatePassword();
					break;
				default:
					System.out.println("Invalid Input");
			}
			createMainMenu();
			userInput=sc.nextInt();
		}
		
		
	}

	private void updatePassword() {
		// TODO Auto-generated method stub
		
		
	}

	public void registerStudent()
	{
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter student's name: ");
        String name = sc.nextLine();

        System.out.print("Enter student's user ID: ");
        String userID = sc.nextLine();

        System.out.print("Enter student's password: ");
        String password = sc.nextLine();

        // System.out.print("Enter student's batch: ");
        // int batch = Integer.valueOf(sc.nextLine());
       

        System.out.print("Enter student's branch: ");
        String branch = sc.nextLine();

        System.out.print("Enter student's address: ");
        String address = sc.nextLine();

        System.out.print("Enter student's country: ");
        String country = sc.nextLine();
        
        
        StudentOperations studentOperations = new StudentOperations();
		studentOperations.addStudent(name, userID, password, 123, branch, address, country);
        System.out.println("Student added successfully.");
	
		
	}
	

	public void loginUser() {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);

		String userId,password,userRole;
		
		System.out.println("Email:");
		userId=sc.next();
		System.out.println("Password:");
		password=sc.next();
		System.out.println("UserRole:");	
		System.out.println("Type A for Admin");
		System.out.println("     P for Professor");
		System.out.println("     S for Student");
		userRole=sc.next();
		switch(userRole)
		{
		case "A":
            System.out.println("Login Successful");
			AdminCRSMenu adminMenu=new AdminCRSMenu();
			adminMenu.createMenu();
			break;
		case "P":
			System.out.println("Login Successful");
			ProfessorCRSMenu professorMenu=new ProfessorCRSMenu();
			professorMenu.createMenu(userId);
			
			break;
		case "S":
			
			System.out.println("Login Successful");
			StudentCRSMenu studentMenu=new StudentCRSMenu();
			studentMenu.createMenu(userId);
			break;
		}
	}

	private static void createMainMenu() {
		// TODO Auto-generated method stub
		System.out.println("Welcome to CRS Application");
		System.out.println("Press 1:- Login");
		System.out.println("Press 2:- Registration of the student");
		System.out.println("Press 3:- Update password");
		System.out.println("Press 4:- exit");
		
	}
}
