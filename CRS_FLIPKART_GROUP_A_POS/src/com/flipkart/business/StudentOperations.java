package com.flipkart.business;

import java.util.ArrayList;
import java.util.List;

import com.flipkart.bean.Student;

public class StudentOperations {
	
	List<Student> students=new ArrayList<Student>();
    public void addStudent(String name,String userID,String password,int batch,String branch,String address,String country) 
    {
    	
//    	public Student(String userId, String name, String password, String address,String country,String branchName,int studentId,int batch,boolean isApproved) {
    		
    	Student st = new Student(userID , name ,password,address , country , branch , 123 , batch,true );
    	
    	students.add(st);
    	
    }

//    public int enrollCourse(String courseId);
//
//    public int unenrollCourse(String courseId);
}
