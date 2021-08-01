package com.example.libraryManagement.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.libraryManagement.entity.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {
	
	List<Book> findByAuthor(String author);
	Book findByTitle(String title);
	List<Book> findByGenre(String genre);
	

}
