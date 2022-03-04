package com.buyer.buyer.model;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Cart")
@IdClass(CartId.class)
public class Cart implements Serializable{
	@Id
	@Column(name="buyerId")
	private int buyerId;
	
	@Column(name="productId")
	private int productId;
	
	@Column(name="quantity")
	private int quantity;
	
	@Column(name="price")
	private float price;
	
	
	public Cart() {
		
	}
	public Cart(int buyerId, int productId, int quantity, float price) {
		super();
		this.buyerId = buyerId;
		this.productId = productId;
		this.quantity = quantity;
		this.price = price;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
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
	

}
