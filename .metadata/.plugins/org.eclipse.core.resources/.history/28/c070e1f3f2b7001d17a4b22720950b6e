package com.example.demo.Repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.Model.Student;

@Service
public class StudentRepository {
	
	private List<Student> studList;
	private List<Student> temp;
	
	public StudentRepository() {
		studList=new ArrayList<Student>();
		studList.add(new Student(1,"varun",67,25000));
		studList.add(new Student(2,"tharun",87,45000));
		studList.add(new Student(3,"dharun",47,55000));
		studList.add(new Student(4,"sarun",25,65000));
		studList.add(new Student(5,"jarun",95,5000));
		studList.add(new Student(6,"aarun",15,05000));
		studList.add(new Student(7,"marun",5,75000));
		
	}
	public List<Student> pass(){
		temp =new ArrayList<Student>();
		temp.clear();
		for(Student x : studList)
		{
			if(x.getMarks1()>=35)  temp.add(x);
		}
		return temp;
	}
	public List<Student> fail(){
		temp =new ArrayList<Student>();
		temp.clear();
		for(Student x : studList)
		{
			if(x.getMarks1()<35)  temp.add(x);
		}
		return temp;
	}
	public List<Student> fetch(int i)
	{
		temp=new ArrayList<Student>();
		for(Student x : studList)
		{
			if(x.getMarks1()>=i)  temp.add(x);
		}
		return temp;
	}
	
	
	
}
