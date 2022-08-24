package com.codingraja.sunelectronics.core.product.service;

import com.codingraja.sunelectronics.catalog.domain.Product;

public interface ProductService {
	public Long saveNewProduct(Product product);

	public Product findProductById(Long productId);

	public Double findProductPrice(Long productId);

	public Integer findProductAvailableQuantity(Long productId);

	public void updateProductPrice(Long productId, Double updatedPrice);

	public void updateProductQuantity(Long productId, Integer updatedQuantity);
}
