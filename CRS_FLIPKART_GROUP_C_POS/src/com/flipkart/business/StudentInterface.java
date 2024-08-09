package com.flipkart.business;


import com.flipkart.bean.Course;
import com.flipkart.bean.Payment;
import com.flipkart.bean.Student;

import java.util.List;

public interface StudentInterface {

    List<Student> getStudents();

    boolean addStudent(String userName, String name, String role, String password, Integer studentID, String department);

    Student findStudentByUsername(String userName);

    void registerCourses(int studentId, String courseId);

    void addCourse(int studentId, String courseId);

    void dropCourse(int studentId, String courseId);

    boolean finishRegistration();

    List<Course> viewAvailableCourses();

    void viewReportCard(int studentID, int semesterId);

    Boolean checkPaymentWindow(int StudentID);

    void doPayment(Payment payment);

    void viewRegisteredCourses(int studentID);

    Student findStudentById(int studentId);

    Integer getStudentIdByUsername(String username);

    Course findCourseById(String courseId);

    void viewStudents();
}
