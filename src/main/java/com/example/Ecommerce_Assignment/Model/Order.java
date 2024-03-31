package com.example.Ecommerce_Assignment.Model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "Order")
public class Order {
  
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long orderId;
	private String orderStatus;
	private String paymentStatus;
	private Double orderAmount;
	private LocalDate orderDelivered;
	private String billingAddress;

	@OneToMany(mappedBy = "order", cascade  = CascadeType.ALL )
	private Set<OrderItem> orderItems=new HashSet<>();
    
	
	public Order() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Order(Long orderId, String orderStatus, String paymentStatus, Double orderAmount, LocalDate orderDelivered,
			String billingAddress, Set<OrderItem> orderItems) {
		super();
		this.orderId = orderId;
		this.orderStatus = orderStatus;
		this.paymentStatus = paymentStatus;
		this.orderAmount = orderAmount;
		this.orderDelivered = orderDelivered;
		this.billingAddress = billingAddress;
		this.orderItems = orderItems;
	}

	public Long getOrderId() {
		return orderId;
	}

	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}

	public String getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}

	public String getPaymentStatus() {
		return paymentStatus;
	}

	public void setPaymentStatus(String paymentStatus) {
		this.paymentStatus = paymentStatus;
	}

	public Double getOrderAmount() {
		return orderAmount;
	}

	public void setOrderAmount(Double orderAmount) {
		this.orderAmount = orderAmount;
	}

	public LocalDate getOrderDelivered() {
		return orderDelivered;
	}

	public void setOrderDelivered(LocalDate orderDelivered) {
		this.orderDelivered = orderDelivered;
	}

	public String getBillingAddress() {
		return billingAddress;
	}

	public void setBillingAddress(String billingAddress) {
		this.billingAddress = billingAddress;
	}

	public Set<OrderItem> getOrderItems() {
		return orderItems;
	}

	public void setOrderItems(Set<OrderItem> orderItems) {
		this.orderItems = orderItems;
	}

	
	
	
	
	
}
