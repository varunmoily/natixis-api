package com.imarticus.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.imarticus.demo.Model.Book;
import com.imarticus.demo.Service.BookService;

@RestController
@RequestMapping("/book")
public class BookController {
	
	@Autowired
	BookService bookService;
	
	@GetMapping("/all")
	public List<Book> fetch()
	{
		return bookService.getAllData();
	}
	
	@PostMapping("/add")
	public Book createNewBook(@RequestBody Book book) {
		return bookService.createNewBook(book);
	}
	@PutMapping("/update/{id}")
	public Book createNewBook(@RequestBody Book book,@PathVariable int id){
		return bookService.updateBook(book, id);
	}
	
	@DeleteMapping("/remove/{id}")
	public String remove(@PathVariable int id){
		bookService.deleteRecords(id);
		return "deleted record";
	}
	

}
