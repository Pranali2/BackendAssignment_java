package com.example.Ecommerce_Assignment.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Ecommerce_Assignment.Model.Category;
import com.example.Ecommerce_Assignment.Model.Order;

@Repository
public interface OrderRepo extends JpaRepository<Order, Long> {

}
