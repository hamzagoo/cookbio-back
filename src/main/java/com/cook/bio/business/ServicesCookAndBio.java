package com.cook.bio.business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cook.bio.dao.CartRepository;
import com.cook.bio.dao.ProductRespository;
import com.cook.bio.dao.UserRepository;
import com.cook.bio.models.Cart;
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
	
	public List<Cart> getCart(Long idUser) {
		if (idUser != null) {
			return this.cartRepository.findByUser(idUser);
		}
		return null;
	}

	
	public User getUser(String username, String password) {
		return null;
	}

	public List<Product> getProducts() {

		return this.productRespository.findAll();
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
			this.productRespository.deleteById(id);;
		}
	}


}
