package com.DemoStudent.Repo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import com.DemoStudent.Module.Student;

@Component
public class StudentRepo {
	
	List<Student> stuList = Arrays.asList(
			new Student(100,"sumanth",98,30000),
			new Student(200,"madhu",88,90000),
			new Student(300,"bashasir",78,40000),
			new Student(400,"sandesh",68,39000)
			);

	public List<Student> getAllStudents() {
		// TODO Auto-generated method stub
		return stuList;
	}

	//public List<Student> fetchMarks(int marks) {
		// TODO Auto-generated method stub
	//	return stuList.stream().filter(x->x.getMarks()>marks).collect(Collectors.toList());
	//}

	public List<Student> getStudentByMarks(int marks) {
		// TODO Auto-generated method stub
		return stuList.stream().filter(x->x.getMarks()>marks).collect(Collectors.toList());	}

	public List<Student> getStudentByMarks(int marks, int fees) {
		// TODO Auto-generated method stub
		return stuList.stream().filter(x->(x.getMarks()>marks)&&(x.getFees()>=fees)).collect(Collectors.toList());
	}

}
