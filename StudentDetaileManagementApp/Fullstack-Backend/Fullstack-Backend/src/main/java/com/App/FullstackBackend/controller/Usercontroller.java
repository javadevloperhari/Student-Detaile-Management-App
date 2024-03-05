package com.App.FullstackBackend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.App.FullstackBackend.model.User;
import com.App.FullstackBackend.repository.UserRepository;

@RestController
@CrossOrigin("http://localhost:3000")
public class Usercontroller {
	
	@Autowired
	private UserRepository userRepository;
	
	@PostMapping("/user")
	User newUser(@RequestBody User newUser) {
		
		
		return userRepository.save(newUser);
		
	}
	
	@GetMapping("/user")
	List<User> getAllUser(){
		return userRepository.findAll();
		
	}
	
	 

}
