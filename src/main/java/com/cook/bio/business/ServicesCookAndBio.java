package com.cook.bio.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cook.bio.dao.CartRepository;
import com.cook.bio.dao.ProductRespository;
import com.cook.bio.dao.UserRepository;

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

}
