package com.example.libraryManagement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.libraryManagement.entity.User;
import com.example.libraryManagement.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	UserRepository repo;

	@Override
	public List<User> findAll() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public User findBylastName(String lastName) {
		// TODO Auto-generated method stub
		return repo.findBylastName(lastName);
	}

	@Override
	public void createUser(User user) {
		// TODO Auto-generated method stub
		repo.save(user);
		
	}

	@Override
	public void updateUser(User user) {
		// TODO Auto-generated method stub
		repo.save(user);
		
	}

	@Override
	public void deleteUser(Long userId) {
		// TODO Auto-generated method stub
		repo.deleteById(userId);
	}

}
