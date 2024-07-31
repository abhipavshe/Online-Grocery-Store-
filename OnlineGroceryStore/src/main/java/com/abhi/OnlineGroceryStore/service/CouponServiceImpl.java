package com.abhi.OnlineGroceryStore.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.abhi.OnlineGroceryStore.model.Coupon;
import com.abhi.OnlineGroceryStore.repository.CouponRepository;

import java.util.List;

@Service
public class CouponServiceImpl implements CouponService {

    @Autowired
    private CouponRepository couponRepository;

    @Override
    public Coupon saveCoupon1(Coupon coupon) {
        return couponRepository.save(coupon);
    }

    @Override
    public Coupon getCouponById(Long id) {
        return couponRepository.findById(id).orElse(null);
    }

    @Override
    public List<Coupon> getAllCoupons() {
        return couponRepository.findAll();
    }

    @Override
    public void deleteCoupon(Long id) {
        couponRepository.deleteById(id);
    }

    @Override
    public Coupon getCouponByCode(String code) {
        return couponRepository.findByCode(code).orElse(null);
    }

	@Override
	public Coupon saveCoupon(Coupon coupon) {
		// TODO Auto-generated method stub
		return null;
	}
}
