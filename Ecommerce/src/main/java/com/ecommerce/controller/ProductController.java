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

import com.ecommerce.entity.Product;
import com.ecommerce.repo.ProductRepo;

@CrossOrigin(origins="http://localhost:3000/")
@RestController
public class ProductController {
	
	
	@Autowired
	ProductRepo productRepo;
	
	
		
	@PostMapping("/api/cart")
	public ResponseEntity<Product> addToCart(@RequestBody Product product) { 
		return new ResponseEntity<>(productRepo.save(product),HttpStatus.CREATED);
		
	}
	@GetMapping("/api/cart")
	public ResponseEntity <List<Product>> getProducts() {
		
		return new ResponseEntity<>(productRepo.findAll(),HttpStatus.OK);
	}
		
		
	

}
