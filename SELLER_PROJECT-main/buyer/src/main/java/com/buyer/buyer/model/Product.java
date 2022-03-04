package com.buyer.buyer.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.stereotype.Component;


@Entity
@Table(name="Product")
public class Product {
	@Id
	@Column(name="productId")
	private int productId;
	
	@Column(name="name")
	private String name;
	
	@Column(name="model")
	private String model;
	
	@Column(name="category")
	private String category;
	
	@Column(name="subCategory")
	private String subCategory;
	
	@Column(name="price")
	private float price;
	
	@Column(name="quantity")
	private int quantity;
	
	@Column(name="specification")
	private String specification;
	
	@Column(name="sellerId")
	private int sellerId;
	
	@Column(name="status")
	private boolean status;

	public int getProductId() {
		return productId;
	}

	public void setProductId(int id) {
		this.productId = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getSubCategory() {
		return subCategory;
	}

	public void setSubCategory(String subCategory) {
		this.subCategory = subCategory;
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

	public String getSpecification() {
		return specification;
	}

	public void setSpecification(String specification) {
		this.specification = specification;
	}

	public int getSellerId() {
		return sellerId;
	}

	public void setSellerId(int sellerId) {
		this.sellerId = sellerId;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}
	



	
}
