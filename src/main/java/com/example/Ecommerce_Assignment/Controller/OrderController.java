package com.example.Ecommerce_Assignment.Controller;

import java.security.Principal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Ecommerce_Assignment.DTO.OrderDTO;
import com.example.Ecommerce_Assignment.Service.OrderRequest;
import com.example.Ecommerce_Assignment.Service.OrderService;

@RestController
@RequestMapping("/order")
public class OrderController {
	@Autowired
	OrderService orderService;
    
	  @PostMapping("/orderCraete")
	public OrderDTO orderCraete(@RequestBody OrderRequest orderRequest ,long id) {
		
		OrderDTO orderDTO=orderService.orderCraete(orderRequest, id);
		return orderDTO;
		
	}
}
