package com.cook.bio.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cook.bio.models.Cart;

@Repository
public interface CartRepository extends JpaRepository<Cart, Long>{

}
