package com.buyer.buyer.service;

import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.buyer.buyer.model.Product;

@Component
@Service
public interface ProductService {
	public Product addProduct(Product product);
	public  Product updateProduct(Product product);
	 public List<Product> getProduct();
	public Product getProduct(int id);
	 public void deleteProduct(int id);
	 public List<Product> findByName(String name);

}
