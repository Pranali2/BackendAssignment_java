package com.example.Ecommerce_Assignment.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Ecommerce_Assignment.DTO.ProductDTO;
import com.example.Ecommerce_Assignment.Model.Cart;
import com.example.Ecommerce_Assignment.Model.Category;
import com.example.Ecommerce_Assignment.Model.Product;
import com.example.Ecommerce_Assignment.Service.CartService;
import com.example.Ecommerce_Assignment.Service.CategoryService;

@RestController
@RequestMapping("/cart")
public class CartCotroller {

	@Autowired
	CartService cartService;
	
	
	//Add product to the cart
	@PostMapping("/addToCart")
	public String addToCart(Product product,Integer quantity)
	{
		Cart cart= new Cart(product, quantity);
		cartService.addToCart(cart);
		return "Product added to the cart";
	}
	
//View Cart
	@GetMapping("/viewCart")
	public List<Cart> viewCart()
	{
		
		  return cartService.viewCart();
	}
	
//Update Quantity
		@PostMapping("/updateQuantity/{product_id}")
		public String updateQuantity(@PathVariable ("product_id") int product_id, Integer quantity)
		{
			
			if(cartService.findById(product_id))
					{
			            cartService.updateQuantity(product_id, quantity);
			            return "Quantity updated";
			        }
			
		    else
				 return "Product Id not present";
		}
		
//Remove product from cart
		@DeleteMapping("/removeProduct/{product_id}")
		public String removeProduct(@PathVariable long product_id)
		{
			if(cartService.findById(product_id))
			{
			     cartService.removeProduct(product_id);
			
			     return "Product removed from cart";
            }
			
		    else
				 return "Product Id not present";
		
		}

}
