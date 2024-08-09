package com.flipkart.business;

import com.flipkart.bean.Course;
import com.flipkart.bean.Payment;
import com.flipkart.bean.Student;
import java.util.ArrayList;
import java.util.List;

public class StudentOperations {
	private List<Student> students;
	private AdminOperations adminOps;

public StudentOperations(){
	students = new ArrayList<>();
	adminOps= new AdminOperations();
	ArrayList<String> courses = new ArrayList<>();
	courses.add("F101");
	courses.add("F102");
	students.add(new Student("Preet", "preet", "student", "1234", 101, "CS", courses));
	students.add(new Student("Ashray","Ashray","student","1234",102,"CS",null));
	students.add(new Student("Sanju","Sanju","student","1234",103,"CS",null));
}

	public List<Student> getStudents() {
		return students;
	}

	public boolean addStudent(String userName, String name, String role, String password,Integer studentID, String department) {
		if(findStudentByUsername(userName)==null){
			students.add(new Student(userName,name,role,password,studentID,department,null));
			return true;
		}
        return false;
    }
	public Student findStudentByUsername(String userName){
		for (Student student : students) {
			if(student.getUserName().equals(userName)){
				return student;
			}
		}
		return null;
	}

	public void registerCourses(int studentId, String courseId) {
		Student student = findStudentById(studentId);
		Course course = findCourseById(courseId);
		if (student != null && course != null) {
			if (course.isOffered() && course.getAvailableSeats() > 0) {
				student.getRegisteredCourses().add(courseId);
				course.addStudent(studentId); // Add student to course
				System.out.println("Course registered successfully.");
			} else {
				System.out.println("Course not available.");
			}
		} else {
			System.out.println("Student or Course not found.");
		}
	}

	public void addCourse(int studentId, String courseId) {
		Student student = findStudentById(studentId);
		Course course = findCourseById(courseId);

		if (student != null && course != null) {
			if (course.isOffered() && course.getAvailableSeats() > 0) {
				if (!student.getRegisteredCourses().contains(courseId)) {
					student.getRegisteredCourses().add(courseId);
					course.addStudent(studentId); // Add student to course
					System.out.println("Course added successfully.");
				} else {
					System.out.println("Student is already registered for this course.");
				}
			} else {
				System.out.println("Course not available or no seats left.");
			}
		} else {
			System.out.println("Student or Course not found.");
		}
}


public void dropCourse(int studentId, String courseId) {
	Student student = findStudentById(studentId);
	Course course = findCourseById(courseId);

	if (student != null && course != null) {
		if (student.getRegisteredCourses().remove(courseId)) {
			course.removeStudent(studentId); // Remove student from course
			System.out.println("Course dropped successfully.");
		} else {
			System.out.println("Course not found in student's list.");
		}
	} else {
		System.out.println("Student or Course not found.");
	}
}

	public boolean finishRegistration() {
		System.out.println("Registration complete.");
		return true;
	}
	public List<Course> viewAvailableCourses(){
		List<Course> availableCourses = adminOps.getCourseCatalogue();
		List<Course> newAvailableCourses = new ArrayList<>();
		for (Course course : availableCourses) {
			if (course.isOffered() && course.getAvailableSeats() > 0) {
				newAvailableCourses.add(course);
			}
		}
		return newAvailableCourses;
	}
	public void viewReportCard(int studentID, int semesterId) {
		return;
	}
	public Boolean checkPaymentWindow(int StudentID) {
		System.out.println("Payment window status checked.");
		return true;
	}
	public void DoPayment(Payment payment) {
		System.out.println("Payment processed successfully.");
	}
	public void viewRegisteredCourses(int studentID) {
		Student student = findStudentById(studentID);
		if (student != null) {
			System.out.println("Registered Courses for student " + studentID + ":");
			for (String course : student.getRegisteredCourses()) {
				System.out.println(course);
				//add course name too (pair bnana pdega in student class)
			}
		} else {
			System.out.println("Student not found.");
		}
	}
	public Student findStudentById(int studentId) {
		for (Student student : students) {
			if (student.getStudentID() == studentId) {
				return student;
			}
		}
		return null;
	}
	public Integer getStudentIdByUsername(String username) {
		for (Student student : students) {
			if (student.getUserName().equals(username)) {
				return student.getStudentID();
			}
		}
		
		return -1; 
	}
	public Course findCourseById(String courseId) {
		List<Course> availableCourses = adminOps.getCourseCatalogue();
		for (Course course : availableCourses) {
			if (course.getCourseID().equals(courseId)) {
				return course;
			}
		}
		return null;
	}
	public void viewStudents() {
		for (Student student : students) {
			System.out.println(student.getStudentID()+" "+student.getDepartment()+" "+student.getName()+" "+student.getUserName());
		}
	}
}
