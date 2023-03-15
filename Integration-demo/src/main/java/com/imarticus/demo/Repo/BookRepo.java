package com.imarticus.demo.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.imarticus.demo.Model.Book;

public interface BookRepo extends JpaRepository<Book, Integer>{

}
