package com.example.Ecommerce_Assignment.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Ecommerce_Assignment.DTO.ProductDTO;
import com.example.Ecommerce_Assignment.Model.Category;
import com.example.Ecommerce_Assignment.Model.Product;
import com.example.Ecommerce_Assignment.Repository.CategoryRepo;
import com.example.Ecommerce_Assignment.Service.ProductService;


@RestController
@RequestMapping("/product")
public class ProductController {
	@Autowired
	ProductService productService;
	
	@Autowired
	CategoryRepo categoryRepo;
	
	//Create product
	@PostMapping("/createProduct")
	public String createProduct(ProductDTO productdTO)
	{
		Optional<Category> category=categoryRepo.findById(productdTO.getCategory_id());
		
		if(category.isPresent())
				{

			        productService.createProduct(productdTO, category.get());
		            return "Product has been updated";
		        }
		
	    else
			 return "Category Id not present";
	}
	
	//All product listing
	@GetMapping("/getAllProduct")
	public List<ProductDTO> getAllProduct()
	{
		
		  return productService.getAllProduct();
	}	
	
	
	//Get Product deatils By Id
	@GetMapping("/getProductById/{product_id}")
	public ProductDTO getProductById(@PathVariable ("product_id") int product_id, ProductDTO productdTO)
	{
	        return productService.getProduct(productdTO, product_id);	      
	  
	}
}
