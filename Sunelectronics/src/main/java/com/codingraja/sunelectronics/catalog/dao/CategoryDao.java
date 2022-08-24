package com.codingraja.sunelectronics.catalog.dao;

import java.util.List;

import com.codingraja.sunelectronics.catalog.domain.Category;

public interface CategoryDao {
	public Category saveCategory(Category category);
	public void removeCategory(Category category);
	public Category findCategoryById(Long categoryId);
	public Category findCategoryByName(String categoryName);
	public List<Category> findCategoriesByName(String categoryName);
	public List<Category> findCategoriesByName(String categoryName, int limit);
	public List<Category> findAllCategories();
	public List<Category> findAllCategories(int limit);
}
