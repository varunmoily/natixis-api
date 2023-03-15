package com.example.demo.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.Student;
import com.example.demo.Service.StudentService;

@RestController
public class StudentController {
	
	@Autowired
	private StudentService Studentservice;
	
	@GetMapping("/pass")
	public List<Student> pass()
	{
		return Studentservice.passData();
	}
	
	@GetMapping("/fail")
	public List<Student> fail()
	{
		return Studentservice.failData();
	}
	
	@GetMapping("/fetch")
	public List<Student> fetch(int grade)
	{
		return Studentservice.fetchData(grade);
	}
}

