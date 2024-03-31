package com.example.Ecommerce_Assignment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
@EnableAutoConfiguration
public class EcommerceAssignmentApplication {

	public static void main(String[] args) {
		SpringApplication.run(EcommerceAssignmentApplication.class, args);
		System.out.println("hello");
	}

}
