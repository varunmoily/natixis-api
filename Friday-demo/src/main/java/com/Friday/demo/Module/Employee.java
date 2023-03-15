package com.Friday.demo.Module;

public class Employee {
	private String userName;
	private String Password;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(String userName, String password) {
		super();
		this.userName = userName;
		Password = password;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	@Override
	public String toString() {
		return "Employee [userName=" + userName + ", Password=" + Password + "]";
	}
	
	

}
