package com.abhi.OnlineGroceryStore.repository;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.abhi.OnlineGroceryStore.model.Review;

import java.util.List;

@Repository
@Qualifier("reviewRepo")
public interface ReviewRepository extends JpaRepository<Review, Long> {
    List<Review> findByProductId(Long productId);
}
