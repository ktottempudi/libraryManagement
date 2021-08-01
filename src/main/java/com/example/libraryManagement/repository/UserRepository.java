package com.example.libraryManagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.libraryManagement.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
	
	User findBylastName(String lastName);
}
