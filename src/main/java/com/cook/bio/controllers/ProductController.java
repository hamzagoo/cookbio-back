package com.cook.bio.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cook.bio.business.Services;
import com.cook.bio.models.Product;

@RestController("/product")
@CrossOrigin("*")
public class ProductController {

	@Autowired
	private Services services;

	@GetMapping
	public ResponseEntity<List<Product>> getProducts() {

		return ResponseEntity.ok().body(this.services.getProducts());
	}

	@PostMapping
	public void createProduct(Product product) {

		this.services.createProduct(product);
	}

	@PutMapping
	public void updateProduct(Product product) {

		this.services.updateProduct(product);
	}

	@DeleteMapping
	public void deleteProduct(Product product) {

		this.services.deleteProduct(product);
	}
}
