package com.imarticus.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.imarticus.demo.Model.Book;
import com.imarticus.demo.Repo.BookRepo;

@Service
public class BookService {
	
	@Autowired
	BookRepo bookRepo;
	
	public Book createNewBook(Book book) {
		return bookRepo.save(book);
	}
	
	public Book updateBook(Book book,int id) {
		
		Book oldBook = bookRepo.findById(id).get();
		if(oldBook != null) {
			return bookRepo.save(book);
		}
		else {
			return new Book();
		}
	}

	public List<Book> getAllData() {
		// TODO Auto-generated method stub
		return bookRepo.findAll();
	}

	public void deleteRecords(int id) {
		// TODO Auto-generated method stub
		bookRepo.deleteById(id);
	}

}
