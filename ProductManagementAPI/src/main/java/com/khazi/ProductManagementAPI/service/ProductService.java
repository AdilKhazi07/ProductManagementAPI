package com.khazi.ProductManagementAPI.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.khazi.ProductManagementAPI.dao.ProductDAO;
import com.khazi.ProductManagementAPI.entity.Charges;
import com.khazi.ProductManagementAPI.entity.Product;

@Service
public class ProductService {

	@Autowired
	ProductDAO dao;
	
	public Product businessLogic(Product pro) {
		
		Charges charges = pro.getCharges();
		Integer discount = charges.getDiscount();
		pro.setDiscount(pro.getProductPrice()*( discount/100));
		System.out.println(discount);
		pro.setFinalPrice((pro.getProductPrice()-discount)+charges.getDeliveryCharge());
		return pro;
	}
	

	public Product save(Product product) {
		Product product2 = businessLogic(product);
		return dao.saveProduct(product2);
		
	}

	public Product updateProduct(Product product) {
		return dao.updateProduct(product);
	}

	public Product getProductById(int id) {
		Product basePrice=dao.getProductById(id);
		
		return dao.getProductById(id);
	}

	public List<Product> getAllProduct() {
		return dao.getAllProduct();
	}

	public Product delete(int id) {
		return dao.delete(id);
	}

}
