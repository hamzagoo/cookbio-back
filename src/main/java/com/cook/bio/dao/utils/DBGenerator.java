package com.cook.bio.dao.utils;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cook.bio.dao.CartRepository;
import com.cook.bio.dao.CategoryRepository;
import com.cook.bio.dao.EvenementRepository;
import com.cook.bio.dao.ProductRespository;
import com.cook.bio.dao.UserRepository;
import com.cook.bio.models.Category;
import com.cook.bio.models.Evenement;
import com.cook.bio.models.Participant;
import com.cook.bio.models.Product;
import com.cook.bio.models.User;

@Component
public class DBGenerator {

	@Autowired
	private CartRepository cartRepository;
	@Autowired
	private ProductRespository productRespository;
	@Autowired
	private UserRepository userRepository;
	@Autowired
	private EvenementRepository evenementRepository;
	@Autowired
	private CategoryRepository categoryRepository;
	
	public void generateUsers() {
		User manager = new User((long) 1, "manager@manager.com", "manager", "manager", "MANAGER");
		User client = new User((long) 1, "client@client.com", "client", "client", "CLIENT");
	
		userRepository.save(manager);
		userRepository.save(client);
	}

	public void generateProducts() {
		List<Product> products = new ArrayList<Product>();
		Category category = new Category();
		category.setName("category 1");
		Category category2 = new Category();
		category.setName("category 1");
		Category category3 = new Category();
		category.setName("category 1");
		
		Product product1 = new Product((long) 1, "Product 1", "product 1", "../../../assets/images/p1.jpg", (double) 200, 20, category);
		Product product2 = new Product((long) 2, "Product 2", "product 2", "../../../assets/images/p2.jpg", (double) 100, 55, category3);
		Product product3 = new Product((long) 3, "Product 3", "product 3", "../../../assets/images/p3.jpg", (double) 200, 40, category2);
		Product product4 = new Product((long) 4, "Product 4", "product 4", "../../../assets/images/p4.jpg", (double) 25, 55, category3);
		Product product5 = new Product((long) 5, "Product 5", "product 5", "../../../assets/images/p5.jpg", (double) 40, 30, category2);

		products.add(product1);
		products.add(product2);
		products.add(product3);
		products.add(product4);
		products.add(product5);
		productRespository.saveAll(products);
	}
	public void generateEvents() {
		List<Evenement> events = new ArrayList<Evenement>();
		List<Participant> participants = new ArrayList<Participant>();
		Participant participant = new Participant(null, "participant 1", "participant 1", "participant 1 email", "participant 1 phone");
		Participant participant2 = new Participant(null, "participant 2", "participant2", "participant 2 email", "participant2 phone");
		participants.add(participant);
		participants.add(participant2);
		
		Evenement evenement1 = new Evenement((long) 1, "Evenement 1", "Vendredi 11 Novembre 2020", "events descriptions",
				"4", participants, "events category");
		Evenement evenement2 = new Evenement((long) 2, "Evenement 2", "Vendredi 11 Novembre 2020", "events descriptions",
				"5", participants, "events category");
		Evenement evenement3 = new Evenement((long) 3, "Evenement 3", "Vendredi 11 Novembre 2020", "events descriptions",
				"6", participants, "events category");

		events.add(evenement1);
		events.add(evenement2);
		events.add(evenement3);
		evenementRepository.saveAll(events);
	}
}
