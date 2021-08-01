package com.example.libraryManagement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.libraryManagement.entity.Book;
import com.example.libraryManagement.repository.BookRepository;

@Service
public class BookServiceImpl implements BookService{
	
	@Autowired
	BookRepository repo;

	@Override
	public List<Book> findAll() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public Book findByTitle(String title) {
		// TODO Auto-generated method stub
		return repo.findByTitle(title);
	}

	@Override
	public List<Book> findByAuthor(String author) {
		// TODO Auto-generated method stub
		return repo.findByAuthor(author);
	}

	@Override
	public List<Book> findByGenre(String genre) {
		// TODO Auto-generated method stub
		return repo.findByGenre(genre);
	}

	@Override
	public void createBook(Book book) {
		// TODO Auto-generated method stub
		repo.save(book);
		
	}

	@Override
	public void updateBook(Book book) {
		// TODO Auto-generated method stub
		repo.save(book);
		
	}

	@Override
	public void deleteBook(Long isbn) {
		// TODO Auto-generated method stub
		repo.deleteById(isbn);
		
	}

}
