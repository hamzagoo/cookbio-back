package com.cook.bio.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cook.bio.models.Cart;
import com.cook.bio.models.Evenement;

@Repository
public interface EvenementRepository extends JpaRepository<Evenement, Long>  {

}
