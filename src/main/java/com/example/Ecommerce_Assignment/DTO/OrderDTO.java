package com.example.Ecommerce_Assignment.DTO;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.example.Ecommerce_Assignment.Model.OrderItem;

import jakarta.persistence.CascadeType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;



public class OrderDTO {
	

	private Long orderId;
	private String orderStatus;
	private String paymentStatus;
	private Double orderAmount;
	private LocalDate orderDelivered;
	private String billingAddress;
	private Set<OrderItemDTO> orderItems=new HashSet<>();
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
	public Set<OrderItemDTO> getOrderItems() {
		return orderItems;
	}
	public void setOrderItems(Set<OrderItemDTO> orderItems) {
		this.orderItems = orderItems;
	}
    
}