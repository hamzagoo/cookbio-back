package com.cook.bio.business;

import java.util.List;

import com.cook.bio.models.Cart;
import com.cook.bio.models.Product;
import com.cook.bio.models.User;

public interface Services {

	public List<Cart> getCart(Long idUser);

	public User getUser(String username, String password);

	public List<Product> getProducts();

	public void createProduct(Product product);

	public void updateProduct(Product product);

	public void deleteProduct(Product product);
}
