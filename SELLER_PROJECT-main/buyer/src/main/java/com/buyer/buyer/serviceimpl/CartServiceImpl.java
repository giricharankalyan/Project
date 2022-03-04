package com.buyer.buyer.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.buyer.buyer.model.Cart;
import com.buyer.buyer.repo.CartRepository;
import com.buyer.buyer.service.CartService;
@Component
public class CartServiceImpl implements CartService {
	
	@Autowired
	CartRepository repo;

	@Override
	public Cart addCart(Cart cart) {
		return repo.save(cart);
	}

	@Override
	public Cart updateCart(Cart cart) {
		return repo.save(cart);
	}

	@Override
	public void deleteCart(int buyerId) {
		Iterable<Cart> carts = repo.findByBuyerId(buyerId);
		 repo.deleteAll(repo.findByBuyerId(buyerId));
	}

	@Override
	public List<Cart> getCart(int buyerId) {
		return repo.findByBuyerId(buyerId);
	}

}
