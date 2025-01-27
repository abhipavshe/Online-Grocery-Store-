package com.abhi.OnlineGroceryStore.repository;

import com.abhi.OnlineGroceryStore.model.Promotion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PromotionRepository extends JpaRepository<Promotion, Long> {
}
