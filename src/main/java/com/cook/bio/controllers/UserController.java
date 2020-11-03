package com.cook.bio.controllers;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cook.bio.business.Services;
import com.cook.bio.dao.utils.DBGenerator;
import com.cook.bio.models.User;

@RestController
@RequestMapping("/user")
@CrossOrigin("*")
public class UserController {

	@Autowired
	private Services services;
	@Autowired
	private DBGenerator dbGenerator;
	
	@PostConstruct
	public void init() {
		dbGenerator.generateUsers();
	}
	
	@GetMapping("/login")
	public ResponseEntity<User> authentication(@RequestParam("username") String username, @RequestParam("password") String password){
		if(!username.isEmpty() && !password.isEmpty()) {
			
			return ResponseEntity.ok().body(this.services.getUser(username, password));
		}
		
		return ResponseEntity.badRequest().build();
	}
}
