package com.DemoStudent.Service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.DemoStudent.Module.Student;
import com.DemoStudent.Repo.StudentRepo;

@Service
public class StudentService {
	
	@Autowired
	StudentRepo stuRepo;

	public List<Student> getAllStudents() {
		return stuRepo.getAllStudents();
	}

	//public List<Student> fetchMarks(int marks) {
		// TODO Auto-generated method stub
	//	return stuRepo.fetchMarks(marks);
	//}

	public List<Student> getStudentByMarks(int marks) {
		// TODO Auto-generated method stub
		return stuRepo.getAllStudents().stream().filter((stu)->stu.getMarks() > marks).collect(Collectors.toList());
	}

	public List<Student> getStudentByMarks(int marks, int fees) {
		// TODO Auto-generated method stub
		return stuRepo.getStudentByMarks(marks,fees);
	}

	

}
