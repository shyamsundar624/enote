package com.shyam.enotes.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import com.shyam.enotes.entity.Category;
import com.shyam.enotes.repository.CategoryRepository;
import com.shyam.enotes.service.CategoryService;

@Service
public class CategoryServiceImpl implements CategoryService {

	@Autowired
	private CategoryRepository categoryRepository;

	@Override
	public boolean saveCategory(Category category) {
		
		category.setDeleted(false);
		Category saveCategory = categoryRepository.save(category);
		if (ObjectUtils.isEmpty(saveCategory)) {
			return false;
		}
		return true;
	}

	@Override
	public List<Category> getAllCategory() {
List<Category> all = categoryRepository.findAll();

		return all;
	}

}
