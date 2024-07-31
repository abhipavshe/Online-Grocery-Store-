package com.abhi.OnlineGroceryStore.service;

import java.util.List;

import com.abhi.OnlineGroceryStore.model.Order;

public interface OrderService {
    Order saveOrder(Order order);
    Order getOrderById(Long id);
    List<Order> getAllOrders();
    void deleteOrder(Long id);
    List<Order> getOrdersByUserId(Long userId);
	Order saveOrder1(Order order);
}
