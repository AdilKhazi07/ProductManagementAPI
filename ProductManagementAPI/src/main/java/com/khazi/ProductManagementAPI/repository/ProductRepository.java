package com.khazi.ProductManagementAPI.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.khazi.ProductManagementAPI.entity.Product;

public interface ProductRepository extends JpaRepository<Product,Integer>{

}
