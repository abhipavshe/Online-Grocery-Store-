package com.abhi.OnlineGroceryStore.service;

import java.util.List;

import com.abhi.OnlineGroceryStore.model.Review;

public interface ReviewService {
    Review saveReview(Review review);
    Review getReviewById(Long id);
    List<Review> getAllReviews();
    void deleteReview(Long id);
    List<Review> getReviewsByProductId(Long productId);
	Review saveReview1(Review review);
}
