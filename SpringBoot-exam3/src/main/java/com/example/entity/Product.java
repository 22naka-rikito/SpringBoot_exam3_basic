package com.example.entity;

public class Product{
	private Integer productId;
	private String productName;
	private Integer price;
	
	public Integer getProductId() {
		return this.productId;
	}
	
	public void setProductId(Integer productId) {
		this.productId = productId;
	}
	
	public String getProductName() {
		return this.productName;
	}
	
	public void setProductName(String productName) {
		this.productName = productName;
	}
	
	public Integer getPrice() {
		return this.price;
	}
	
	public void setPrice(Integer price) {
		this.price = price;
	}
}