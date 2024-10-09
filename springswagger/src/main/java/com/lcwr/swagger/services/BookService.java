package com.lcwr.swagger.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lcwr.swagger.dao.BookRepository;
import com.lcwr.swagger.model.Book;

@Service
public class BookService {

	@Autowired
    private	BookRepository bookRepository;
	
	public String saveBook(Book book) {
		
		bookRepository.save(book);
		return "book is saved successfully!!";
	}
	
	public Book getBookById(int bookId) {
		
		return bookRepository.findById(bookId).get();
	}
	
	public List<Book> getAll(){
		
		return bookRepository.findAll();
	}
	
	public List<Book> removeBook(int bookId) {
		
		bookRepository.deleteById(bookId);
		
		return bookRepository.findAll();
	}
}
