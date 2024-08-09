package com.flipkart.business;

import com.flipkart.bean.Admin;
import com.flipkart.bean.Course;
import com.flipkart.bean.GradeCard;
import com.flipkart.bean.Professor;
import java.util.List;

public interface AdminInterface {

    Admin findAdminByUsername(String userName);

    void approveStudentRegistration(int studentId);

    List<Course> getCourseCatalogue();

    void addCourse(String courseName, String courseID);

    void removeCourse(String courseID);

    void addProfessor(Professor professor);

    void removeProfessor(int professorID);

    // Float calculateCgpa(GradeCard gc);

    GradeCard generateGradeCard(int studentID);

    Course findCourseById(String courseID);

    void sendFeePayNotification();

    // void paymentCompletionNotification();

    void viewApprovedStudents();
}
