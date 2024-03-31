package com.example.Ecommerce_Assignment.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Ecommerce_Assignment.Model.Cart;
import com.example.Ecommerce_Assignment.Repository.CartRepo;
import com.example.Ecommerce_Assignment.Repository.CategoryRepo;

@Service
public class CartService {

	@Autowired
	CartRepo cartRepo;

	public void addToCart(Cart cart) {
		// TODO Auto-generated method stub
		cartRepo.save(cart);
	}

	public List<Cart> viewCart() {
		// TODO Auto-generated method stub
		return cartRepo.findAll();
	}

	public boolean findById(long product_id) {
		// TODO Auto-generated method stub
		return cartRepo.findById(product_id).isPresent();
	}

	public void updateQuantity(long product_id, Integer quantity) {
		// TODO Auto-generated method stub
		
		Cart cart=cartRepo.getById(product_id);
		cart.setQuantity(quantity);
		cartRepo.save(cart);
	}

	public void removeProduct(long product_id) {
		// TODO Auto-generated method stub
		cartRepo.deleteById(product_id);
	}

	
}
