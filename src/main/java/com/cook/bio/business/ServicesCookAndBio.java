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

	private CartRepository cartRepository;
	private ProductRespository productRespository;
	private UserRepository userRepository;

	@Autowired
	public ServicesCookAndBio(CartRepository cartRepository, ProductRespository productRespository,
			UserRepository userRepository) {
		this.cartRepository = cartRepository;
		this.productRespository = productRespository;
		this.userRepository = userRepository;
	}

	@Override
	public List<Cart> getCart(Long idUser) {
		if (idUser != null) {
			return this.cartRepository.findByUser(idUser);
		}
		return null;
	}

	@Override
	public User getUser(String username, String password) {
		return null;
	}

	@Override
	public List<Product> getProducts() {

		return this.productRespository.findAll();
	}

	@Override
	public void createProduct(Product product) {

		if (product != null) {
			this.productRespository.save(product);
		}
	}

	@Override
	public void updateProduct(Product product) {

		if (product != null) {
			this.productRespository.save(product);
		}
	}

	@Override
	public void deleteProduct(Product product) {

		if (product != null) {
			this.productRespository.delete(product);
		}
	}

}
