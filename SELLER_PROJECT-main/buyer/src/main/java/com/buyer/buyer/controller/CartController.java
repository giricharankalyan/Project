package com.buyer.buyer.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.buyer.buyer.model.Cart;
import com.buyer.buyer.service.CartService;


@RestController
@RequestMapping("/Cart")
public class CartController {
	
	@Autowired
	public CartService service;

	@GetMapping("/get/{buyerId}")
	public ResponseEntity<Cart> getProduct(@PathVariable int buyerId) {
		return new ResponseEntity(service.getCart(buyerId),HttpStatus.ACCEPTED);
	}

	@PostMapping("/add")
	public Cart createCart(@RequestBody Cart cart) {
		System.out.println("Called /AddCart " + " BuyerId=" +cart.getBuyerId() + " ProductId="+ cart.getProductId()+ 
		" Quantity="+ cart.getQuantity() + " Price="+ cart.getPrice() );
		return service.addCart(cart);
	}
	
	@PutMapping("/update")
	public Cart updateCart(@RequestBody Cart cart) {
		System.out.println("Called /UpdateCart " + " BuyerId=" +cart.getBuyerId() + " ProductId="+ cart.getProductId()+ 
		" Quantity="+ cart.getQuantity() + " Price="+ cart.getPrice() );
		return service.addCart(cart);
	}
	
	@DeleteMapping("/empty/{buyerId}")
	public void deleteCart(@PathVariable int buyerId) {
		System.out.println("Called /EmptyCart " + " BuyerId=" + buyerId );
		 service.deleteCart(buyerId);
	}
	
	

}
