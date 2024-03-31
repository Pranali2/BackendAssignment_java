package com.example.Ecommerce_Assignment.Service;

import java.time.LocalDate;
import java.util.Optional;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Ecommerce_Assignment.DTO.OrderDTO;
import com.example.Ecommerce_Assignment.Model.Cart;
import com.example.Ecommerce_Assignment.Model.CartItem;
import com.example.Ecommerce_Assignment.Model.Order;
import com.example.Ecommerce_Assignment.Model.OrderItem;
import com.example.Ecommerce_Assignment.Model.User;
import com.example.Ecommerce_Assignment.Repository.CartRepo;
import com.example.Ecommerce_Assignment.Repository.OrderRepo;
import com.example.Ecommerce_Assignment.Repository.UserRepo;

@Service
public class OrderService {
	@Autowired
	OrderRepo orderRepo;
	@Autowired
	private UserRepo userRepo;
	@Autowired
	private CartRepo cartRepo;
	
	private ModelMapper modelMapper;


	public OrderDTO orderCraete(OrderRequest request ,Long id)
	{
		Optional<User> user=userRepo.findById(id);
		long cart_id=request.getCartId();
		String orderAddress=request.getOrderAddress();
		Optional<Cart> cartOptional=cartRepo.findById(cart_id);
		Cart cart=cartOptional.get();
		Set<CartItem> item=cart.getItem();
		Order order= new Order();
		AtomicReference<Double> totalOrderPrice= new AtomicReference<Double>(0.0);
		
		Set<OrderItem> orderItems=item.stream().map((cartItem)->{
			OrderItem orderItem= new OrderItem();
			orderItem.setProduct(cartItem.getProduct());
			orderItem.setProductQuantity(cartItem.getQuanity());
			orderItem.setTotalProductPrice(cartItem.getTotoalPrice());
			orderItem.setOrder(order);
			totalOrderPrice.set(totalOrderPrice.get()+orderItem.getTotalProductPrice());
			long productId= orderItem.getProduct().getProduct_id();
			
			return orderItem;
			
			}).collect(Collectors.toSet());
		
		order.setBillingAddress(orderAddress);
		order.setOrderAmount(totalOrderPrice.get());
		order.setOrderDelivered(null);
		order.setOrderStatus("Created");
		order.setOrderItems(orderItems);
		cart.getItem().clear();
		Cart savedCart=cartRepo.save(cart);
		
		return this.modelMapper.map(savedCart, OrderDTO.class);
		
	}
}
