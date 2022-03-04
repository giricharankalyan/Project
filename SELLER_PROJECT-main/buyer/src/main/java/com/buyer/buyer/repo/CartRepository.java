package com.buyer.buyer.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.buyer.buyer.model.Cart;
import com.buyer.buyer.model.CartId;
@Component
@Repository
public interface CartRepository extends JpaRepository<Cart, CartId> {

	List<Cart> findByBuyerId(int buyerId);
}
