package com.ecommerce.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.entity.User;
import com.ecommerce.repo.UserRepo;

@CrossOrigin(origins="http://localhost:3000/")
@RestController
public class UserController {
	
	//THIS API IS FOR RIGISTRATION PAGE
	//DATA ENTERED IN UI DIRECTLY STORES IN MYSQL DB WITH THIS API
	
	//WRITTEN BY PAVAN
	
	@Autowired
	UserRepo userRepo;
	
	
	@PostMapping("/api/users")
	public ResponseEntity <User> saveUser(@RequestBody User user) {
		return new ResponseEntity<>(userRepo.save(user),HttpStatus.CREATED);
		
	}
	
	@GetMapping("/api/users")
	public ResponseEntity <List<User>> getUsers() {
		
		return new ResponseEntity<>(userRepo.findAll(),HttpStatus.OK);
		
		
	}
	
	
	

}
