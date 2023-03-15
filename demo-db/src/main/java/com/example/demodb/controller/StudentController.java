package com.example.demodb.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demodb.Model1.Student;
import com.example.demodb.Service.StudService;

@RestController
public class StudentController {
	
	@Autowired
	private StudService studServe;
	
	
	@GetMapping("/allstudents")
	public List<Student> getAllStudents(){
		return studServe.fetchAllStudents();
	}
	
	@PutMapping("/update")
	public String updateStudentRec(@RequestBody Student stu) {
		
		studServe.updateStuRec(stu);
		
		return "successfully updated student rec...."+stu.getId()+"-";
	}
}
