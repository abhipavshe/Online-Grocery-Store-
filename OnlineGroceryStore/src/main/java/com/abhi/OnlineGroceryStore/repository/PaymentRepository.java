package com.abhi.OnlineGroceryStore.repository;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.abhi.OnlineGroceryStore.model.Payment;

@Repository
@Qualifier("paymentRepo")
public interface PaymentRepository extends JpaRepository<Payment, Long> {
}
