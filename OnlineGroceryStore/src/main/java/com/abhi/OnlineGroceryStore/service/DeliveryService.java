package com.abhi.OnlineGroceryStore.service;

import java.util.List;

import com.abhi.OnlineGroceryStore.model.Delivery;

public interface DeliveryService {
    Delivery saveDelivery(Delivery delivery);
    Delivery getDeliveryById(Long id);
    List<Delivery> getAllDeliveries();
    void deleteDelivery(Long id);
    List<Delivery> getDeliveriesByStatus(String status);
	Delivery saveDelivery1(Delivery delivery);
}
