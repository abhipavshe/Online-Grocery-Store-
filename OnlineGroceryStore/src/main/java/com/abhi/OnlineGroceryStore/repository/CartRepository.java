package com.abhi.OnlineGroceryStore.repository;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.abhi.OnlineGroceryStore.model.Cart;

import java.util.Optional;

@Repository
@Qualifier("cartRepo")
public interface CartRepository extends JpaRepository<Cart, Long> {
    Optional<Cart> findByUserId(Long userId);
}

