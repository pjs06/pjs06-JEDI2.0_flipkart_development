package com.flipkart.business;


import com.flipkart.bean.Admin;
import com.flipkart.bean.Course;
import com.flipkart.bean.GradeCard;
import com.flipkart.bean.Professor;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class AdminOperations {
	private List<Admin> admins;
	private List<Course> courseCatalogue;
	private List<Professor> professors;
	private List<Integer> approvedStudents;
	private Map<Integer,GradeCard> gradeCards;




	public AdminOperations() {


		admins = new ArrayList<>();
		approvedStudents=new ArrayList<>();

		admins.add(new Admin("admin1","admin","admin","adminPass","10/9/2022"));

		courseCatalogue = new ArrayList<>();
		courseCatalogue.add(new Course("F101","OS",null,10,10,true));
		courseCatalogue.add(new Course("F102","DAA",null,10,10,true));
		courseCatalogue.add(new Course("F103","DBMS",null,10,10,true));
		courseCatalogue.add(new Course("F104","CN",null,10,10,true));
	}


	public Admin findAdminByUsername(String userName){
		for(Admin admin: admins){
			if(admin.getUserName().equals(userName)){
				return admin;
			}
		}
		return null;

	}

	public void approveStudentRegistration(int studentId) {
		approvedStudents.add(studentId);
		System.out.println("Student registration approved for student ID: " + studentId);
	}
	List<Course> getCourseCatalogue() {
		return courseCatalogue;
	}
	public void addCourse(String course_name, String courseID){
			Course course = new Course(courseID,course_name,null,10,10,true);
			courseCatalogue.add(course);
			System.out.println("Course added successfully");
	}

	public void removeCourse(String courseID) {
			courseCatalogue.removeIf(course -> course.getCourseID().equals(courseID));
			System.out.println("Course removed successfully");
	}

	public void addProfessor(Professor professor) {

			System.out.println("Professor added successfully");

	}

	public void removeProfessor(int professorID) {
		professors.removeIf(professor -> professor.getInstructorID().equals(professorID));
		System.out.println("Professor removed successfully");
	}
	Float CalculateCgpa(GradeCard gc) {
		return null;
	}
	GradeCard generateGradeCard(int studentID) {
		return null;

	}
	public Course findCourseById(String courseID) {
		for (Course course : courseCatalogue) {
			if (course.getCourseID().equals(courseID)) {
				return course;
			}
		}
		return null;
	}
	public void sendFeePayNotification() {
	}

	public void PaymentCompletionNotification() {

	}

	public void viewApprovedStudents() {
		for(Integer studentID: approvedStudents){
			System.out.println(studentID);
		}
	}
}
