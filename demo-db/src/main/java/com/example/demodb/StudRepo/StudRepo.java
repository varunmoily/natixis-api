package com.example.demodb.StudRepo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.example.demodb.Model1.Student;


public interface StudRepo extends JpaRepository<Student, Integer>{

}
