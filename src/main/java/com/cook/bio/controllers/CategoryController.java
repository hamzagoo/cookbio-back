package com.cook.bio.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cook.bio.business.Services;
import com.cook.bio.models.Cart;
import com.cook.bio.models.Category;

@RestController
@RequestMapping("/category")
@CrossOrigin("*")
public class CategoryController {

	@Autowired
	private Services services;
	
	@GetMapping
	public ResponseEntity<List<Category>> getCategories() {

		return ResponseEntity.ok().body(this.services.getCategories());
	}
}
