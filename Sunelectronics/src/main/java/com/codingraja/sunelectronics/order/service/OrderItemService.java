package com.codingraja.sunelectronics.order.service;

import java.util.Set;

import com.codingraja.sunelectronics.order.domain.OrderItem;

public interface OrderItemService {
	public OrderItem findOrderItemById(Long OrderItemId);

	public Long saveOrderItem(OrderItem orderItem);

	public void delete(Long orderItemId);

	public void priceOrderItem(OrderItem paramOrderItem);

	public void updateOrderItemQuantity(Long OrderItemId, Integer quantity);

	public Set<OrderItem> findOrderItemsByOrderId(Long OrderId);

	public Integer findOrderItemQuantity(Long orderItemId);
}
