package com.teacher.crud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.teacher.crud.module.Teacher;
import com.teacher.crud.repo.Repo;

@Service
public class ServiceTea {
	
	@Autowired
	public Repo repos;
	
	public List<Teacher> fetchAll()
	{
		return repos.fetch();
	}

}
