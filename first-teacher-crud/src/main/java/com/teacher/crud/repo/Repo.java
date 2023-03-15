package com.teacher.crud.repo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.teacher.crud.module.Teacher;

@Service
public class Repo {
	public List<Teacher> teacher;

	public Repo() {
		teacher = new ArrayList<Teacher>();
		teacher.add(new Teacher(1,"kusuma","english"));
		teacher.add(new Teacher(2,"jaya","java"));
		teacher.add(new Teacher(3,"wilma","python"));
		
	}
	public List<Teacher> fetch()
	{
		return teacher;
	}
	
}
