package com.codingraja.sunelectronics.core.product.dao.impl;

import java.math.BigDecimal;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.codingraja.sunelectronics.catalog.domain.Product;
import com.codingraja.sunelectronics.core.product.dao.ProductDao;

@Repository
public class ProductDaoImpl implements ProductDao {

	@Autowired
	private SessionFactory SessionFactory;

	@Override
	public Long saveNewProduct(Product product) {
		return (long) this.SessionFactory.getCurrentSession().save(product);
	}

	@Override
	public Product findProductById(Long productId) {
		return this.SessionFactory.getCurrentSession().get(Product.class, productId);
	}

	@Override
	public Double findProductPrice(Long productId) {
		Product product = this.SessionFactory.getCurrentSession().get(Product.class, productId);
		if (product != null)
			return product.getPrice().doubleValue();
		return 0.0;
	}

	@Override
	public Integer findProductAvailableQuantity(Long productId) {
		Product product = this.SessionFactory.getCurrentSession().get(Product.class, productId);
		if (product != null)
			return product.getQuantity();
		return 0;
	}

	@Override
	public void updateProductPrice(Long productId, Double updatedPrice) {
		Product product = this.SessionFactory.getCurrentSession().get(Product.class, productId);
		if (product != null) {
			product.setPrice(new BigDecimal(updatedPrice));
			this.SessionFactory.getCurrentSession().update(product);
		}
	}

	@Override
	public void updateProductQuantity(Long productId, Integer updatedQuantity) {
		Product product = this.SessionFactory.getCurrentSession().get(Product.class, productId);
		if (product != null) {
			product.setQuantity(updatedQuantity);
			this.SessionFactory.getCurrentSession().update(product);
		}
	}

}
