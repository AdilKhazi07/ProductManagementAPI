package com.khazi.ProductManagementAPI.entity;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Product implements Serializable {
	@Id
	@Column(name = "Product ID")
	private Integer productId;
	@Column(name = "Product Name")
	private String productName;
	@Column(name = "Product Type")
	private String productType;
	@Column(name = "Product Category")
	private String productCategory;
	@Column(name = "Product Price")
	private Double productPrice;
	private Double discount;
	@Column(name = "Final Price")
	private Double finalPrice;
	@OneToOne
	private Charges charges;

	public Double getFinalPrice() {
		return finalPrice;
	}

	public void setFinalPrice(Double finalPrice) {
		this.finalPrice = finalPrice;
	}

	public Charges getCharges() {
		return charges;
	}

	public void setCharges(Charges charges) {
		this.charges = charges;
	}

	public Integer getProductId() {
		return productId;
	}

	public void setProductId(Integer productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductType() {
		return productType;
	}

	public void setProductType(String productType) {
		this.productType = productType;
	}

	public String getProductCategory() {
		return productCategory;
	}

	public void setProductCategory(String productCategory) {
		this.productCategory = productCategory;
	}

	public Double getDiscount() {
		return discount;
	}

	public void setDiscount(double d) {
		this.discount = d;
	}

	public Double getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(Double productPrice) {
		this.productPrice = productPrice;
	}

	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", productType=" + productType
				+ ", productCategory=" + productCategory + ", productPrice=" + productPrice + ", discount=" + discount
				+ ", finalPrice=" + finalPrice + ", charges=" + charges + "]";
	}

}
