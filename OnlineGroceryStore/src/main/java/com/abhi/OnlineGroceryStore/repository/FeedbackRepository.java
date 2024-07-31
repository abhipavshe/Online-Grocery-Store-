package com.abhi.OnlineGroceryStore.repository;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.abhi.OnlineGroceryStore.model.Feedback;

@Repository
@Qualifier("feedbackRepo")
public interface FeedbackRepository extends JpaRepository<Feedback, Long> {
    // Additional custom queries related to customer feedback, if needed
}
