package com.khazi.ProductManagementAPI.entity;

import java.io.Serializable;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
@Entity
public class Charges implements Serializable{
	@Id
	private Integer id;
	@Column(name = "Product Category")
	private String productCategory;
	private Integer discount;
	private Integer gst;
	@Column(name = "Delivery Charge")
	private Integer deliveryCharge;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getProductCategory() {
		return productCategory;
	}
	public void setProductCategory(String productCategory) {
		this.productCategory = productCategory;
	}
	public Integer getDiscount() {
		return discount;
	}
	public void setDiscount(Integer discount) {
		this.discount = discount;
	}
	public Integer getGst() {
		return gst;
	}
	public void setGst(Integer gst) {
		this.gst = gst;
	}
	public Integer getDeliveryCharge() {
		return deliveryCharge;
	}
	public void setDeliveryCharge(Integer deliveryCharge) {
		this.deliveryCharge = deliveryCharge;
	}
	
	
	
}
