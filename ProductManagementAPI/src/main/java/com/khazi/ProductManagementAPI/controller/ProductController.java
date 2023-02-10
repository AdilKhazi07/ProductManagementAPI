package com.khazi.ProductManagementAPI.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.khazi.ProductManagementAPI.entity.Product;
import com.khazi.ProductManagementAPI.service.ProductService;

@RestController
public class ProductController {
	@Autowired
	ProductService service;
	@PostMapping("/saveProduct")
	public Product saveProduct(@RequestBody Product product) {
		return service.save(product);
	}
	@GetMapping("/saveProduct")
	public List<Product> getAll() {
		return service.getAllProduct();
	}
	@GetMapping("/saveProduct/{id}")
	public Product getByid(@PathVariable("id") int id) {
		return service.getProductById(id);
	}
	@DeleteMapping("/saveProduct")
	public Product deleteProduct(@RequestBody int id) {
		return service.delete(id);
		
	}
	@PutMapping("/saveProduct")
	public Product updateProduct(@RequestBody Product product) {
		return service.updateProduct(product);
	}
	

}
