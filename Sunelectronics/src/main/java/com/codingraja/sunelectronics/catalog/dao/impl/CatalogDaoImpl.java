package com.codingraja.sunelectronics.catalog.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.codingraja.sunelectronics.catalog.dao.CatalogDao;
import com.codingraja.sunelectronics.catalog.domain.Product;

@Repository
public class CatalogDaoImpl implements CatalogDao {

	private SessionFactory sessionFactory;

	@Autowired
	public CatalogDaoImpl(SessionFactory sessionFactory) {
		super();
		this.sessionFactory = sessionFactory;
	}

	@Override
	public Long saveProduct(Product product) {
		return (Long) this.sessionFactory.getCurrentSession().save(product);
	}

	@Override
	public Product findProductById(Long productId) {
		return this.sessionFactory.getCurrentSession().get(Product.class, productId);
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
	public List<Product> findAllProducts() {
		return this.sessionFactory.getCurrentSession().createCriteria(Product.class).list();
	}

	@Override
	public List<Product> findAllProducts(int limit) {
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
	@SuppressWarnings("unchecked")
	public List<Product> findRelatedProductsByCategory(String category) {
		// TODO Auto-generated method stub
		return this.sessionFactory.getCurrentSession().createCriteria(Product.class)
				.add(Restrictions.eq("category", category)).setMaxResults(4).list();
	}

	@Override
	@SuppressWarnings("unchecked")
	public List<Product> findProductByCategoryAndSubcategory(String category, String subCategory) {
		// TODO Auto-generated method stub
		return this.sessionFactory
				.getCurrentSession().createCriteria(Product.class).add(Restrictions
						.and(Restrictions.eq("category", category), Restrictions.eq("subCategory", subCategory)))
				.list();
	}

	@Override
	@SuppressWarnings("unchecked")
	public List<Product> findNewProducts(int limit) {
		return this.sessionFactory.getCurrentSession().createCriteria(Product.class).addOrder(Order.desc("id"))
				.setMaxResults(limit).list();
	}

	@Override
	public List<Product> findPopularProducts(int limit) {
		// TODO Auto-generated method stub
		return null;
	}

}
