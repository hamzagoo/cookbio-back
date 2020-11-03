package com.cook.bio.models;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Table
@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Cart implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -1312800816949015565L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private User user;
	
	@OneToMany(cascade =CascadeType.ALL, fetch = FetchType.LAZY)
	private List<Product> products;
	
	private Double total;

	public Cart() {
	}

	public Cart(User user, List<Product> products, Double total) {
		this.user = user;
		this.products = products;
		this.total = total;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}

	public Double getTotal() {
		return total;
	}

	public void setTotal(Double total) {
		this.total = total;
	}
}
