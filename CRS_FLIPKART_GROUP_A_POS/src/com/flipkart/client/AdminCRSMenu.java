package com.flipkart.client;

import java.util.Scanner;

public class AdminCRSMenu {
	Scanner scanner = new Scanner(System.in);
	public void createMenu() {
		
		System.out.println("Admin Menu");
		int i = 1;
		System.out.println("Type 1 to view Course Catalogue");
		System.out.println("     2 to add Course");
		System.out.println("     3 to delete course");
		System.out.println("     4 to approve student");
		System.out.println("     5 to view pending admissions");
		System.out.println("     6 to add professor");
		System.out.println("     7 to assign Course to professor");
		while(i < 5) {
			int choice = scanner.nextInt();
			
			switch(choice) {
			case 1:
				viewCoursesInCatalogue();
				break;
				
			case 2:
				addCourseToCatalogue();
				break;
				
			case 3:
				deleteCourse();
				break;
				
			case 4:
				approveStudent();
				break;
			
			case 5:
				viewPendingAdmissions();
				break;
			case 6:
				addProfessor();
				break;
			
			case 7:
				assignCourseToProfessor();
				break;
			
			case 8:
				
				return;

			default:
				System.out.println("Incorrect option");
			}
			i++;
			
		}
	}
	private void assignCourseToProfessor() {
		// TODO Auto-generated method stub
		
	}
	private void addProfessor() {
		// TODO Auto-generated method stub
		
	}
	
	private void viewPendingAdmissions() {
		// TODO Auto-generated method stub
		
	}
	private void approveStudent() {
		// TODO Auto-generated method stub
		
	}
	private void deleteCourse() {
		// TODO Auto-generated method stub
		
	}
	private void addCourseToCatalogue() {
		// TODO Auto-generated method stub
		
	}
	private void viewCoursesInCatalogue() {
		// TODO Auto-generated method stub
		
	}
	
}
	
