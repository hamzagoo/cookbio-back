package com.cook.bio.business;

import java.util.List;

import com.cook.bio.models.Cart;
import com.cook.bio.models.Category;
import com.cook.bio.models.Evenement;
import com.cook.bio.models.Product;
import com.cook.bio.models.User;

public interface Services {

	public List<Cart> getCart(Long idUser);

	public User getUser(String username, String password);

	public List<Product> getProducts();

	public Product getProduct(Long id);
	public Product createProduct(Product product);

	public void updateProduct(Product product);

	public void deleteProduct(Long id);

	public List<Evenement> getEvenements();

	public Evenement createEvenement(Evenement evenement);

	public Evenement deleteEvenement(Long id);

	public List<Category> getCategories();

	public Evenement getEvenement(Long id);
}
