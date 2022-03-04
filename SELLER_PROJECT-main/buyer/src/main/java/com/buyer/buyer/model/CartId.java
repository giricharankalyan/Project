package com.buyer.buyer.model;

import java.io.Serializable;
import java.util.Objects;

import org.springframework.stereotype.Component;
@Component
public class CartId implements Serializable {

	private int buyerId;
	
	private int productId;
	
	public CartId() {
		
	}

	public CartId(int buyerId, int productId) {
		super();
		this.buyerId = buyerId;
		this.productId = productId;
	}

	public int getBuyerId() {
		return buyerId;
	}

	public void setBuyerId(int buyerId) {
		this.buyerId = buyerId;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}
	public boolean equals(Object o) {
		if(this == o) return true;
		if (o==null || getClass() != o.getClass()) return false;
		CartId cartId = (CartId)o;
		return buyerId == cartId.getBuyerId() && productId == cartId.getProductId();
	}
	public int hashCode() {
		return Objects.hash(buyerId,productId);
	}
	
}
