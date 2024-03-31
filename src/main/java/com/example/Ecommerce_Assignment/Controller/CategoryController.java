package com.example.Ecommerce_Assignment.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Ecommerce_Assignment.Model.Category;
import com.example.Ecommerce_Assignment.Service.CategoryService;

@RestController
@RequestMapping("/category")
public class CategoryController {
	
	@Autowired
	CategoryService categoryService;
	
	@GetMapping("/")
	public String demo()
	{
		return "demo.jsp";
	}

	//Create Catgeory
	@PostMapping("/createCategory")
	public Category createCategory(Category category)
	{
		categoryService.createCategory(category);
		return category;
	}
	
	//Listing of category
	@GetMapping("/getCategory")
	public List<Category> getCategory()
	{
		
		  return categoryService.getCategory();
	}
    
	
	//Update category by id
	@PostMapping("/updateCategoryById/{category_id}")
	public String updateCategoryById(@PathVariable ("category_id") int category_id, Category category)
	{
		
		if(categoryService.findById(category_id))
				{
		            categoryService.updateCategoryById(category_id, category);
		            return "Category updated";
		        }
		
	    else
			 return "Category Id not present";
	}

}
