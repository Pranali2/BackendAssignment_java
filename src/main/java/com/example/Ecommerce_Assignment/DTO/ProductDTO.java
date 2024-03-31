package com.example.Ecommerce_Assignment.DTO;

public class ProductDTO {

	private long product_id;
	private String product_title;
	private float product_price;
	private String product_description;
	private String product_availability;
	private long category_id;
	public long getProduct_id() {
		return product_id;
	}
	public void setProduct_id(long l) {
		this.product_id = l;
	}
	public String getProduct_title() {
		return product_title;
	}
	public void setProduct_title(String product_title) {
		this.product_title = product_title;
	}
	public float getProduct_price() {
		return product_price;
	}
	public void setProduct_price(float product_price) {
		this.product_price = product_price;
	}
	public String getProduct_description() {
		return product_description;
	}
	public void setProduct_description(String product_description) {
		this.product_description = product_description;
	}
	public String getProduct_availability() {
		return product_availability;
	}
	public void setProduct_availability(String product_availability) {
		this.product_availability = product_availability;
	}
	public long getCategory_id() {
		return category_id;
	}
	public void setCategory_id(Long long1) {
		this.category_id = long1;
	}
	
}
