package com.cook.bio.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cook.bio.models.Cart;
import com.cook.bio.models.User;

@Repository
public interface CartRepository extends JpaRepository<Cart, Long> {

	public List<Cart> findByUser(Long idUser);
}
