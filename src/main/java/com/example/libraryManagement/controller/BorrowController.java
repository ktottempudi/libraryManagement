package com.example.libraryManagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.libraryManagement.entity.Borrow;
import com.example.libraryManagement.service.BorrowServiceImpl;

@RestController
public class BorrowController {
	
	@Autowired
	BorrowServiceImpl service;
	
	@GetMapping(value="/getBorrows")
	public List<Borrow> getBorrows(){
		return service.findAll();
	}
	
	@GetMapping(value="/getBorrows/{userId}")
	public Borrow getBorrowById(@PathVariable("userId") Long userId) {
		return service.findByuserId(userId);
	}
	
	@PostMapping(value="/createBorrow")
	public void createBorrow(@RequestBody Borrow borrow) {
		service.createrBorrow(borrow);
	}
	
	@PutMapping(value="/updateBorrow")
	public void updateBorrow(@RequestBody Borrow borrow) {
		service.updateBorrow(borrow);
	}
	
	@DeleteMapping(value="/deleteBorrow/{isbn}")
	public void deleteBorrow(@PathVariable("isbn") Long isbn) {
		service.deleteBorrow(isbn);
	}

}
