package com.example.libraryManagement.service;

import java.util.List;

import com.example.libraryManagement.entity.User;

public interface UserService {
	
	List<User> findAll();
	User findBylastName(String lastName);
	void createUser(User user);
	void updateUser(User user);
	void deleteUser(Long userId);

}
