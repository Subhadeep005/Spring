package com.codingraja.sunelectronics.order.service.impl;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.codingraja.sunelectronics.order.dao.OrderItemDao;
import com.codingraja.sunelectronics.order.domain.OrderItem;
import com.codingraja.sunelectronics.order.service.OrderItemService;

@Service
public class OrderItemServiceImpl implements OrderItemService {

	@Autowired
	private OrderItemDao orderItemDao;

	@Override
	@Transactional
	public OrderItem findOrderItemById(Long orderItemId) {
		return this.orderItemDao.findOrderItemById(orderItemId);
	}

	@Override
	@Transactional
	public Long saveOrderItem(OrderItem orderItem) {
		return this.orderItemDao.saveOrderItem(orderItem);
	}

	@Override
	@Transactional
	public void delete(Long orderItemId) {
		this.orderItemDao.delete(orderItemId);
	}

	@Override
	public void priceOrderItem(OrderItem paramOrderItem) {
		// TODO Auto-generated method stub

	}

	@Override
	@Transactional
	public void updateOrderItemQuantity(Long orderItemId, Integer quantity) {
		this.orderItemDao.updateOrderItemQuantity(orderItemId, quantity);
	}

	@Override
	@Transactional
	public Set<OrderItem> findOrderItemsByOrderId(Long orderId) {
		return this.orderItemDao.findOrderItemsByOrderId(orderId);
	}

	@Override
	@Transactional
	public Integer findOrderItemQuantity(Long orderItemId) {
		return this.orderItemDao.findOrderItemQuantity(orderItemId);
	}

}
