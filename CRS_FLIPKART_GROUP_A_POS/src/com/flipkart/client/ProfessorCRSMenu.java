package com.flipkart.client;

import java.util.Scanner;

public class ProfessorCRSMenu {
	Scanner sc=new Scanner(System.in);

	public void createMenu(String profId) {
		int input;
		System.out.println("Professor Menu");
		int i =1;
		while(i < 5) {
			input=sc.nextInt();
			switch(input)
			{
				case 1:
					//view all the courses taught by the professor
					
					break;
				case 2:
					//view all the enrolled students for the course
					
					break;
					
				case 3:
					//add grade for a student
					
					break;
				case 4:
					//logout from the system
					
					return;
				default:
					System.out.println("Incorrect option");
			}
		}
		i++;
	}
	

}
