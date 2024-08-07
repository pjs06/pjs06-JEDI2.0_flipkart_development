package com.flipkart.bean;

public class User {
    private String name;
    private String userID;
    private String role;
    private String password;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
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
}
