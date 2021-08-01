package com.example.libraryManagement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.libraryManagement.entity.Borrow;
import com.example.libraryManagement.repository.BorrowRespository;

@Service
public class BorrowServiceImpl implements BorrowService{
	
	@Autowired
	BorrowRespository repo;

	@Override
	public List<Borrow> findAll() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public Borrow findByuserId(Long userId) {
		// TODO Auto-generated method stub
		return repo.getById(userId);
	}

	@Override
	public void createrBorrow(Borrow borrow) {
		// TODO Auto-generated method stub
		repo.save(borrow);
		
	}

	@Override
	public void updateBorrow(Borrow borrow) {
		// TODO Auto-generated method stub
		repo.save(borrow);
	}

	@Override
	public void deleteBorrow(Long isbn) {
		// TODO Auto-generated method stub
		repo.deleteById(isbn);
	}

}
