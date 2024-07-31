package com.abhi.OnlineGroceryStore.service;
import java.util.List;

import com.abhi.OnlineGroceryStore.model.CartItem;

public interface CartItemService {
    CartItem saveCartItem(CartItem cartItem);
    CartItem getCartItemById(Long id);
    List<CartItem> getAllCartItems();
    void deleteCartItem(Long id);
    List<CartItem> getCartItemsByCartId(Long cartId);
	CartItem saveCartItem1(CartItem cartItem);
}

