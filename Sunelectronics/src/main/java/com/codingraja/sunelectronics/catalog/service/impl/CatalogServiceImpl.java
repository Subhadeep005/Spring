package com.codingraja.sunelectronics.catalog.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.codingraja.sunelectronics.catalog.dao.CatalogDao;
import com.codingraja.sunelectronics.catalog.domain.Product;
import com.codingraja.sunelectronics.catalog.service.CatalogService;

@Service
public class CatalogServiceImpl implements CatalogService {

	@Autowired
	private CatalogDao catalogDao;

	public CatalogServiceImpl(CatalogDao catalogDao) {
		super();
		this.catalogDao = catalogDao;
	}

	@Override
	@Transactional
	public Long saveProduct(Product product) {
		// TODO Auto-generated method stub
		return catalogDao.saveProduct(product);
	}

	@Override
	@Transactional
	public Product findProductById(Long productId) {
		return catalogDao.findProductById(productId);
	}

	@Override
	public List<Product> findProductsByName(String searchName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Product> findProductsByName(String searchName, int limit) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	@Transactional
	public List<Product> findAllProducts() {
		return this.catalogDao.findAllProducts();
	}

	@Override
	public List<Product> findAllProducts(int limit) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Product> findProductsByCategory(String category) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Product> findProductsByCategory(String category, int limit) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Product> findProductsByCategoryAndManufacturer(String category, String manufacturer, int limit) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	@Transactional
	public List<Product> findRelatedProductsByCategory(String category) {
		return this.catalogDao.findRelatedProductsByCategory(category);
	}

	@Override
	public List<Product> findProductByCategoryAndSubcategory(String category, String subCategory) {
		return this.catalogDao.findProductByCategoryAndSubcategory(category, subCategory);
	}

	@Override
	@Transactional
	public List<Product> findNewProducts(int limit) {
		return this.catalogDao.findNewProducts(limit);
	}

	@Override
	public List<Product> findPopularProducts(int limit) {
		// TODO Auto-generated method stub
		return null;
	}
}
