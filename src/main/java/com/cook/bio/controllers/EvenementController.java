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
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cook.bio.business.Services;
import com.cook.bio.dao.utils.DBGenerator;
import com.cook.bio.models.Evenement;

@RestController
@RequestMapping("/evenement")
@CrossOrigin("*")
public class EvenementController {

	@Autowired
	private Services services;
	@Autowired
	private DBGenerator dbGenerator;
	
	@PostConstruct
	public void init() {
		dbGenerator.generateEvents();
	}

	@GetMapping
	public ResponseEntity<List<Evenement>> getEvenements() {

		return ResponseEntity.ok().body(this.services.getEvenements());
	}

	@GetMapping("/{id}")
	public ResponseEntity<Evenement> getEvenement(@PathVariable Long id) {
		if (id != null) {
			
			Evenement result = this.services.getEvenement(id);
			System.out.println(result);
			return ResponseEntity.ok().body(result);
		}
		return ResponseEntity.badRequest().build();
	}

	@PostMapping
	public ResponseEntity<Evenement> createEvenement(@RequestBody Evenement evenement) {
		if (evenement != null) {
			return ResponseEntity.ok().body(this.services.createEvenement(evenement));
		}
		return ResponseEntity.badRequest().build();
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<Evenement> deleteEvenement(@PathVariable Long id) {
		if (id != null) {
			return ResponseEntity.ok().body(this.services.deleteEvenement(id));
		}
		return ResponseEntity.badRequest().build();
	}
}
