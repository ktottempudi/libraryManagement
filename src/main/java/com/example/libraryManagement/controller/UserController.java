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

import com.example.libraryManagement.entity.User;
import com.example.libraryManagement.service.UserServiceImpl;

@RestController
public class UserController {
	
	@Autowired
	UserServiceImpl service;
	
	@GetMapping(value="/getUsers")
	public List<User> getUsers(){
		return service.findAll();
	}
	
	@GetMapping(value="/getUsers/{lastName}")
	public User getUserBylastName(@PathVariable("lastName") String lastName){
		return service.findBylastName(lastName);
	}
	
	@PostMapping(value="/createUser")
	public void createUser(@RequestBody User user) {
		service.createUser(user);
	}
	
	@PutMapping(value="/updateUser")
	public void updateUser(@RequestBody User user) {
		service.updateUser(user);
	}
	
	@DeleteMapping(value="/deleteUser/{userId}")
	public void deleteUser(@PathVariable("userId") Long userId) {
		service.deleteUser(userId);
	}

}
