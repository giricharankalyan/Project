package com.buyer.buyer.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.buyer.buyer.model.Product;
import com.buyer.buyer.repo.ProductRepository;
import com.buyer.buyer.service.ProductService;
@Component
public class ProductServiceImpl implements ProductService{

	@Autowired
	ProductRepository repo;
	@Override
	public Product addProduct(Product product) {
		return repo.save(product);
	}

	@Override
	public Product updateProduct(Product product) {
		return repo.save(product);	}

	@Override
	public List<Product> getProduct() {
		return repo.findAll();
	}

	@Override
	public Product getProduct(int id) {
		return repo.findById(id).get();
	}

	@Override
	public void deleteProduct(int id) {
		 repo.delete(repo.findById(id).get());
	}

	@Override
	public List<Product> findByName(String name) {
		return repo.findByNameStartingWith(name);
	}

}
