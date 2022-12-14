package com.codingraja.sunelectronics.catalog.service;

import java.util.List;

import com.codingraja.sunelectronics.catalog.domain.Product;

public interface CatalogService {
	public Long saveProduct(Product product);
	public Product findProductById(Long productId);
	public List<Product> findProductsByName(String searchName);
	public List<Product> findProductsByName(String searchName, int limit);
	public List<Product> findAllProducts();
	public List<Product> findAllProducts(int limit);
	public List<Product> findProductsByCategory(String category);
	public List<Product> findProductsByCategory(String category, int limit);
	public List<Product> findProductsByCategoryAndManufacturer(String category, String manufacturer, int limit);
	public List<Product> findProductByCategoryAndSubcategory(String category, String subCategory);
	public List<Product> findRelatedProductsByCategory(String category);
	public List<Product> findNewProducts(int limit);
	public List<Product> findPopularProducts(int limit);
}
