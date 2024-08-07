package com.flipkart.bean;

public class Student extends User{
    private String branchName;
    private int studentId;
    private int batch;
    private boolean isApproved;
    
    
  
	public Student(String userId, String name, String password, String address,String country,String branchName,int studentId,int batch,boolean isApproved) {
		super();
		this.branchName = branchName;
		this.studentId = studentId;
		this.batch = batch;
		this.isApproved = isApproved;
	}
	

    public String getBranchName() {
        return branchName;
    }

    public void setBranchName(String branchName) {
        this.branchName = branchName;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public int getBatch() {
        return batch;
    }

    public void setBatch(int batch) {
        this.batch = batch;
    }
    
    public boolean isApproved() {
		return isApproved;
	}


	public void setApproved(boolean isApproved) {
		this.isApproved = isApproved;
	}

    
}
