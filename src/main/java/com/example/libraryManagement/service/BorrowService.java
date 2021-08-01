package com.example.libraryManagement.service;

import java.util.List;

import com.example.libraryManagement.entity.Borrow;

public interface BorrowService {
	
	List<Borrow> findAll();
	Borrow findByuserId(Long userId);
	void createrBorrow(Borrow borrow);
	void updateBorrow(Borrow borrow);
	void deleteBorrow(Long isbn);

}
