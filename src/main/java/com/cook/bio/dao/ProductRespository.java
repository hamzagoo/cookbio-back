package com.cook.bio.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cook.bio.models.Product;

@Repository
public interface ProductRespository extends JpaRepository<Product, Long> {

}
