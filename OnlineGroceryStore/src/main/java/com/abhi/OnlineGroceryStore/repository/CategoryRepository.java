package com.abhi.OnlineGroceryStore.repository;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.abhi.OnlineGroceryStore.model.Category;

@Repository
@Qualifier("categoryRepo")
public interface CategoryRepository extends JpaRepository<Category, Long> {
    // Additional custom queries related to categories, if needed
}

