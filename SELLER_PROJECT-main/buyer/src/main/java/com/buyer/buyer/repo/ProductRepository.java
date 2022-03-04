package com.buyer.buyer.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.buyer.buyer.model.Product;

@Component
@Repository
public interface ProductRepository extends JpaRepository<Product, Integer>{
	
	List<Product> findByNameStartingWith(String name);
}
