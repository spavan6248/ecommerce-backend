package com.ecommerce.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.entity.User;
import com.ecommerce.repo.UserRepo;

@CrossOrigin(origins="http://localhost:3000/")
@RestController
@RequestMapping("/api/login")
public class LoginController {

	@Autowired
	private UserRepo userRepo;             //WRITTEN BY PAVAN 

	@PostMapping
	public ResponseEntity<String> login(@RequestBody User user) {
		User foundUser = userRepo.findByUserName(user.getUserName()); //i have created findByUserName method in userRepo

		if (foundUser!=null) {
			if(user.getUserPass().equals(foundUser.getUserPass())) 
				return ResponseEntity.ok("Login successful");
			else 
				return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Invalid credentials");


		} 
		else {
			return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Invalid credentials");
		}



	}
}

