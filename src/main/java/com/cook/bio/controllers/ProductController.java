package com.cook.bio.controllers;

import java.util.List;

import javax.annotation.PostConstruct;

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
import com.cook.bio.dao.utils.DBGenerator;
import com.cook.bio.models.Evenement;
import com.cook.bio.models.Product;

@RestController
@RequestMapping("/product")
@CrossOrigin("*")
public class ProductController {

	@Autowired
	private Services services;
	@Autowired
	private DBGenerator dbGenerator;

	@PostConstruct
	public void init() {
		dbGenerator.generateProducts();
	}

	@GetMapping
	public ResponseEntity<List<Product>> getProducts() {

		return ResponseEntity.ok().body(this.services.getProducts());
	}

	@GetMapping("/{id}")
	public ResponseEntity<Product> getProduct(@PathVariable Long id) {
		if (id != null) {

			Product result = this.services.getProduct(id);
			System.out.println(result);
			return ResponseEntity.ok().body(result);
		}
		return ResponseEntity.badRequest().build();
	}

	@PostMapping
	public ResponseEntity<Product> createProduct(@RequestBody Product product) {

		if (product != null) {

			Product result = this.services.createProduct(product);
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
