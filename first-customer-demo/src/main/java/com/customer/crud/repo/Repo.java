package com.customer.crud.repo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.customer.crud.module.Customer;

@Service
public class Repo {
	private List<Customer> culist;

	public Repo() {
		culist = new ArrayList<Customer>();
		culist.add(new Customer(1,"varun","ind"));
		culist.add(new Customer(2,"marun","west"));
		culist.add(new Customer(3,"tarun","eng"));
		
	}

	public List<Customer> fetch() {
		return culist;
	}
	
}
