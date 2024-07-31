package com.abhi.OnlineGroceryStore.repository;

import com.abhi.OnlineGroceryStore.model.UserSubscription;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SubscriptionRepository extends JpaRepository<UserSubscription, Long> {
}
