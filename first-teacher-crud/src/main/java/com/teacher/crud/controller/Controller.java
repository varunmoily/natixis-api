package com.teacher.crud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.teacher.crud.module.Teacher;
import com.teacher.crud.service.ServiceTea;

@RestController
public class Controller {
	
	@Autowired
	public ServiceTea serv;
	
	@GetMapping("/all")
	public  List<Teacher> fetch()
	{
		return serv.fetchAll();
	}

}
