package com.khazi.ProductManagementAPI.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.khazi.ProductManagementAPI.entity.Product;
import com.khazi.ProductManagementAPI.repository.ProductRepository;
@Repository
public class ProductDAO {

	@Autowired
	ProductRepository repository;

	public Product saveProduct(Product product) {
		return repository.save(product);

	}
	public Product updateProduct(Product product) {
		return repository.save(product);

	}
	public Product getProductById(int id) {
		Optional<Product> optional = repository.findById(id);
		if(optional.isPresent()) {
			return optional.get();
		}
		return null;
	}
	public List<Product> getAllProduct() {
		return repository.findAll();
	}

	public Product delete(int id) {
		Product product=getProductById(id);
		repository.delete(product);
		return product;
	}

}
