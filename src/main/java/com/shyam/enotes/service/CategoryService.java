package com.shyam.enotes.service;

import java.util.List;

import com.shyam.enotes.entity.Category;

public interface CategoryService {

	public boolean saveCategory(Category category);
	public List<Category> getAllCategory();
	
}
