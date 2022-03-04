package com.buyer.buyer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.buyer.buyer.model.Product;
import com.buyer.buyer.service.ProductService;

@RestController
@CrossOrigin(origins ="*")
@RequestMapping("/product")
public class ProductController {

	@Autowired
	public ProductService service;

	@GetMapping("/get/{name}")
	public ResponseEntity<Product> getProduct(@PathVariable String name) {
		return new ResponseEntity(service.findByName(name),HttpStatus.ACCEPTED);
	}
	
	@GetMapping("/get/all")
	public ResponseEntity<Product> getProduct() {
		return new ResponseEntity(service.getProduct(),HttpStatus.ACCEPTED);
	}
	
	@PostMapping("/add")
	public Product creatProduct(@RequestBody Product product) {
		System.out.println("Called /AddProduct " + " ProductId=" +product.getProductId() + " ProductPrice="+ product.getPrice()+ 
		" Quantity="+ product.getQuantity() );
		return service.addProduct(product);
	}
	
	@PutMapping("/update")
	public Product updateProduct(@RequestBody Product product) {
		System.out.println("Called /UpdateProduct " + " ProductId=" +product.getProductId() + " ProductPrice="+ product.getPrice()+ 
				" Quantity="+ product.getQuantity() );
				return service.updateProduct(product);
	}
	
	@DeleteMapping("/delete/{productId}")
	public void deleteProduct(@PathVariable int productId) {
		System.out.println("Called /deleteProduct " + " productId=" + productId );
		 service.deleteProduct(productId);
	}
}
