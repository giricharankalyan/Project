package com.buyer.buyer.service;

import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.buyer.buyer.model.Cart;
@Component
@Service
public interface CartService {

		public Cart addCart(Cart cart);
		public  Cart updateCart(Cart cart);
		public void deleteCart(int buyerId);
		public List<Cart> getCart(int buyerId);

}
