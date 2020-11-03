package com.cook.bio.business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cook.bio.dao.CartRepository;
import com.cook.bio.dao.CategoryRepository;
import com.cook.bio.dao.EvenementRepository;
import com.cook.bio.dao.ProductRespository;
import com.cook.bio.dao.UserRepository;
import com.cook.bio.models.Cart;
import com.cook.bio.models.Category;
import com.cook.bio.models.Evenement;
import com.cook.bio.models.Product;
import com.cook.bio.models.User;

@Service
public class ServicesCookAndBio implements Services {

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

	public List<Cart> getCart(Long idUser) {
		if (idUser != null) {
			return this.cartRepository.findByUser(idUser);
		}
		return null;
	}

	public User getUser(String username, String password) {
		List<User> list = this.userRepository.findAll();
		
		for (User user : list) {
			if(user.getEmail().toLowerCase().equals(username.toLowerCase()) && user.getPassword().toLowerCase().equals(password.toLowerCase())) {
				
				return user;
			}
		}
		return null;
	}

	public List<Product> getProducts() {

		return this.productRespository.findAll();
	}

	public Product getProduct(Long id) {
		if (id != null) {
			return this.productRespository.getOne(id);
		}
		return null;
	}
	public Product createProduct(Product product) {

		if (product != null) {
			return this.productRespository.save(product);
		}
		return null;
	}

	public void updateProduct(Product product) {

		if (product != null) {
			this.productRespository.save(product);
		}
	}

	public void deleteProduct(Long id) {

		if (id != null) {
			this.productRespository.deleteById(id);
			;
		}
	}

	public List<Evenement> getEvenements() {
		return this.evenementRepository.findAll();
	}

	public Evenement createEvenement(Evenement evenement) {
		if (evenement != null) {
			return this.evenementRepository.save(evenement);
		}
		return null;
	}

	public Evenement deleteEvenement(Long id) {

		if (id != null) {
			this.evenementRepository.deleteById(id);
		}
		return null;
	}

	public List<Category> getCategories() {
		return this.categoryRepository.findAll();
	}

	public Evenement getEvenement(Long id) {
		if (id != null) {
			return this.evenementRepository.getOne(id);
		}
		return null;
	}

}
