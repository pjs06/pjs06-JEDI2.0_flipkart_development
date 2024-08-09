package com.flipkart.business;

import com.flipkart.bean.Course;
import com.flipkart.bean.Professor;
import com.flipkart.bean.Student;

import java.util.List;

public interface ProfessorInterface {

    public List<Professor> getProfessors();

    public boolean addProfessor(String userName, String name, String role, String password, Integer instructorID, String department, String designation);

    public Professor findProfessorByUsername(String userName);

    public void getCourses(String profID);

    public void addGrade(Integer studentID, String courseID, String alphaGrade);

    public void viewEnrolledStudents(String courseID);

    public void courseSelection(Integer instructorID, String courseID);
    
    public void viewProfessors();
}
