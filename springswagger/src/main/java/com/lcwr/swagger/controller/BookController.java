package com.lcwr.swagger.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lcwr.swagger.model.Book;
import com.lcwr.swagger.services.BookService;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/book")
public class BookController {
	@Autowired
	private BookService bookService;
     
	@GetMapping("/books")
	public List<Book> getAllBooks(){
		
		return bookService.getAll();
	}
	
	@GetMapping("/books/{bookId}")
	@ApiOperation(value = "book id", notes = "provides book details of the particular id", response = ResponseEntity.class)
	public Book findBookById(@PathVariable int bookId) {
		
		return bookService.getBookById(bookId);
	}
	
	@PostMapping("add")
	public String addBook(@RequestBody Book book) {
		
		return bookService.saveBook(book);
	}
	
	@DeleteMapping("/remove/{bookId}")
	public List<Book> deleteBook(@PathVariable int bookId){
		 
		return bookService.removeBook(bookId);
	}
}
