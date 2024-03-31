package com.example.Ecommerce_Assignment.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Ecommerce_Assignment.Model.Category;
import com.example.Ecommerce_Assignment.Repository.CategoryRepo;




@Service
public class CategoryService {
	
@Autowired
CategoryRepo categoryRepo;
	
 public void createCategory(Category category)
	{
		categoryRepo.save(category);
	}
   
 public List<Category> getCategory()
	{
		return categoryRepo.findAll();
	}
 
 public void updateCategoryById(long id, Category updateCategory)
 {
	 Category category= categoryRepo.getById(id);
	 category.setCategory_id(updateCategory.getCategory_id());
	 category.setCategory_name(updateCategory.getCategory_name());
	 category.setCategory_description(updateCategory.getCategory_description());
	 
	 categoryRepo.save(updateCategory);
 }

public boolean findById(int category_id) {
	// TODO Auto-generated method stub
	return categoryRepo.findById((long) category_id).isPresent();
}
}
