package com.cook.bio.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.cook.bio.business.Services;
import com.cook.bio.models.Cart;
import com.cook.bio.models.User;

@RestController("/cart")
@CrossOrigin("*")
public class CartController {

	@Autowired
	private Services services;

	@GetMapping("/{idUser}")
	public ResponseEntity<List<Cart>> getCart(@PathVariable("idUser") Long idUser) {

		return ResponseEntity.ok().body(this.services.getCart(idUser));
	}
}
