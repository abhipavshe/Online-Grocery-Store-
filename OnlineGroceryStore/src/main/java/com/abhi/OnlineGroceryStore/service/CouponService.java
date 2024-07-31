package com.abhi.OnlineGroceryStore.service;

import java.util.List;

import com.abhi.OnlineGroceryStore.model.Coupon;

public interface CouponService {
    Coupon saveCoupon(Coupon coupon);
    Coupon getCouponById(Long id);
    List<Coupon> getAllCoupons();
    void deleteCoupon(Long id);
    Coupon getCouponByCode(String code);
	Coupon saveCoupon1(Coupon coupon);
}
