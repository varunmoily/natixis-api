package com.customer.crud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.customer.crud.module.Customer;
import com.customer.crud.repo.Repo;

@Service
public class ServiceCust {
	
	@Autowired
	public Repo repo;
	
	public List<Customer> fetchAllData() {
		// TODO Auto-generated method stub
		return repo.fetch();
	}

}
