package com.flipkart.bean;

public class User {


	private String userName;
	private String name;
	private String role;
	private String password;
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public User(String userName, String name, String role, String password) {
		super();
		this.userName = userName;
		this.name = name;
		this.role = role;
		this.password = password;
	}
	public User() {
		// TODO Auto-generated constructor stub
	}
	

}
