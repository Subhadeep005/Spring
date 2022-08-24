package com.codingraja.sunelectronics.order.service;

import java.util.List;

import com.codingraja.sunelectronics.core.domain.Customer;
import com.codingraja.sunelectronics.order.domain.Order;
import com.codingraja.sunelectronics.order.domain.OrderItem;
import com.codingraja.sunelectronics.order.domain.OrderItemRequestDto;
import com.codingraja.sunelectronics.order.domain.OrderStatus;
import com.codingraja.sunelectronics.payment.domain.PaymentInfo;

public interface OrderService {
	public Order createNewCartForCustomer(Customer customer);

	public Order createNamedOrderForCustomer(String name, Customer customer);

	public Order findNamedOrderForCustomer(String name, Customer customer);

	public Order findOrderById(Long orderId);

	public Order findCartForCustomer(Customer customer);

	public List<Order> findOrdersForCustomer(Customer customer);

	public List<Order> findOrdersForCustomer(Customer customer, OrderStatus status);

	public List<PaymentInfo> findPaymentInfosForOrder(Order order);

	public Order saveOrder(Order order, Boolean priceOrder);

	public void cancelOrder(Order order);

	public Order getNullOrder();

	public Order confirmOrder(Order order);

	public Long addItem(OrderItem orderItem);

	public Order updateItemQuantity(Long orderId, OrderItemRequestDto orderItemRequestDto, boolean priceOrder);

	public OrderItem removeItem(Long orderId, Long orderItemId);

	public Order addItemFromNamedOrder(Order namedOrder, OrderItem orderItem, boolean priceOrder);

	public Order addAllItemsFromNamedOrder(Order namedOrder, boolean priceOrder);

	public void deleteOrder(Order cart);

	public void printOrder(Order order);
}
