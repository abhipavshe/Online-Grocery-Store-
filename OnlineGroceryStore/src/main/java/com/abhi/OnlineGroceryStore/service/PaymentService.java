package com.abhi.OnlineGroceryStore.service;

import java.util.List;

import com.abhi.OnlineGroceryStore.model.Payment;

public interface PaymentService {
    Payment savePayment(Payment payment);
    Payment getPaymentById(Long id);
    List<Payment> getAllPayments();
    void deletePayment(Long id);
	Payment savePayment1(Payment payment);
}
