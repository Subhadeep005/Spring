package com.codingraja.sunelectronics.order.dao.impl;

import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.codingraja.sunelectronics.core.domain.Customer;
import com.codingraja.sunelectronics.order.dao.OrderDao;
import com.codingraja.sunelectronics.order.domain.Order;
import com.codingraja.sunelectronics.order.domain.OrderItem;
import com.codingraja.sunelectronics.order.domain.OrderItemRequestDto;
import com.codingraja.sunelectronics.order.domain.OrderStatus;
import com.codingraja.sunelectronics.payment.domain.PaymentInfo;

@Repository("orderDao")
public class OrderDaoImpl implements OrderDao {

	private static final Logger LOGGER = Logger.getLogger(OrderDaoImpl.class);

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public Order createNewCartForCustomer(Customer customer) {
		return null;
	}

	@Override
	public Order createNamedOrderForCustomer(String name, Customer customer) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Order findNamedOrderForCustomer(String name, Customer customer) {
		return null;
	}

	@Override
	public Order findOrderById(Long orderId) {
		return this.sessionFactory.getCurrentSession().get(Order.class, orderId);
	}

	@Override
	public Order findCartForCustomer(Customer customer) {
		return null;
	}

	@Override
	public List<Order> findOrdersForCustomer(Customer customer) {
		return null;
	}

	@Override
	public List<Order> findOrdersForCustomer(Customer customer, OrderStatus status) {
		return null;
	}

	@Override
	public List<PaymentInfo> findPaymentInfosForOrder(Order order) {
		return null;
	}

	@Override
	public Order saveOrder(Order order, Boolean priceOrder) {
		Session session = this.sessionFactory.getCurrentSession();
		if (priceOrder) {
			try {
				Order order1 = session.get(Order.class, order.getId());
				order1.setTotalQuantity(order.getTotalQuantity());
				order1.setSubTotal(order.getSubTotal());
				order1.setTotalDiscount(order.getTotalDiscount());
				order.setTotalFulfillmentCharges(order.getTotalFulfillmentCharges());
				order1.setTotal(order.getTotal());

				session.saveOrUpdate(order1);

			} catch (Exception ex) {
				LOGGER.error(ex.getMessage());
			}
		} else {
			session.save(order);
		}
		return session.get(Order.class, order.getId());
	}

	@Override
	public void cancelOrder(Order order) {

	}

	@Override
	public Order getNullOrder() {
		return null;
	}

	@Override
	public Order confirmOrder(Order order) {
		return null;
	}

	@Override
	public Long addItem(OrderItem orderItem) {
		return (Long) this.sessionFactory.getCurrentSession().save(orderItem);
	}

	@Override
	public Order updateItemQuantity(Long orderId, OrderItemRequestDto orderItemRequestDto, boolean priceOrder) {
		return null;
	}

	@Override
	public OrderItem removeItem(Long orderId, Long orderItemId) {
		OrderItem orderItem = this.sessionFactory.getCurrentSession().get(OrderItem.class, orderItemId);
		if (orderItem != null)
			this.sessionFactory.getCurrentSession().delete(orderItem);
		return orderItem;

	}

	@Override
	public Order addItemFromNamedOrder(Order namedOrder, OrderItem orderItem, boolean priceOrder) {
		return null;
	}

	@Override
	public Order addAllItemsFromNamedOrder(Order namedOrder, boolean priceOrder) {
		return null;
	}

	@Override
	public void deleteOrder(Order cart) {

	}

	@Override
	public void printOrder(Order order) {

	}

}
