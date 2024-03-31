package com.example.Ecommerce_Assignment.Model;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "Cart")
public class Cart {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long cart_id;

    @ManyToOne
    @JoinColumn(name="product_id")
    Product product;
    private Integer quantity;
    @OneToMany
    private  Set<CartItem> item= new HashSet<>();
    private User user;
    
    
    public Cart()
    {
    	
    }
	public Cart(Product product) {
		
		this.product = product;
	}
	

	public Cart(Product product, Integer quantity) {
		super();
		this.product = product;
		this.quantity = quantity;
	}
	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

    

	public Long getCart_id() {
		return cart_id;
	}

	public void setCart_id(Long cart_id) {
		this.cart_id = cart_id;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}
	public Set<CartItem> getItem() {
		return item;
	}
	public void setItem(Set<CartItem> item) {
		this.item = item;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	
	
    
}
