package com.flipkart.business;

import com.flipkart.bean.Course;


import java.util.*;
public interface ProfessorOperations {
	
	
	public boolean addGrade(int studentId,String courseCode,String grade);
	
	public List<Course> getCourses(String profId);

	public String viewEnrolledStudents(String courseID);
}
