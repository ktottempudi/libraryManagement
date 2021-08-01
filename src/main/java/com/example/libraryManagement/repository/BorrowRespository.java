package com.example.libraryManagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.libraryManagement.entity.Borrow;

@Repository
public interface BorrowRespository extends JpaRepository<Borrow, Long>{
	

}
