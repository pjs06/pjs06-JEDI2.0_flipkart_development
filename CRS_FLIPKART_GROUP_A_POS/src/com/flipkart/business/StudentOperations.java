package com.flipkart.business;

public interface StudentOperations {
    public int register(String name,String userID,String password,int batch,String branch,String address,String country) ; 
	

    public int enrollCourse(String courseId);

    public int unenrollCourse(String courseId);
}
