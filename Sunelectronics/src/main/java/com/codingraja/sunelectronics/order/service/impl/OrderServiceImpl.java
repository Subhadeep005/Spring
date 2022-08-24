package com.codingraja.sunelectronics.order.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.codingraja.sunelectronics.core.domain.Customer;
import com.codingraja.sunelectronics.order.dao.OrderDao;
import com.codingraja.sunelectronics.order.domain.Order;
import com.codingraja.sunelectronics.order.domain.OrderItem;
import com.codingraja.sunelectronics.order.domain.OrderItemRequestDto;
import com.codingraja.sunelectronics.order.domain.OrderStatus;
import com.codingraja.sunelectronics.order.service.OrderService;
import com.codingraja.sunelectronics.payment.domain.PaymentInfo;

@Service("orderService")
public class OrderServiceImpl implements OrderService {

	@Autowired
	private OrderDao orderDao;

	@Override
	@Transactional
	public Order createNewCartForCustomer(Customer customer) {
		return null;
	}

	@Override
	@Transactional
	public Order createNamedOrderForCustomer(String name, Customer customer) {
		return null;
	}

	@Override
	@Transactional
	public Order findNamedOrderForCustomer(String name, Customer customer) {
		return null;
	}

	@Override
	@Transactional
	public Order findOrderById(Long orderId) {
		return this.orderDao.findOrderById(orderId);
	}

	@Override
	@Transactional
	public Order findCartForCustomer(Customer customer) {
		return null;
	}

	@Override
	@Transactional
	public List<Order> findOrdersForCustomer(Customer customer) {
		return null;
	}

	@Override
	@Transactional
	public List<Order> findOrdersForCustomer(Customer customer, OrderStatus status) {
		return null;
	}

	@Override
	@Transactional
	public List<PaymentInfo> findPaymentInfosForOrder(Order order) {
		return null;
	}

	@Override
	@Transactional
	public Order saveOrder(Order order, Boolean priceOrder) {
		return this.orderDao.saveOrder(order, priceOrder);
	}

	@Override
	@Transactional
	public void cancelOrder(Order order) {

	}

	@Override
	@Transactional
	public Order getNullOrder() {
		return null;
	}

	@Override
	@Transactional
	public Order confirmOrder(Order order) {
		return null;
	}

	@Override
	@Transactional
	public Long addItem(OrderItem orderItem) {
		return this.orderDao.addItem(orderItem);
	}

	@Override
	@Transactional
	public Order updateItemQuantity(Long orderId, OrderItemRequestDto orderItemRequestDto, boolean priceOrder) {
		return null;
	}

	@Override
	@Transactional
	public OrderItem removeItem(Long orderId, Long orderItemId) {
		return this.orderDao.removeItem(orderId, orderItemId);
	}

	@Override
	@Transactional
	public Order addItemFromNamedOrder(Order namedOrder, OrderItem orderItem, boolean priceOrder) {
		return null;
	}

	@Override
	@Transactional
	public Order addAllItemsFromNamedOrder(Order namedOrder, boolean priceOrder) {
		return null;
	}

	@Override
	@Transactional
	public void deleteOrder(Order cart) {

	}

	@Override
	@Transactional
	public void printOrder(Order order) {

	}

}
