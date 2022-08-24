package com.codingraja.sunelectronics.core.product.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.codingraja.sunelectronics.catalog.domain.Product;
import com.codingraja.sunelectronics.core.product.dao.ProductDao;
import com.codingraja.sunelectronics.core.product.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductDao productDao;

	@Override
	@Transactional
	public Long saveNewProduct(Product product) {
		return this.productDao.saveNewProduct(product);
	}

	@Override
	@Transactional
	public Product findProductById(Long productId) {
		return this.productDao.findProductById(productId);
	}

	@Override
	@Transactional
	public Double findProductPrice(Long productId) {
		return this.productDao.findProductPrice(productId);
	}

	@Override
	@Transactional
	public Integer findProductAvailableQuantity(Long productId) {
		return this.productDao.findProductAvailableQuantity(productId);
	}

	@Override
	@Transactional
	public void updateProductPrice(Long productId, Double updatedPrice) {
		this.productDao.updateProductPrice(productId, updatedPrice);
	}

	@Override
	@Transactional
	public void updateProductQuantity(Long productId, Integer updatedQuantity) {
		this.productDao.updateProductQuantity(productId, updatedQuantity);
	}

}
