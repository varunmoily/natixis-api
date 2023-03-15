package com.Friday.demo.Controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Friday.demo.Module.Employee;

@RestController
@CrossOrigin(origins = "")
public class EmpController {
	
	@GetMapping("/all")
	public List<Employee> getAllEmployees(){
		List<Employee> empList = Arrays.asList(
				new Employee("Abdul","1234"));
		return empList;
	}

}
