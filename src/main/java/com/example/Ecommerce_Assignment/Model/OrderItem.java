package com.example.Ecommerce_Assignment.Model;

import jakarta.persistence.Entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "OrderItem")
public class OrderItem {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long orderItemId;
	
	@OneToOne
	@JoinColumn(name = "product_id")
	private Product product;
	private double totalProductPrice;
	private int productQuantity;
	
	@ManyToOne
	private Order order;
	public OrderItem() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public OrderItem(Long orderItemId, Product product, double totalProductPrice, int productQuantity, Order order) {
		super();
		this.orderItemId = orderItemId;
		this.product = product;
		this.totalProductPrice = totalProductPrice;
		this.productQuantity = productQuantity;
		this.order = order;
	}

	public Long getOrderItemId() {
		return orderItemId;
	}
	public void setOrderItemId(Long orderItemId) {
		this.orderItemId = orderItemId;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	public double getTotalProductPrice() {
		return totalProductPrice;
	}
	public void setTotalProductPrice(double totalProductPrice) {
		this.totalProductPrice = totalProductPrice;
	}
	
	public int getProductQuantity() {
		return productQuantity;
	}
	public void setProductQuantity(int productQuantity) {
		this.productQuantity = productQuantity;
	}
	public Order getOrder() {
		return order;
	}
	public void setOrder(Order order) {
		this.order = order;
	}
	
	
}