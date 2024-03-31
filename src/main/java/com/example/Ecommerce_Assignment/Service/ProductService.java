package com.example.Ecommerce_Assignment.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Ecommerce_Assignment.DTO.ProductDTO;
import com.example.Ecommerce_Assignment.Model.Category;
import com.example.Ecommerce_Assignment.Model.Product;
import com.example.Ecommerce_Assignment.Repository.ProductRepo;

@Service
public class ProductService {
	@Autowired
	ProductRepo productRepo;

	public void createProduct(ProductDTO productdTO, Category category) {
		// TODO Auto-generated method stub
		
		Product product=new Product();
		product.setProduct_title(productdTO.getProduct_title());
		product.setProduct_price(productdTO.getProduct_price());
		product.setProduct_description(productdTO.getProduct_description());
		product.setProduct_availability(productdTO.getProduct_availability());
		product.setCategory(category);
		productRepo.save(product);
	}

	public ProductDTO getProductDTO(Product product) {
		ProductDTO productDTO=new ProductDTO();
		productDTO.setProduct_id(product.getProduct_id());
		productDTO.setProduct_title(product.getProduct_title());
		productDTO.setProduct_price(product.getProduct_price());
		productDTO.setProduct_description(product.getProduct_description());
		productDTO.setProduct_availability(product.getProduct_availability());
		productDTO.setCategory_id(product.getCategory().getCategory_id());
		
		return productDTO;
	}
	public List<ProductDTO> getAllProduct() {
		// TODO Auto-generated method stub
		List<Product> allProducts= productRepo.findAll();
		List<ProductDTO> productDTO= new ArrayList<>();
		for(Product product:allProducts)
		{
			productDTO.add(getProductDTO(product));
		}
		return productDTO;
	}

	public ProductDTO getProduct(ProductDTO productdTO, int product_id) {
		// TODO Auto-generated method stub
		
		 Optional<Product> geProduct= productRepo.findById(product_id);
		 /*Product product= getProduct.get();
		 
		 product.setProduct_title(productdTO.getProduct_title());
		 product.setProduct_price(productdTO.getProduct_price());
		 product.setProduct_description(productdTO.getProduct_description());
		 product.setProduct_availability(productdTO.getProduct_availability());
		 
		 return product;
		 */
		 Product product= geProduct.get();
		 ProductDTO productDTO=new ProductDTO();
			productDTO.setProduct_id(product.getProduct_id());
			productDTO.setProduct_title(product.getProduct_title());
			productDTO.setProduct_price(product.getProduct_price());
			productDTO.setProduct_description(product.getProduct_description());
			productDTO.setProduct_availability(product.getProduct_availability());
			productDTO.setCategory_id(product.getCategory().getCategory_id());
			
			return productDTO;
		
		
	}

}
