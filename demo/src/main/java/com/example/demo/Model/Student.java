package com.example.demo.Model;

public class Student {
	private int id;
	private String name;
	private int marks1;
	private int fees;
	
	public Student() {
		super();
	}
	public Student(int id, String name, int marks1, int fees) {
		super();
		this.id = id;
		this.name = name;
		this.marks1 = marks1;
		this.fees = fees;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMarks1() {
		return marks1;
	}
	public void setMarks1(int marks1) {
		this.marks1 = marks1;
	}
	public int getFees() {
		return fees;
	}
	public void setFees(int fees) {
		this.fees = fees;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", marks1=" + marks1 + ", fees=" + fees + "]";
	}
	
	

}
