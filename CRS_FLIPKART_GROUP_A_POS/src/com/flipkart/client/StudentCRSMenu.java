package com.flipkart.client;



import java.util.*;
import java.util.Scanner;
import com.flipkart.bean.Course;
import com.flipkart.bean.PaymentNotification;
import com.flipkart.bean.StudentGrade;




public class StudentCRSMenu {
	
	
	Scanner sc = new Scanner(System.in);
//	RegistrationInterface registrationInterface = RegistrationOperation.getInstance();
//	ProfessorInterface professorInterface = ProfessorOperation.getInstance();
//	NotificationInterface notificationInterface=NotificationOperation.getInstance();
//	private boolean is_registered;
	
	public void create_menu(int studentId)
	{

		is_registered = getRegistrationStatus(studentId);
		while (CRSApplication.loggedin) 
		{
			int choice = sc.nextInt();

		switch (choice) {
			case 1: 
					registerCourses(studentId);
					break;
					
			case 2: 
					addCourse(studentId);
					break;

			case 3:
					
					dropCourse(studentId);
					break;

			case 4:
					viewCourse(studentId);
					break;

			case 5:
					viewRegisteredCourse(studentId);
					break;

			case 6:
					viewGradeCard(studentId);
					break;
					
			case 7:
					make_payment(studentId);
					break;
					
			case 8: 
					CRSApplication.loggedin = false;
					return;
					
			default:
					logger.warn("***** Wrong Choice *****");
		}
	}
}
	private void registerCourses(int studentId)
	{
	}
	
	private void addCourse(int studentId)	
	{
	}
	
	
	private boolean getRegistrationStatus(int studentId)
	{
	}
	
	
	private void dropCourse(int studentId)
	{
		
	}
	
	private List<Course> viewCourse(int studentId)
	{
	}
	
	private List<Course> viewRegisteredCourse(int studentId)
	{
		
	}
	
	private void viewGradeCard(int studentId)
	{
		
	}
	private void make_payment(int studentId)
	{
	
	}
}

