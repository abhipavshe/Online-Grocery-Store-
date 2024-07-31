package com.abhi.OnlineGroceryStore.service;

import java.util.List;

import com.abhi.OnlineGroceryStore.model.Cart;

public interface CartService {
    Cart saveCart(Cart cart);
    Cart getCartById(Long id);
    List<Cart> getAllCarts();
    void deleteCart(Long id);
    Cart getCartByUserId(Long userId);
	Cart saveCart1(Cart cart);
}
