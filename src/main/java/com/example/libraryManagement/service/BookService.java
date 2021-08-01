package com.example.libraryManagement.service;

import java.util.List;

import com.example.libraryManagement.entity.Book;

public interface BookService {
	
	List<Book> findAll();
	Book findByTitle(String title);
	List<Book> findByAuthor(String author);
	List<Book> findByGenre(String genre);
	void createBook(Book book);
	void updateBook(Book book);
	void deleteBook(Long isbn);

}
