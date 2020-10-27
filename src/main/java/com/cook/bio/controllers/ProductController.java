package com.cook.bio.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cook.bio.business.Services;
import com.cook.bio.models.Product;

@RestController
@RequestMapping("/product")
@CrossOrigin("*")
public class ProductController {

	@Autowired
	private Services services;

	@GetMapping
	public ResponseEntity<List<Product>> getProducts() {

		return ResponseEntity.ok().body(this.services.getProducts());
	}

	@PostMapping
	public ResponseEntity<Product> createProduct(@RequestBody Product product) {

		if(product != null) {

			Product result = this.services.createProduct(product);
			System.out.println(result);
			return ResponseEntity.ok().body(result); 
		}
		return ResponseEntity.badRequest().build();
	}

	@PutMapping
	public void updateProduct(@RequestBody Product product) {

		this.services.updateProduct(product);
	}

	@DeleteMapping("/{id}")
	public void deleteProduct(@PathVariable("id") Long id) {

		this.services.deleteProduct(id);
	}
}
