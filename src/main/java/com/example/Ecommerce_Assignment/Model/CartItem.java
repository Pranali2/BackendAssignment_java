package com.example.Ecommerce_Assignment.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "CartItems")
public class CartItem {

	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 private long cartItemId;
	 private int quanity;
	 private double totoalPrice;
	 @ManyToOne
	 private Cart cart;
	 private Product product;
	 public long getCartItemId() {
		return cartItemId;
	}
	public void setCartItemId(long cartItemId) {
		this.cartItemId = cartItemId;
	}
	public int getQuanity() {
		return quanity;
	}
	public void setQuanity(int quanity) {
		this.quanity = quanity;
	}
	public double getTotoalPrice() {
		return totoalPrice;
	}
	public void setTotoalPrice(double totoalPrice) {
		this.totoalPrice = totoalPrice;
	}
	public Cart getCart() {
		return cart;
	}
	public void setCart(Cart cart) {
		this.cart = cart;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	 
}
