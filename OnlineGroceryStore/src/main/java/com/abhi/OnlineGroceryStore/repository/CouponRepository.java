package com.abhi.OnlineGroceryStore.repository;

import com.abhi.OnlineGroceryStore.model.Coupon;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CouponRepository extends JpaRepository<Coupon, Long> {
    Optional<Coupon> findByCode(String code); // Method declaration to find by code
}
