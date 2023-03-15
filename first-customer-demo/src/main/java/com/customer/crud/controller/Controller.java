package com.customer.crud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.customer.crud.module.Customer;
import com.customer.crud.service.ServiceCust;

@RestController
public class Controller {
	
	@Autowired
	private ServiceCust str;
	
	@GetMapping("*all")
	public List<Customer> fetchAll()
	{
		return str.fetchAllData();
	}
	
	

}
