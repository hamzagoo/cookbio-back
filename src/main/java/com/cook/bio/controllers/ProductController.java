package com.cook.bio.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.cook.bio.business.Services;

@RestController("/product")
public class ProductController {

	@Autowired
	private Services services;

}
