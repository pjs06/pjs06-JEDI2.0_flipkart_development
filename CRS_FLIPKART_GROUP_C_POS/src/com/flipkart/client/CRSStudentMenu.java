package com.flipkart.client;

import com.flipkart.bean.Payment;
import com.flipkart.business.StudentOperations;
import java.util.Scanner;

public class CRSStudentMenu {
	private StudentOperations studentOperations;
	public CRSStudentMenu() {
		studentOperations = new StudentOperations();
	}

	public void CreateStudentMenu(Integer studentId) {
		// TODO Auto-generated method stub
		System.out.println("in student menu!");

		Scanner sc = new Scanner(System.in);

		int input = 0;
		while (true) {
			System.out.println("\n************* Welcome Student *************\n");
			System.out.println("\nChoose an option from the menu: ");
			System.out.println("---------------------------------------");
			System.out.println("Press 1: Course Registeration");
			System.out.println("Press 2: Add Course");
			System.out.println("Press 3: Drop Course");
			System.out.println("Press 4: View Registered Courses");
			System.out.println("Press 5: View Performance Report");
			System.out.println("Press 6: Payment");
			System.out.println("Press 7: Logout");
			System.out.println("---------------------------------------");
			input =sc.nextInt();
			switch (input) {
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
				viewRegisteredCourses(studentId);
				break;
			case 5:
				viewReportCard(studentId);
				break;
			case 6:
				doPayment(studentId);
				break;
			case 7:
				return;
			default:
				System.out.println("----Enter Correct Choice-----");
			}
		}
	}

	private void doPayment(int studentId) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Payment Amount: ");
		Integer amount = sc.nextInt();
		System.out.println("Enter Payment ID: ");
		Integer paymentID = sc.nextInt();
		// Assuming payment status is true for successful payments
		Boolean paymentStatus = true;

		Payment payment = new Payment(studentId, paymentID, paymentStatus, amount);
		studentOperations.DoPayment(payment);
		System.out.println("Payment processed.");
	}


	private void viewReportCard(int studentId) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Semester ID: ");
		int semesterId = sc.nextInt();
	}

	private void viewRegisteredCourses(int studentId) {
		studentOperations.viewRegisteredCourses(studentId); // Assuming semesterId 0 or as needed
	}


	private void dropCourse(int studentId) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Course ID to drop: ");
		String courseId = sc.next();

		studentOperations.dropCourse(studentId, courseId);
	}

	private void addCourse(Integer studentId) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Course ID to add: ");
		String courseId = sc.next();
		studentOperations.addCourse(studentId, courseId);

	}

	private void registerCourses(int studentId) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Course ID to register: ");
		String courseId = sc.next();
		studentOperations.registerCourses(studentId, courseId);
	}

}
