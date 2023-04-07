package com.hdfc.project.entity;

import javax.persistence.Column;

public class Account {
	
	@Column(name = "User_Name", length = 20, nullable = false)
    private String userName;
	
	  @Column(name = "Encryted_Password", length = 128, nullable = false)
	    private String encrytedPassword;
	  
	  @Column(name = "User_Role", length = 20, nullable = false)
	    private String userRole;

	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Account(String userName, String encrytedPassword, String userRole) {
		super();
		this.userName = userName;
		this.encrytedPassword = encrytedPassword;
		this.userRole = userRole;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getEncrytedPassword() {
		return encrytedPassword;
	}

	public void setEncrytedPassword(String encrytedPassword) {
		this.encrytedPassword = encrytedPassword;
	}

	public String getUserRole() {
		return userRole;
	}

	public void setUserRole(String userRole) {
		this.userRole = userRole;
	}

	@Override
	public String toString() {
		return "Account [userName=" + userName + ", encrytedPassword=" + encrytedPassword + ", userRole=" + userRole
				+ "]";
	}
	  
	  




}
