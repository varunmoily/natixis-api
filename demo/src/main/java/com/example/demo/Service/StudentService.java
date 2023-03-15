package com.example.demo.Service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Model.Student;
import com.example.demo.Repository.StudentRepository;

@Service
public class StudentService {
	
	@Autowired
	private StudentRepository studRepo;
	
	public List<Student> passData(){
		return studRepo.pass();
		
	}
	public List<Student> failData(){
		return studRepo.fail();
	}
	public List<Student> fetchData(int n) {
		// TODO Auto-generated method stub
		return studRepo.fetch(n);
	}
}
