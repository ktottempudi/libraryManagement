package com.example.libraryManagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.libraryManagement.entity.Book;
import com.example.libraryManagement.service.BookServiceImpl;

@RestController
public class BookController {
	
	@Autowired
	BookServiceImpl service;
	
	@GetMapping(value="/getBooks")
	public List<Book> getBooks(){
		return service.findAll();
		
	}
	
	@GetMapping(value="/getBooks/title")
	public Book getBookByTitle(@RequestParam(value="title") String title){
		return service.findByTitle(title);
	}
	
	@GetMapping(value="/getBooks/author")
	public List<Book> getBooksByAuthor(@RequestParam(value="author") String author){
		return service.findByAuthor(author);
	}
	
	@GetMapping(value="/getBooks/genre")
	public List<Book> getBooksByGenre(@RequestParam(value="genre") String genre){
		return service.findByGenre(genre);
	}
	
	@PostMapping(value="/createBook")
	public void createBook(@RequestBody Book book) {
		service.createBook(book);
		
	}
	
	@PutMapping(value="/updateBook")
	public void bookAvailable(@RequestBody Book book) {
		service.updateBook(book);
	}
	
	@DeleteMapping(value="deleteBook/{isbn}")
	public void deleteBook(@PathVariable("isbn") Long isbn) {
		service.deleteBook(isbn);
	}

}
