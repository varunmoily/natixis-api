package com.Pipe.demo.Model;

import java.util.Date;

public class Employee {
	private int Id;
	private String Name;
	private String Dob;
	private int Sal;
	private Date JoiningDate;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(int id, String name, String dob, int sal, Date joiningDate) {
		super();
		Id = id;
		Name = name;
		Dob = dob;
		Sal = sal;
		JoiningDate = joiningDate;
	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getDob() {
		return Dob;
	}
	public void setDob(String dob) {
		Dob = dob;
	}
	public int getSal() {
		return Sal;
	}
	public void setSal(int sal) {
		Sal = sal;
	}
	public Date getJoiningDate() {
		return JoiningDate;
	}
	public void setJoiningDate(Date joiningDate) {
		JoiningDate = joiningDate;
	}
	@Override
	public String toString() {
		return "Employee [Id=" + Id + ", Name=" + Name + ", Dob=" + Dob + ", Sal=" + Sal + ", JoiningDate="
				+ JoiningDate + "]";
	}
	
	
	

}
